import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Notifications();
        System.out.println("continue or no ? answer with \"yes or no\"");
        String status = Scanner.nextLine();
        while (status.equals("yes")) {
            String res = reader();
            checkWhatToDo(res);
            System.out.println("continue or no ? answer with \"yes or no\"");
            status = Scanner.nextLine();
        }
        System.out.println("program has just closed");
    }

    public static void Notifications () {
        System.out.println("\n\"in this calculator logically means greater by smaller");
        System.out.println("and unlogically means smaller by greater\"");
        System.out.println();
        System.out.println();
    }

    public static void checkWhatToDo (String topic) {
        if (topic.equals("invalid")) {
            System.out.println("invalid value!!");
            System.exit(0);
        }

        Scanner Scanner = new Scanner(System.in);

        System.out.print("enter your first number : ");
        int num1 = Scanner.nextInt();
        System.out.print("then enter your second number : ");
        int num2 = Scanner.nextInt();

        if (topic.equals("+")) {
            sum(num1 , num2);
        } else if (topic.equals("-")) {
            Subtraction(num1 , num2);
        } else if (topic.equals("*")) {
            multiplication(num1 , num2);
        } else if (topic.equals("/")) {
            devision(num1 , num2);
        } else {
            System.out.println("invalid value!!");
        }
    }

    public static String reader () {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("what do you want to do with numbers : ");
        System.out.println("plz answer with * , + , - , / ");
        System.out.print(" then : ");
        String key = Scanner.nextLine();
        if (key.equals("*") || key.equals("/") || key.equals("-") || key.equals("+")){
            return key;
        }else {
            return "invalid";
        }
    }

    public static void Subtraction (int a , int b) {
        Scanner Scanner = new Scanner(System.in);
        if (a < b) {
            System.out.println("do you want to do this logically or unlogically : ");
            String ans = Scanner.nextLine();
            if (ans.equals("logically")) {
                System.out.println(b - a);
            } else {
                System.out.println(a - b);
            }
        } else {
            System.out.println(a - b);
        }
    }
    public static void sum (int a , int b) {
        System.out.println(a + b);
    }

    public static void devision (float a , float b) {
        Scanner Scanner = new Scanner(System.in);
        float devided = 0;
        if (a < b) {
            System.out.println("do you want to do this logically or unlogically : ");
            String ans = Scanner.nextLine();
            if (ans.equals("logically")) {
                devided = b / a;
                System.out.println(devided);
            } else {
                devided = a / b;
                System.out.println(devided);
            }
        } else {
            devided = a / b;
            System.out.println(devided);
        }
    }

    public static void multiplication (int a , int b) {
        System.out.println(a * b);
    }
}