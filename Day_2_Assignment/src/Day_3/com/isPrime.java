package Day_3.com;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean isPrime = true;
        for(int i =2;i<=n-1;i++){
            if(n%2==0){
                isPrime=false;
            }
        }
        if (isPrime== true){
            System.out.println("n is prime");
        }else{
            System.out.println("nis not prime");
        }
        sc.close();
    }
    
}
