import java.util.Scanner;

class demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int x = sc.nextInt();
        if (x < 0)
            System.out.print("number is negatve");
    }
}