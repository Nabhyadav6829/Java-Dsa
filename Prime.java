public class Prime {
    public static void main(String[] args) {
        int num = 29; // Example number to check
        int count=0;




//for small numbers
        for(int i=1;i<=num;i++){
            if(num%i==0){       
                count++;
            }
        }
        if(count==2){   
            System.out.println(num+" is a prime number.");
        }else{
            System.out.println(num+" is not a prime number.");
        }



//Medium numbers
        // for(int i=2;i*i<=num;i++){
        //     if(num%i==0){  
        // System.out.println("");      



// sieve of Eratosthenes method

                // boolean isPrime = true;

                // if (num <= 1) {
                //     isPrime = false;
                // } else {
                //     for (int i = 2; i <= Math.sqrt(num); i++) {
                //         if (num % i == 0) {
                //             isPrime = false;
                //             break;
                //         }
                //     }
                // }

                // if (isPrime) {
                //     System.out.println(num + " is a prime number.");
                // } else {
                //     System.out.println(num + " is not a prime number.");
                // }
    }
}
