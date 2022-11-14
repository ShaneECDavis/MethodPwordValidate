import java.util.Scanner;
public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Password at least 8 characters
//		Only letters and digits
//		must contain at least 2 digits
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Create a password. \nIt must contain at least eight characters,"
				+ " \nIt can only contain letters and digits, "
				+ "\nIt must contain at least two digits \nPassword: ");
		String pwordIn = keyboard.nextLine();
		//This is controlling what is output
		
		
		//so far only checking if at least 8 digits
		
		passwd(pwordIn);
		
		
	}
		
		public static void passwd(String pwordIn) {
			if (pwordIn.length() < 8) {
				//for(int i = 0; i < pwordIn.length(); i++) {
				System.out.println(pwordIn + " Is an invalid password ");	
				}
			
			else {
				System.out.println(pwordIn +" Is a valid password ");

}
}
}








//loopForMinMaxNum("Is a valid password");
////is string characters or digits?
//public static boolean loopForMinMaxNum(String pwordIn) {
//	if(pwordIn.length() < 8 ) {
//	for(int i = 0; i < pwordIn.length(); i++) {
//		return false;
//							
//		//System.out.println("This is a valid password");
//		}
//	
//	
//	}
//	return true;