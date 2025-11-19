package strings;

public class searchandreplace {
    static String searchandr(String str,char search,char replace){
        if(str.length()==0){
            return "";
        }
        String t;
        if(str.charAt(0)==search){
             t=replace+searchandr(str.substring(1), search, replace);
        }
        else{
           t=str.charAt(0)+searchandr(str.substring(1), search, replace);
        }
        return t;
    }
    public static void main(String[] args) {
        System.out.println(searchandr("Hello", 'l', 'x'));
    }
}
