import java.util.*;

class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int c = 0;
        int num = n; 
        do{
            n=n/10;
            c++;
        }while(n!=0);

       

        System.out.println("Length of number " + num + " is: " + c);
        sc.close();
    }
}
