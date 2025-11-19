package strings;

public class Reversestrings {
    static String reverse(String str) {
       if(str.length()==0){
        return "";
       }
        String a=reverse(str.substring(1, str.length()) );
        char b=str.charAt(0);
        return a+b;
    }
    static String revereseappraoch2(String str){
        return twopointers(str.toCharArray(), 0, str.length()-1);
    }
    static String twopointers(char arr[],int left,int right){
        if(left>right){
            return new String(arr);
        }
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        return twopointers(arr, left+1, right-1);

    }
    public static void main(String[] args) {
        System.out.println(reverse("abcd") );
        System.out.println(revereseappraoch2("abcd") );
    }
}
