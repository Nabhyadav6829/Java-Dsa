package recursion;

public class findoccurance {

    static int count(int arr[], int index, int search, int c) {
        if (index >= arr.length) {
            return c;
        }
        if (arr[index] == search) {
            c++;
        }
        return count(arr, index + 1, search, c);
    }

    static int[] find(int arr[],int index,int search){
        if(index==arr.length){
            int n=count(arr,0,search,0);
            int f[]=new int[n];
            return f;
        }
        int f[]=find(arr,index+1,search);
        int pos=0;
        if(arr[index]==search){ 
            while (pos<f.length && f[pos]==0){
                pos++;
            }
             f[pos-1]=index;
        }
        
        return f;
    }


    // static int[] findhelper(int arr[],int index,int search,int count){
    //     if(index==arr.length){
    //        int result[]=new int[count];
    //           return result;
    //     }
    //     int result[];
    //     if(arr[index]==search){
    //         result=findhelper(arr, index+1, search, count+1);
    //         result[count]=index;
    //     }
    //     else{
    //         result=findhelper(arr, index+1, search, count);

    //     }
    //     return result;
    //     }

    //     static int[] find(int arr[],int index,int search){
    //         return findhelper(arr, index, search, 0);
    //     }


    public static void main(String[] args) {
        int arr[]={10,20,10,90,10,100,10,88,10};
        int result[]=find(arr,0,10);
        for(int r:result){
            System.out.println(r);
        }
    }
}
