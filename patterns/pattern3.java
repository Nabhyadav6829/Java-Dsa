


// *****
// *   *
// *   *
// *   *
// *****


package patterns;

public class pattern3 {
    public static void main(String[] args) {
      int n=5;
      for(int rows=1;rows<=n;rows++){
        for(int cols=1;cols<=n;cols++){
          
        
        if(rows==1 || rows==n){
        
            System.out.print("*");
          }
          else if(cols==1||cols==n){System.out.print("*");
            
          }
         else{
           System.out.print(" ");
         }
            
          }
          System.out.println();
    }
        // System.out.println();
      }
      
  }