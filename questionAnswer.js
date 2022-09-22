// question and answer using switch-case

import java.util.*;

public class quesAns {
	public static void main(String[] argv) {
		int score = 0;
		Scanner inpt = new Scanner(System.in);
		System.out.print("Who was the first greek philosopher "); // case sensitive
		String ansOne = inpt.nextLine();
		
		System.out.print("What Chopin Nocturne is the most beautiful? ");
		String ansTwo = inpt.nextLine();
		
		System.out.print("What was MLK (Martin Luther King) known for? ");
		String ansThr = inpt.nextLine();
		
		System.out.print("What philosophy did Lucius Seneca follow? ");
		String ansFou = inpt.nextLine();
		
		System.out.print("Do you bing chilling? ");
		String ansFiv = inpt.nextLine();
		
		switch (ansOne) {
			case("Thales"):
				++score;
		}
		
		switch (ansTwo) {
			case("Nocturne in G Major"):
				++score;
		}
		
		switch (ansThr) {
			case("i have a dream speech"):
				++score;
		}
		
		switch (ansFou) {
			case("Stoicism"):
				++score;
		}
		
		switch (ansFiv) {
			case("china"):
				++score;
		}
		
		System.out.println("You Scored " + score + " out of 5.");
		if (score > 3) {
			System.out.println("Congratulations!");
			inpt.close();
			System.exit(0);
		}
		else {
			System.out.println("Too bad. Better luck next time!");
			inpt.close();
			System.exit(0);
		}
	}
}
