package recursion;

public class armstrong {
    public static void main(String[] args) {
        
        System.out.println(countarmstrong(10000));
    }
    static boolean armstrong(int num,int org,int sum,int td){
        if(num==0){
            return sum == org;
        }
        int ld=num%10;
        sum+=power(ld,td);
        return armstrong(num/10,org,sum,td);
    }
    static int countarmstrong(int range){
        if(range==0){
            return 0;
        }
        boolean result =armstrong(range,range, 0, countdigit(range));
        int c=countarmstrong(range-1);
        if(result){
            c++;
        }
        return c;
    }
    

    static int power(int number,int x){
        if(x==0){
            return 1;
        }
        return number*power(number,x-1);
    }

    static int countdigit(int num){
        if(num==0){
            return 0;
        }
        return countdigit(num/10)+1;

    }
}
