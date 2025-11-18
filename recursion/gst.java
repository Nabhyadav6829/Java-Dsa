package recursion;

public class gst {
    static int[] getprices(int prices[],int index){
        //gst =18%,total price =18%+price[index];
        
        if(index==prices.length){
            int gst[]=new int[prices.length];
            return gst;
        }
        int gst[]=getprices(prices, index+1);
        gst[index]=prices[index]+(int)(prices[index]*0.18);
        return gst;
    }
    public static void main(String[] args) {
        int prices[]={100,200,430,999,7777};
        int newprices[]= getprices(prices,0);
        for(int p:newprices){
            System.out.println(p);
        }
    }
}
