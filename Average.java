package nandini;


	import java.util.Scanner;

	public class Average {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();

	        double[] array = new double[size];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextDouble();
	        }

	        double sum = 0;
	        for (double num : array) {
	            sum += num;
	        }

	        double average = sum / size;

	        System.out.println("The average is: " + average);
		}

	}


