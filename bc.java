// This is a simple code that asks for the value of each bit in a byte then calculates the value of the byte and displays it


package bitcalc;

	public class bc
	{

		public static void main (String [] Args){
			
			// Declares variables for each bit
			int bit1 = 0;
			int bit2 = 0;
			int bit3 = 0;
			int bit4 = 0;
			int bit5 = 0;
			int bit6 = 0;
			int bit7 = 0;
			int bit8 = 0;
			
			
			// Declares variables to hold the value of the bit if turned on
			int byte1 = 0;
			int byte2 = 0;
			int byte3 = 0;
			int byte4 = 0;
			int byte5 = 0;
			int byte6 = 0;
			int byte7 = 0;
			int byte8 = 0;
			
			
			// Asks the user if each bit is turned on or off
			java.util.Scanner scanner = new java.util.Scanner(System.in);
			System.out.print("Please enter the value for the first bit (0 or 1):");
			bit1 = scanner.nextInt();
			//scanner.close();
			
			java.util.Scanner scanner2 = new java.util.Scanner(System.in);
			System.out.print("Please enter the value for the second bit (0 or 1):");
			bit2 = scanner.nextInt();
			//scanner.close();
			
			java.util.Scanner scanner3 = new java.util.Scanner(System.in);
			System.out.print("Please enter the value for the third bit (0 or 1):");
			bit3 = scanner.nextInt();
			//scanner.close();
			
			java.util.Scanner scanner4 = new java.util.Scanner(System.in);
			System.out.print("Please enter the value for the fourth bit (0 or 1):");
			bit4 = scanner.nextInt();
			//scanner.close();
			
			java.util.Scanner scanner5 = new java.util.Scanner(System.in);
			System.out.print("Please enter the value for the fifth bit (0 or 1):");
			bit5 = scanner.nextInt();
			//scanner.close();
			
			java.util.Scanner scanner6 = new java.util.Scanner(System.in);
			System.out.print("Please enter the value for the sixth bit (0 or 1):");
			bit6 = scanner.nextInt();
			//scanner.close();
			
			java.util.Scanner scanner7 = new java.util.Scanner(System.in);
			System.out.print("Please enter the value for the seventh bit (0 or 1):");
			bit7 = scanner.nextInt();
			//scanner.close();
			
			java.util.Scanner scanner8 = new java.util.Scanner(System.in);
			System.out.print("Please enter the value for the eigth bit (0 or 1):");
			bit8 = scanner.nextInt();
			//scanner.close();
			
			if (bit1 ==1)
			
				byte1 = 128;
			
			if (bit2 ==1)
			{
				byte2 = 64;
			}
			if (bit3 ==1)
			{
				byte3 = 32;
			}
			if (bit4 ==1)
			{
				byte4 = 16;
			}
			if (bit5 ==1)
			{
				byte5 = 8;
			}
			if (bit6 ==1)
			{
				byte6 = 4;
			}
			if (bit7 ==1)
			{
				byte7 = 2;
			}
			if (bit8 ==1)
			{
				byte8 = 1;
			}
			
			System.out.print("The value of your byte is: ");
			System.out.println(byte1+byte2+byte3+byte4+byte5+byte6+byte7+byte8);
			System.out.print("Your byte looks like: ");
			
			
			System.out.print(bit1);
			System.out.print(bit2);
			System.out.print(bit3);
			System.out.print(bit4);
			System.out.print(bit5);
			System.out.print(bit6);
			System.out.print(bit7);
			System.out.println(bit8);
		}
	}