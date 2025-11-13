//    *   
//   * *  
//  * * * 
// * * * *



package patterns;

public class pattern5 {
    public static void main(String[] args) {
        int mid = 3;
        int left = 3;
        int right = 3;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 7; j++){
                if(j == mid){
                    if(i % 2 == 0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(j >= left && j <= right){
                        if(i % 2 == 1){
                            if(j % 2 == 0){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }else{
                            if(j % 2 == 1){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            left--;
            right++;
            System.out.println();
        }
    }
}
