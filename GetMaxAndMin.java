package nandini;
import java.util.Scanner;
public class GetMaxAndMin {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than zero.");
            return;
        }

        int[] array = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);



}

}


