## 백준 3035번: 스캐너
**문제 링크 : [바로가기](https://www.acmicpc.net/problem/3035)**<br>
**깃 아이디: hyunjin4270**

----

![](https://velog.velcdn.com/images/hyunjin4270/post/7a8259b4-3b65-4937-8db9-783ff46356f8/image.png)
이번 문제는 입력받은 패턴의 크기를 입력받은 배수만큼 확대를 시켜 출력을 시키는 문제다. 어떤 식으로 확대되는 방식인지 알면 해결하기 쉬운 문제라 브론즈1 문제지만, 필자는 이 문제를 풀 때 많은 난항을 겪었다.
필자는 문제를 풀 때 중요하게 여기는 것이 있다.
>1. 클린코드 이어야 할것
>2. 객체지향언어의 장점을 살릴 것
>3. 유지보수성, 확장성, 유연성이 좋을 것

이러한 특징을 살리면서 문제를 해결한다. 구구절절 설명하지 않고, 코드부터 봐보자.

----

### 개선과정
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static void printPattern(StringBuilder pattern) {
        System.out.println(pattern);
    }

    interface ShapeConversion {
        void changeShape(Pattern pattern);
    }

    static class Increase implements ShapeConversion {

        @Override
        public void changeShape(Pattern pattern) {
            StringBuilder changedPattern = new StringBuilder();
            for (int i = 0; i < (pattern.getHeight() * pattern.getChangeHeightValue()); i++) {
                for (int j = 0; j < (pattern.getWidth() * pattern.getChangeWidthValue()); j++) {
                    changedPattern.append(pattern.patternInformation[i / pattern.getChangeHeightValue()].charAt(j / pattern.getChangeWidthValue()));
                }
                changedPattern.append("\n");
            }
            printPattern(changedPattern);
        }
    }
    static class Pattern {
        private final int width;
        private final int height;
        private final int changeWidthValue;
        private final int changeHeightValue;

        private final String[] patternInformation;
        Pattern(String information) throws IOException {
            StringTokenizer st = new StringTokenizer(information);
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());
            changeHeightValue = Integer.parseInt(st.nextToken());
            changeWidthValue = Integer.parseInt(st.nextToken());
            patternInformation = new String[height];
            setPatternInformation();
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getChangeWidthValue() {
            return changeWidthValue;
        }

        public int getChangeHeightValue() {
            return changeHeightValue;
        }

        void setPatternInformation() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < height; i++) {
                patternInformation[i] = br.readLine();
            }

        }
        void changeShape(ShapeConversion shapeConversion) {
            shapeConversion.changeShape(this);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = new Pattern(br.readLine());
        pattern.changeShape(new Increase());
    }
}
```
> **실행결과**
>   >**입력**<br>
>   >3 3 1 2<br/>
>   >.x.<br>
>   >x.x<br>
>   >.x.
>

#### 문제발생
출력결과가 나오기는 커녕 출력이 나와야되는 상황에 입력이 남아있는 상황이 되었다. 저상태로 엔터를 3번 쳤더니 StringIndexOutOfBoundsException이 발생했다.
> **StringIndexOutOfBoundsException이란?**
>* 이 예외는 인덱스가 음수이거나 문자열의 크기보다 큰 경우를 나타내기 위해 발생한다.
>* 일반적으로 문자열에서 유효하지 않은 인덱스에 있는 문자에 접근하려고 할 때 발생한다.
 
 손으로 하나하나 입력했을 때는 제대로 된 출력결과가 나왔으나, 입력사항을 복사 후 붙여넣기 하였을 때 이러한 예외가 발생했다.
 
 #### 오류확인

 패턴의 모양을 저장하는 pattern.patternInformation이 정상적으로 들어간 것을 확인하기 위해
 setPatternInformation() 메서드의 가장 마지막 줄에 System.out.println(Arrays.toString(patternInformation));을 기입해주었다. 
 ```java
