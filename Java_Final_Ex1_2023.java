
import java.util.Scanner;	

public class Java_Final_Ex1_2023 {
   
    public static void main(String[] args) {
	   
        Scanner input = new Scanner(System.in);
	    int size;
	    do{
    	    System.out.print("Nhập dimension của vector thứ nhất:  ");
    		size = input.nextInt(); 
	    } while (size < 1);

	    int[] vector1 = new int[size];
	    int[] vector2 = new int[size];
	    
	    System.out.println("Nhập vào các giá trị của vector thứ nhất:  ");
	    for (int i = 0; i < size; i++) {
			vector1[i] = input.nextInt();
		}
		System.out.print("vector vừa nhập vào là:  (");
		for (int i = 0; i < size; i++) {
	       if (i != size - 1) {
	           System.out.print(vector1[i] + ", ");
	       } else {
	            System.out.println(vector1[i] + ")");
	       }
	    }
		
		System.out.println("Nhập vào các giá trị của vector thứ hai: ");
		for (int i = 0; i < size; i++) {
			vector2[i] = input.nextInt();
		}
	    System.out.print("vector vừa nhập vào là:  (");
		for (int i = 0; i < size; i++) {
	       if (i != size - 1) {
	           System.out.print(vector2[i] + ", ");
	       } else {
	            System.out.println(vector2[i] + ")");
	       }
	    }
	
	    double cosValue = 0;
	    int norm1 = 0;
	    int norm2 = 0; 
	    int norm3 = 0;
	    for (int i = 0; i < size; i++) {
            norm1 += vector1[i]*vector2[i];
            norm2 += Math.pow(vector1[i],2); 
            norm3 += Math.pow(vector2[i],2);
	    } 
	    cosValue = (double) norm1/(Math.sqrt(norm2) * Math.sqrt(norm3));
	    double angleInRadians = Math.acos(cosValue); 
        double angleInDegrees = Math.toDegrees(angleInRadians); 
        System.out.println("Góc tương ứng với giá trị cosine " + cosValue + " là: " + angleInDegrees + " độ");
	}
}



