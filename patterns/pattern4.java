
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 


package patterns;

public class pattern4 {
    public static void main(String[] args) {
      int n=5;
        int k=1 ;
      for(int rows=1;rows<=n;rows++){
        for(int cols=1;cols<=n;cols++){
        if(cols<=rows){
            System.out.print(k+++" ");
          }
          }
          System.out.println();
    }
        // System.out.println();
      }
      
  }