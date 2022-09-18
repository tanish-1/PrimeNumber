# PrimeNumber
import java.util.*;
public class Main
{      
  #function to calculate prime
    public static void CalculatePrime(int a){
    #logic
        int count = 0;
        for(int i = 1; i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2)
             System.out.println("Prime");
             
             else
              System.out.println("Not prime ");
    }
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number : ");
	  int a = sc.nextInt();
	  CalculatePrime(a);
	 sc.close();
	}
}
