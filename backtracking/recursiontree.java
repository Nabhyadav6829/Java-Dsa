package backtracking;

public class recursiontree {
    static void tree(int num){
        if(num<=0){
            return;
        }
        System.out.println("pre call"+ num);
        tree(num-1);
        System.out.println("between call"+ num);
        tree(num-2);
        System.out.println("after second call"+ num);
        tree(num-3);
        System.out.println("after third call"+ num);
        tree(num-4);
        System.out.println("last call"+ num);
    }
    public static void main(String[] args) {
        tree(5);
    }
}
