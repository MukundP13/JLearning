//Write a program that asks the user for numbers. If the number is negative (smaller than zero),
// the program prints for user "Unsuitable number" and asks the user for a new number.
// If the number is zero, the program exits the loop.
// If the number is positive, the program prints the number to the power of two.

import java.util.Scanner;

public class ContinueBreak {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int myn = scanner.nextInt();
            if(myn==0){
                break;
            }else if(myn<0){
                System.out.println("Unsuitable number");
                continue;
            }
            System.out.println(myn*myn);
        }
    }
}
