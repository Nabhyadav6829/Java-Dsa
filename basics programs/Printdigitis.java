
//for number 12345 we have to print 1 2 3 4 5 each in new line in same order


public class Printdigitis {
    public static void main(String[] args) {
        
        //first method
        //yeh for non zero numbers ke liye hai(hr term 1-9)
        int num = 12345;
        int copy=num;
        int digits=0;
        while(copy>0){
            digits++;
            copy/=10;
        }
        int divisor = (int) Math.pow(10, digits - 1);
        while(num>0){
            System.out.println(num/divisor);
            num%=divisor;
            divisor/=10;
        }
        
        
        
        
        
        //second method
        // int num = 12345;
        // int num2 = 0;
        //  while (num > 0) {
        //     int digit = num% 10;
        //     num/= 10;
        //     num2 = num2* 10+ digit;
        // }
        // while (num2 > 0) {
        //     int digit = num2 % 10;
        //     System.out.println(digit);
        //     num2 = num2 / 10;
        // }
    }
}
