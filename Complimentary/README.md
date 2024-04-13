# Complimentary

### Question
#### Two¡¯s complement is used to express negative numbers in binary. For example, the value 30 in signed 8- bit binary is 00011110, and the signed 8-bit two¡¯s complement representation of -30 is 11100010. An easy way to convert from 00011110 to 11100010 is simply reverse 00011110 to become 11100001, and then add 1, which produces 11100010.

#### Your job is to read in two positive integers, express them in 8-bit signed binary, then their negative values in two¡¯s complement, and then the difference between the two in 8-bit signed binary.

#### For example, the difference between 30 and 18 is 12, which in 8-bit signed binary is 00001100, or if you subtract 18 ? 30, you get -12, which in two¡¯s complement (signed 8-bit) is the reverse of 00001100 + 1, or 11110011 + 1, or 11110100.

### Input
#### Several pairs of positive integers X and Y, each pair on one line, with 0

### Output
#### For each pair of values, five 8-bit signed strings, representing X, Y, -X, -Y, and X-Y, with a blank line following each output set.

####  Example Input
#### 30 18
#### 18 30
#### 100 50
#### 0 0

### Example Output

#### 30 = 00011110 <br/> 18 = 00010010 <br/> -30 = 11100010 <br/> -18 = 11101110 <br/> 12 = 00001100
#### 18 = 00010010 <br/> 30 = 00011110 <br/> -18 = 11101110 <br/> -30 = 11100010 <br/> -12 = 11110100
#### 100 = 01100100 <br/> 50 = 00110010 <br/> -100 = 10011100 <br/> -50 = 11001110 <br/> 50 = 00110010

 link: https://www.acmicpc.net/problem/26512