void setPatternInformation() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < height; i++) {
        patternInformation[i] = br.readLine();
    }
    System.out.println(Arrays.toString(patternInformation));
}
```
> **실행결과**
>   >**입력**<br>
>   >3 3 1 2<br/>
>   >.x.<br>
>   >x.x<br>
>   >.x.<br>
>   >1<br>
>   >2
>
>   >**출력**<br>
>   >[,1,2]<br>
>   >StringIndexOutOfBoundsException발생

결과처럼 문제를 붙여넣기 후 다음줄로 가기위한 엔터와, 1, 2가 PatternInformation에 들어간 것을 확인 할 수 있었다.

#### 오류범위 좁히기
그럼 오류범위를 알기위해 처음 입력이 예정되어있는 3 3 1 2를 확인하기 위해 Pattern 생성자 안에 각각의 변수를 출력해주었다.
```java
Pattern(String information) throws IOException {
    StringTokenizer st = new StringTokenizer(information);
    height = Integer.parseInt(st.nextToken());
    System.out.println(height);
    width = Integer.parseInt(st.nextToken());
    System.out.println(width);
    changeHeightValue = Integer.parseInt(st.nextToken());
    System.out.println(changeHeightValue);
    changeWidthValue = Integer.parseInt(st.nextToken());
    System.out.println(changeWidthValue);
    patternInformation = new String[height];
    setPatternInformation();
}
```
> **실행결과**
>   >**입력**<br>
>   >3 3 1 2<br/>
>   >.x.<br>
>   >x.x<br>
>   >.x.<br>
>
>   >**출력**<br>
>   >3<br>
>   >3<br>
>   >1<br>
>   >2<br>
>
>   >**입력**<br>
>   >1<br>
>   >2<br>
>   >3<br>
>
>   >**출력**<br>
>   >[1,2,3]<br>
>   >StringIndexOutOfBoundsException발생

3 3 1 2의 정보는 제대로 들어간 것이 확인되었다. 그럼 패턴문양이 들어가지 않았다는 것을 확인 할 수 있었다. 이밖에도 여러 시행착오를 겪으며 정확한 문제가 무엇인지 알아냈다.

#### 오류원인발견
코드에서 패턴 정보를 읽어들이는 부분에서 문제가 발생한 것이다.
Pattern클래스의 setPatternInformation메서드가 입력패턴의 정보를 제대로 읽어들이지 못하는 이유는 생성자에서 첫 번째 줄(높이, 너비, 변경 값)의 정보를 읽은 후 BufferedReader를 다시 사용하기 때문이다. 첫 번째 줄 정보를 읽을 때 사용된 BufferedReader와 패턴 정보를 읽을 때 사용된 BufferedReader가 다르기 떄문에 패턴 정보를 읽어들이지 못하는 문제가 발생한 것이였다.

이를 해결하기 위한 방법으로 Main에 선언된 BufferedReader변수를 setPatternInformation에 매개변수로서 가져오는 방법을 이용했다.
```java
Pattern(BufferedReader bufferedReader) throws IOException {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());
            changeHeightValue = Integer.parseInt(st.nextToken());
            changeWidthValue = Integer.parseInt(st.nextToken());
            patternInformation = new String[height];
            setPatternInformation(bufferedReader);
        }

         void setPatternInformation(BufferedReader br) throws IOException {
            for (int i = 0; i < height; i++) {
                patternInformation[i] = br.readLine();
            }
        }

        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = new Pattern(br);
        pattern.changeShape(new Increase());
    }
```
BufferedReader를 매개변수로 가지는 대신, 전역변수로 BufferedReader를 선언하고 이용하는 방법도 생각했지만, 이렇게되면 전역변수로서의 단점이 생겨 프로그램의 구조가 덜 명확해져, 매개변수로서 받는 방법을 사용했다.

----
### 최종코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static void printPattern(StringBuilder pattern) {
        System.out.println(pattern);
    }

    interface ShapeConversion {
        void changeShape(Pattern pattern);
    }

    static class Increase implements ShapeConversion {

        @Override
        public void changeShape(Pattern pattern) {
            StringBuilder changedPattern = new StringBuilder();
            for (int i = 0; i < (pattern.getHeight() * pattern.getChangeHeightValue()); i++) {
                for (int j = 0; j < (pattern.getWidth() * pattern.getChangeWidthValue()); j++) {
                    changedPattern.append(pattern.patternInformation[i / pattern.getChangeHeightValue()].charAt(j / pattern.getChangeWidthValue()));
                }
                changedPattern.append("\n");
            }
            printPattern(changedPattern);
        }
    }
    static class Pattern {
        private final int width;
        private final int height;
        private final int changeWidthValue;
        private final int changeHeightValue;

        private final String[] patternInformation;
        Pattern(BufferedReader bufferedReader) throws IOException {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());
            changeHeightValue = Integer.parseInt(st.nextToken());
            changeWidthValue = Integer.parseInt(st.nextToken());
            patternInformation = new String[height];
            setPatternInformation(bufferedReader);
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getChangeWidthValue() {
            return changeWidthValue;
        }

        public int getChangeHeightValue() {
            return changeHeightValue;
        }

        void setPatternInformation(BufferedReader br) throws IOException {
            for (int i = 0; i < height; i++) {
                patternInformation[i] = br.readLine();
            }
        }
        void changeShape(ShapeConversion shapeConversion) {
            shapeConversion.changeShape(this);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = new Pattern(br);
        pattern.changeShape(new Increase());
    }
}
```
1. Pattern의 정보가 담겨있는 Pattern클래스를 생성 후, 정보를 기입하면 높이와 너비, 변경 값과 모양을 저장해준다.
2. changeShape()메서드를 통해 pattern의 정보를 이용하여 Increase클래스의 기능을 사용해 확대한다.

2줄로만 설명이 가능할 정도로 로직이 간단한 문제였다. 
하지만 만약 여기서 축소하는 기능까지 구현하고 싶을 때, ShapeConversion을 상속받은 축소기능이 담긴 클래스를 만들어주기만하면 이외의 다른 새로운 기능을 구현하지 않고도 바로 사용이 가능하다는 장점을 가지고 있다.

