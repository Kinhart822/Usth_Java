import java.util.Scanner;	

public class Java_Final_Ex1_2_2023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    float a, b, c, n, m, x;
        System.out.print("Nhập a (với a là 1 số chẵn):  ");
        a = input.nextFloat(); 
    	System.out.print("Nhập b (với a là 1 số lẻ):  ");
        b = input.nextFloat(); 
    	System.out.print("Nhập c trong tầm 0 đến 1000:  ");
        c = input.nextFloat(); 
        
        if (a % 2 !=0 || b % 2 ==0 || c < 0 || c > 1000) {
            System.out.print("Invalid input.");
        } else {
            System.out.print("Nhập m:  ");
            m = input.nextFloat(); 
    	    System.out.print("Nhập n:  ");
            n = input.nextFloat();
            System.out.printf("=> Ta có một phương trình: %.2f * (x^%.2f) + %.2f * (x^%.2f) + %.2f ", a, n, b, m, c);
            System.out.print(". Hãy nhập x:  ");
            x = input.nextFloat(); 
            float A = a, B = b;
            A *= Math.pow(x,n);
            B *= Math.pow(x,m);
            float total;
            total = A + B + c;
            System.out.printf("=> Kết quả của phương trình trên:  " + total);
        }
    }
}