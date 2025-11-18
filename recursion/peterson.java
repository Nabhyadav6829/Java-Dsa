package recursion;

public class peterson {
    public static void main(String[] args) {
        int org=146;
        int r=peterson(org,org);
        System.out.println(r);
        System.out.println(org==r?"peterson number":"not peterson number");
        peterson(org, 0, org);
    }
    static void peterson(int num,int sum,int org){
        if(num==0){
            if(sum==org){
                System.out.println("peterson");
            }
           else System.out.println(sum);
            return;
        }
        peterson(num/10,fact(num%10)+sum,org);
    }

    static int peterson(int num,int org){
        if(num==0){
            return 0;
        }
        return fact(num%10)+peterson(num/10,org);
    }
    
    static int fact(int num){
        if(num==0){
            return 1;
        }
        return num*fact(num-1);
    }
}
