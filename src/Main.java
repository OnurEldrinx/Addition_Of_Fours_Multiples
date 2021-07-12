import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int input,sum=0;

        System.out.println("Enter an odd number to exit!");
        System.out.println("----------------------------\n");

        System.out.print("Please enter a number:");
        input = scanner.nextInt();
        if (input %4 == 0) sum=sum+input;

        while (input %2 == 0){

            System.out.print("Please enter a number:");
            input = scanner.nextInt();

            if (input %4 == 0) {

                sum = sum + input;


            }


        }

        System.out.println("Result = " +sum);

    }
}
