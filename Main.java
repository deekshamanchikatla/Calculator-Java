import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
	    int a = sc.nextInt();
		System.out.print("Enter second number:");
	    int b = sc.nextInt();
		 System.out.print("Enter operation (+, -, *, /, %):");
	    char Operation = sc.next( ).charAt(0);;
	    switch (Operation){
	        case '+':
	            System.out.println("Answer = " +(a + b));
	            break;
	       case '-':
	           System.out.println("Answer = " +(a - b));
	           break;
	       case '*':
	           System.out.println("Answer = " +(a * b));
	           break;
           case '/':
                if (b == 0) {
                System.out.println("Cannot divide by zero");
                }
	           else {
                  System.out.println("Answer = " + (a / b));
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Cannot find remainder when divisor is 0");
                } 
	            else {
                   System.out.println("Answer = " + (a % b));
                }
                break;
	       default:
	           System.out.println("Invalid");
	           
	            
	    }
	}
}