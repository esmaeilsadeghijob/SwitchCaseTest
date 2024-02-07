import java.util.Scanner;

public class SwitchCaseTest {


	public static void main(String[] arg){		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = input.nextInt();
		String size;

		switch(num){
			case 29:	
			case 30:
			case 32:
			case 34:
			case 36:
			case 38:
			case 40:
				size = "Small";
				break;
			case 42:
			case 44:
				size = "Medim";
                                break;
			case 46:
				size = "Large";
                                break;
			case 48:
			case 50:
			case 52:
				size = "Extra Large";
                                break;
			default:
				size = "Unknown";
                                break;

		}
		System.out.println("Size: " + size);
	}


}
