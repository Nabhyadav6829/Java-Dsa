package recursion;

public class power {
    public static void main(String[] args) {
        pow(2,5,1);
    }

    static void pow(int num,int power,int result) {
        // base case
        if (power == 0) {
            System.out.println(result);
                    return;
                }
                // recursive call
                pow(num, power - 1, result * num);
    }
}