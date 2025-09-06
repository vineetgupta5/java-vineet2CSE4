import java.util.*;

class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        
        int num = n; 
        int sum=0;
        do{
            int d=n%10;
            
            sum+=d;
            n=n/10;
            
        }while(n!=0);
        System.out.println("The sum of digits is="+sum);
        sc.close();
    }
}
