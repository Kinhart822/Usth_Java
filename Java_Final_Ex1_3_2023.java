import java.util.Scanner;

public class Java_Final_Ex1_3_2023 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int size;
		do {
		    System.out.print("Number of elements:  ");
		    size = input.nextInt();
		    while (size <= 0) {
		        System.out.print("Invalid number. Please enter a number greater than 0: ");
		        size = input.nextInt();
		    }
		} while (size <= 0);

	    float[] array = new float[size];

	    for (int i = 0; i < size; i++) {
	    	array[i] = input.nextFloat();
	    }

	    System.out.print("Original Array: [");
	    	for (int i = 0; i < size; i++) {
	            if (i != size - 1) {
	                System.out.print(array[i] + ", ");
	            } else {
	                System.out.println(array[i] + "]");
	            }
	        }

	    for (int i = 0; i < array.length; i++) {
            int count = 1;
            boolean isCounted = false;
	    	for (int j = 0; j < i; j++) {
	    		if (array[i] == array[j]) {
                    isCounted = true;
                    break;
	            }	
	        }
            if (isCounted) {
                continue;
            }
	    	for (int j = i + 1; j < array.length; j++) {
	    		if (array[i] == array[j]) {
                    count++;
	            }	
	        }
            if (count > 1) {
                System.out.println(array[i] + " – " + count + " times");
            }
	    }
    }
}
