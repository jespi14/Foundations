import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Menu();

    }
    static void Menu(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
        System.out.println("Calculator App 101\n----------------\nPlease choose from the following\n1. Add Two Numbers\n2. Subtract Two Numbers\n3. Multiply Two Numbers\n4. Divide Two Numbers\n5. Modulus Two Numbers\n6. Quit");
            choice = sc.nextInt();
            if(choice<0 || choice>6){
                throw new RuntimeException("Please Select a valid choice");
            }
            //Add
            else if (choice ==1){
                System.out.print("Please the first number: ");
                int num1 = sc.nextInt();
                System.out.print("Please the second number: ");
                int num2 = sc.nextInt();
                System.out.print("The sum is "+sumTwoNums(num1,num2));
                System.out.println();

            }
            //Subtract
            else if (choice==2){
                System.out.print("Please enter the first number: ");
                int num1 = sc.nextInt();
                System.out.print("Please enter the second number: ");
                int num2 = sc.nextInt();
                System.out.print("The difference is "+sub(num1,num2));
                System.out.println();

            }
            //multiply
            else if (choice==3){
                System.out.print("Please enter the first number: ");
                int num1 = sc.nextInt();
                System.out.print("Please enther the second number: ");
                int num2 = sc.nextInt();
                System.out.print("The product is "+multiply(num1,num2));
                System.out.println();


            }
            //divide
            else if (choice ==4){
                System.out.print("Please enter the first number: ");
                float num1 = sc.nextFloat();
                System.out.print("Please enter the second number: ");
                float num2 = sc.nextFloat();
                System.out.print("The quotent is "+divide(num1,num2));
                System.out.println();


            }
            //mod
            else if (choice==5){
                System.out.print("Please enter the first number: ");
                float num1 = sc.nextFloat();
                System.out.print("Please enter the second number: ");
                float num2 = sc.nextFloat();
                System.out.print("The mod is "+modulus(num1,num2));
                System.out.println();


            }
        }while(choice!=6);
    }
    static int sumTwoNums(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    static int sub(int num1,int num2){
        int difference = num1-num2;
        return difference;
    }
    static int multiply(int num1,int num2){
        int product = num1 * num2;
        return product;
    }
    static float divide(float num1, float num2) {
        float quotent;
        if (num2 == 0) {
            System.out.print("You can not divide by zero ");


        }
           quotent = num1 / num2;
        return quotent;

    }
    static float modulus(float num1, float num2 ){
        float mod = num1 % num2;
        return mod;
    }



}
