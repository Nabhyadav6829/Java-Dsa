package recursion;

public class arrayissortedornot {
    static boolean issorted(int arr[],int index){
        if(index>=arr.length){
            return true;
        }
        if(arr[index-1]>arr[index]){
            return false;
        }
        return issorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={10,90,100,200,1};
        System.out.println(issorted(arr,1));
    }
}
