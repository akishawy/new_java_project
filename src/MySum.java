import java.util.Scanner;

public class MySum  {
    public static void main(String[] args) {
        System.out.println("Summation Program");
        System.out.println("----------------------------");
        System.out.println("Welcome");
        System.out.println("---------------------------");
        System.out.println("Enter first num");
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter First num");
        int n1 = mysc.nextInt();
        System.out.println("Enter Second num");
        int n2 = mysc.nextInt();
        System.out.println("Sum is:" + sum(n1,n2));
        




    }

    static int sum(int num1, int num2){
        return num1 + num2;

    }
}
