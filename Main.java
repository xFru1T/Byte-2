import java.util.Scanner;
class SumByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print byte number: ");
        byte num = scanner.nextByte();
        if (num % 2 == 0) {
            System.out.println("The number is even: ");
            }
        else {
            System.out.println("The number is not even");
            }
        }
    }