#### Chat-GPT를 통한 개선사항
>**관찰사항**
> - 클래스와 인터페이스 사용:
>   - ShapeConversion인터페이스와 Increase클래스는 패턴을 변환하는 작업을 잘 정의하고 있다.<br>
>   - Pattern클래스는 패턴 정보를 캡슐화하고 입력을 읽고 변환을 처리해준다.
> - BufferedReader를 통한 입력처리:
>   - BufferedReader를 사용하여 출력 패턴을 빌드하는 것은 효율적이며 반복적인 문자열 연결의 오버헤드를 피할 수 있다.
> 
> **개선 제안**
> - 예외 처리:
>   - 정수를 파싱할 때 발생할 수 있는 NumberFormatException또는 입력을 읽을 때 발생할 수 있는 IOExeption에 대한 예외처리를 할 수 없다. try-catch블록을 추가하거나 예외를 적절히 전파하여 견고성을 향상시킬 수 있다.
> - 메서드 및 변수 이름 지정:
>   - setPatternInformation메서드는 목적을 더 잘 반영하도록 readPatternInformation으로 이름을 변경할 수 있다.
>   - 변수 이름인 patternInformation, changeWidthValue 및 changeHeightValue는 설명적이지만, pattern, scaleWidth 및 scaleHeight로 줄일 수 있다.
> - 코드 주석:
>   - 패턴 변환 루프와 같은 복잡한 섹션에 로직을 설명하는 주석을 추가하면 코드 가독성이 향상된다.
> - 루프 최적화:
>   - Increase클래스의 중첩 루프는 더 작은 메서드로 로직을 나누어 가독성을 높일 수 있다.
> - StringBuilder 사용:
>   - 최종 StringBuilder객체는 줄마다 새로운 줄을 추가하는 대신 한번의 append메서드 호출로 처리해야 한다.
> 
> **Chat-GPT의 수정코드**
> ```java
> import java.io.BufferedReader;
> import java.io.IOException;
> import java.io.InputStreamReader;
> import java.util.StringTokenizer;
> 
> public class Main {
>     static void printPattern(StringBuilder pattern) {
>         System.out.print(pattern);
>     }
> 
>    interface ShapeConversion {
>        void changeShape(Pattern pattern);
>    }
>
>    static class Increase implements ShapeConversion {
>        @Override
>        public void changeShape(Pattern pattern) {
>            StringBuilder changedPattern = new StringBuilder();
>            int newHeight = pattern.getHeight() * pattern.getScaleHeight();
>            int newWidth = pattern.getWidth() * pattern.getScaleWidth();
>
>            for (int i = 0; i < newHeight; i++) {
>                for (int j = 0; j < newWidth; j++) {
>                    char originalChar = pattern.getPatternInformation()[i / pattern.getScaleHeight()].charAt(j / pattern.getScaleWidth());
>                    changedPattern.append(originalChar);
>                }
>                changedPattern.append('\n');
>            }
>            printPattern(changedPattern);
>        }
>    }
>
>    static class Pattern {
>        private final int width;
>        private final int height;
>        private final int scaleWidth;
>        private final int scaleHeight;
>        private final String[] patternInformation;
>
>        Pattern(BufferedReader bufferedReader) throws IOException {
>            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
>            height = Integer.parseInt(st.nextToken());
>            width = Integer.parseInt(st.nextToken());
>            scaleHeight = Integer.parseInt(st.nextToken());
>            scaleWidth = Integer.parseInt(st.nextToken());
>            patternInformation = new String[height];
>            readPatternInformation(bufferedReader);
>        }
>
>        public int getWidth() {
>            return width;
>        }
>
>        public int getHeight() {
>            return height;
>        }
>
>        public int getScaleWidth() {
>            return scaleWidth;
>        }
>
>        public int getScaleHeight() {
>            return scaleHeight;
>        }
>
>        public String[] getPatternInformation() {
>            return patternInformation;
>        }
>
>        void readPatternInformation(BufferedReader br) throws IOException {
>            for (int i = 0; i < height; i++) {
>                patternInformation[i] = br.readLine();
>            }
>        }
>
>        void changeShape(ShapeConversion shapeConversion) {
>            shapeConversion.changeShape(this);
>        }
>    }
>
>    public static void main(String[] args) {
>        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
>            Pattern pattern = new Pattern(br);
>            pattern.changeShape(new Increase());
>        } catch (IOException e) {
>            e.printStackTrace();
>        }
>    }
>}
>```

----

### 결론

이번 문제를 해결하면서 BufferedReader로 발생할 수 있는 예외를 전부 Throws해줬는데 예외처리를 통해 처리하게끔 정리를 연습해야되고, 아직 입출력스트림부분의 지식이 부족하다는 것을 느꼈다.
사실 전부 아는 것은 아니지만 이정도로만 알고있어도 괜찮을 것이다 생각하고 있었다.
하지만 지금까지 아는 분야에서 나온 문제를 직면했을 때 학습이 아직 부족하다는 것을 느꼈다. 만약 이처럼 아는분야에서의 문제가 아닌, 모르는 분야에서의 문제가 나오지 않도록 더욱 증진해야된다.