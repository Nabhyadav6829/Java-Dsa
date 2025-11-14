package recursion;

public class printtable {
//without string    
    // static void print(int num,int range,String result){
    //     if(range==0){
    //         // System.out.println(result);
    //         return;
    //     }
    //     print(num,range-1,result);
    //     // result=result+"5*"+range+"="+num*range;
    //     System.out.println(num+"*"+range+"="+num*range);
    // }

// with string
    static String print(int num, int range, String result) {
        if (range == 0) {
            return result;
        }
        result = print(num, range - 1, result);
        return result + num + "*" + range + "=" + (num * range) + "\n";
    }

    public static void main(String[] args) {
        System.out.println(print(7, 10, ""));
    }
}
