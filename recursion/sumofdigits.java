package recursion;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(sum(9890));
    }
    static int sum(int n){
        if(n==0) return 0;
        int x=n%10+sum(n/10);
        return x;
    }
}
