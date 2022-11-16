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
		
//		boolean temp = passwd(pwordIn) ;
		
		System.out.println(passwd(pwordIn) + ": " + pwordIn);
		
		//passwd(pwordIn);
//		pwordcheckdigit(pwordIn);
		
	}
	//so far only checking if at least 8 digits
	//checking if is digit and is letter
	public static String passwd(String pwordIn) {
		
		int count = 0;
		String validMessage = "Is valid!";
		String notValidMessage = "Is not valid";
		String errorMessage = "";
		
		if(pwordIn.length() < 8) {
			errorMessage += "Needs to have more then 8 characters. ";
		//	return notValidMessage;
		}

		for(int i = 0; i < pwordIn.length(); i++) {
			if(!Character.isLetterOrDigit(pwordIn.charAt(i))){
				errorMessage += "Cannot have any special characters. ";
		//		return notValidMessage;
			}
			if(Character.isDigit(pwordIn.charAt(i)))
				count++;
		}

		if(count < 2) {
			errorMessage += "Must contain at least 2 numbers";
	//		return notValidMessage;
		}

		if(!errorMessage.isEmpty())
			return "Not a valid password because: " + errorMessage;
						
		return validMessage;
	}
	
}

		
//		public static void passwd(String pwordIn) {
//			if (pwordIn.length() < 8) {
//				
//				
//				//for(int i = 0; i < pwordIn.length(); i++) {
//				System.out.println(pwordIn + " Is an invalid password ");	
//				
//				
//				}
//			
//			else {
//				for(int i = 0; i < pwordIn.length(); i++) {
//					if(Character.isLetterOrDigit(pwordIn.charAt(i) ))
//						System.out.println(" Is a valid password");
//					
//					else {
//						System.out.println(" Is not a valid password");
//						break;
//					}
//					
//					
//				}
//				
//				}
//			System.out.println(pwordIn +" Is a valid password ");
//}
//}
//comment added here
		//newest part loop sucks, not sure what im doing. try again in AM

//		public static void pwordcheckdigit(String passwd) {
//			for(int i = 0; i < passwd.length(); i++) {
//				if(Character.isLetterOrDigit(passwd.charAt(i) ))
//					System.out.println(" Is a valid password");
//				
//				else {
//					System.out.println(" Is not a valid password");
//				}
//}
//		}
//}
// valid = 12abcdef
// ! valid = 1abcdefg
// ! valid = @1abcdef
//! valid = @abcdefg

//else {
//System.out.println(" Is not a valid password");
//}




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