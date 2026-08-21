import java.util.Scanner;

class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;
        int divisor = 1;

        while (temp > 0) {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        if (square % divisor == n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");

        sc.close();
    }
}