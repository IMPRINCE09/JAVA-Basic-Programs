import java.util.*;

public class HCFofNumber {
    public static void main(String args[]) {
         int num1 = 36;
         int num2 = 60;
        int hcf = 1;

        for(int i=1; i<=num1||i<=num2; i++){
             if(num1 %  i  == 0 && num2 % i  == 0){
                 hcf = i; 
            }
        }
        System.out.println(hcf);
    }
}
