import java.util.*;

public class BinaryTOdecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num = 110110111;
        int decimal = convert(num);
        System.out.println(num + "=" + decimal);
    }

  public static int convert( long num){
    int decimalnumber =0,i=0;
    long remainder;
    while(num!=0){
        remainder =num % 10;
        num /=10;
        decimalnumber += remainder*Math.pow(2,i);
        ++i;
 
    } 
    return decimalnumber;
   
}
}