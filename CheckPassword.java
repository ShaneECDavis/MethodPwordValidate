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
		pwordcheckdigit(pwordIn);
		
		//Shane Notes:
		bool testBool = pwdCheck(pwordIn);
		
		if(testBool) System.out.println(pwordIn +" Is a valid password ");
		
		else(!testBool) System.out.println(pwordIn + " Is an invalid password ");
			
		
	}
	
	
	// Shane Notes: This one has only one check in it to start. 
	public static bool pwdCheck(String pwdIn){
		if(pwordIn.Length() < 8){
			return false;
		}
		else return true;
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
//comment added here
		//newest part loop sucks, not sure what im doing. try again in AM

		public static void pwordcheckdigit(String passwd) {
			for(int i = 0; i < passwd.length(); i++) {
				if(Character.isLetterOrDigit(passwd.charAt(i) ))
					System.out.println(" Is a valid password");
				
				else {
					System.out.println(" Is not a valid password");
				}
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
