import java.util.*;

public class loginSystem {
	public static void reg() {
		Scanner regScan = new Scanner(System.in);
		
		System.out.println("-----Register Page-----");
		System.out.print("Username: ");
		String userInput = regScan.nextLine();

		
		System.out.print("Password: ");
		String passInput = regScan.nextLine();
		System.out.println("Register Success!");
		loginCheck(userInput, passInput);
		
	}
	static void loginCheck(String userInput, String passInput) {
		Scanner logScan = new Scanner(System.in);
		
		System.out.println("-----Login Page-----");
		System.out.print("Username ");
		String loginInput = logScan.nextLine();
		
		System.out.print("Password? ");
		String pwInput = logScan.nextLine();
		
		
		if (loginInput.equals(userInput) && pwInput.equals(passInput)) {
			System.out.println("Login Success!");
		}
		else {
			System.out.println("Wrong Username/password. Please try again.");
			loginCheck(userInput, passInput);
		}
		
	}
	public static void main(String[] args) {
		reg();
	}
}
