import java.util.Scanner;

public class DigitalSum {
    public static int sumDigits(int n){
        if(n<0){
            return -1;
        }int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }return s;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Digit sum of "+x+" is: "+sumDigits(x));
    }
}
