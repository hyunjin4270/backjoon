import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        double m = in.nextInt();
        System.out.println((int)(((n+m)/2) * (Math.abs(m-n)+1)));
        
    }
}
