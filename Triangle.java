import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if((A==B)&&(B==C)){
            System.out.println("equilateral");
        }else if((A==B) || (A==C) || (B==C)){ 
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }
    }
}
