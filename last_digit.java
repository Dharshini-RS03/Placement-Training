import java.util.Scanner;

class last_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println("Last digit: " + n % 10);

        sc.close();
    }
}