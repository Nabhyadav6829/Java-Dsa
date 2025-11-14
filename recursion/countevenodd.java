package recursion;

public class countevenodd {
    public static void main(String[] args) {
        count(100, 0, 0);
    }

    static void count(int range, int evencount, int oddcount) {
        if (range <=0) {
            System.out.println(evencount + " " + oddcount);
            return;
        }
        if (range % 2 == 0) {
            count(range - 1, evencount + 1, oddcount);
        } else {
            count(range - 1, evencount, oddcount + 1);
        }

    }
}
