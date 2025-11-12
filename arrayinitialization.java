import java.util.ArrayList;

public class arrayinitialization {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);//default capacity is 10, double size when exceeded, need nhi hoti lekin iski
        list.add(10);
        list.add(20);   


        //method 1
        int[] arr=new int[3];
        arr[0]=10;
        arr[1]=20;  
        arr[2]=30;

        //method 2
        int[] arr2={10,20,30};

        //method 3
        int[] arr3=new int[]{10,20,30,40,50};
        
        //method 4
        int arr4[]={10,20,30,40,50,60};

        //method 5
        int arr5[]=new int[]{10,20,30,40,50};


        //printing array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //second method to print array
        for(int num:arr){
            System.out.println(num);
        }
    }
}
