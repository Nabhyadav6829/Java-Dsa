
//rotate a number: we have to rotate a number by d digits for ex- number=123456 d=1 output=612345, d=2 output=561234 ,
// dont use array or string for this question

public class rotateanumber {
    public static void main(String[] args) {
        int rotations = 2;
        int number = 123456;
        // method 1 //ek ek kre ho rhe hai rotations
        int copy1 = number;
        int totaldigits1 = 0;
        while (copy1 > 0) {
            copy1 /= 10;
            totaldigits1++;// 6 ayaga total
        }

        while (rotations > 0) {
            int x = number % 10;
            number /= 10;
            rotations--;
            number+=x*Math.pow(10, totaldigits1-1);
        }
        System.err.println(number);

        // method 2 //saare rotaions ek saath

        int rotations2 = 2;
        int totaldigits = 0;
        int number2 = 123456;
        int copy = number2;
        while (copy > 0) {
            copy /= 10;
            totaldigits++;// 6 ayaga total
        }
        int n = Math.powExact(10, rotations2);
        int x = (number2 % n);
        number2 /= n;
        x *= Math.powExact(10, totaldigits - rotations2);// digit-rotations
        System.out.println(x + number2);

    }
}
