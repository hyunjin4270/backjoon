public class Test {
    public static void main(String[] args) {
        String a = "0 1 0 1\n1 1 1 0\n0 0 1 1";
        String[] lineBreaking = a.split("\n");
        for (int i = 0; i < lineBreaking.length; i++) {
            System.out.println(lineBreaking[i]);
        }
        System.out.println((char)('A' + 1));
    }
    
}
