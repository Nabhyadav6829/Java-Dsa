package recursion;

public class powerreturn {
    public static void main(String[] args) {
        int result = pow(2, 5);
        System.out.println(result);
    }

    static int pow(int num, int power) {
        if (power == 0) {
            return 1;
        }
        int smallResult = pow(num, power - 1);
        int result = smallResult * num;
        return result;
    }
}