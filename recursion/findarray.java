package recursion;

public class findarray {
    static boolean isfound(int arr[],int index,int searchvalue){
        if(index>=arr.length){
            return false;
        }
        if(arr[index]==searchvalue){
            return true;
        }
        return isfound(arr, index+1, searchvalue);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(isfound(arr, 0, 50)?"found":"not found");
    }
}
