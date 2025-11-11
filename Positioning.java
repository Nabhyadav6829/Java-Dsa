// The code maps each digit’s position (from right to left) into the place value defined by the digit itself.

// In other words:

// “The xth position (from right) of the original number becomes the value placed at the 10^(x-1) position in the new number.”

// It’s like swapping digits with their positions — every digit of the original number acts as a new power index for its position.


//no digit repeat
//swap digit and position
public class Positioning {
    public static void main(String[] args) {
        int number=15324;
        //105324
        int position=1;
        int ans=0;
        while(number>0){
            int x=number%10;
            number/=10;
            ans+=position*Math.powExact(10,x-1);
            position++;
    }
    System.out.println(ans);
}
}
