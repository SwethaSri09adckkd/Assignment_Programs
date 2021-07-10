import java.util.*; 
public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int choice;
	System.out.print("Select below options: \n1 decimal to binary \n2 decimal to octal \n3 decimal to hexa \n"); 
	choice = sc.nextInt();
        System.out.print("Enter number : "); 
        int num = sc.nextInt();
	switch(choice)
	{
		case 1: String binary = Integer.toBinaryString(num);
        		System.out.println("Binary Value is : " + binary);
			break;
		case 2: String octal = Integer.toOctalString(num);
        		System.out.println("Octal Value is : " + octal);
			break;
		case 3: String hexa = Integer.toHexString(num);
        		System.out.println("HexaDecimal Value is : " + hexa);
			break;
		default: System.out.println("Please enter right choice");
	}
    }
}