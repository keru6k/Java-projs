package guessinggame;
import java.util.*;

public class guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("what's the secret word? ");
        String ans = scan.nextLine();
        
        System.out.print("What's the theme? ");
        String theme = scan.nextLine();
        
        System.out.print("What's the first and last letter? ");
        String hintOne = scan.nextLine();
        
        game(ans, theme, hintOne);
  }
  
  static void game(String ans, String theme, String hintOne) {
      Scanner scan2 = new Scanner(System.in);
      System.out.println("Guess: [Usage: -hints for Hints]");
      System.out.print(">  ");
      String bla = scan2.nextLine();
      
      if (bla.equals(ans)) {
          System.out.println("Congratulations! You are correct!");
          System.exit(0);
      }
      else if (bla.equals("-hints")) {
          System.out.println("Hints are:");
          System.out.println("Theme: " + theme);
          System.out.println("First and Last letter: " + hintOne);
          System.out.println("Length of word: " + ans.length());
          game(ans, theme, hintOne);
      }
      else {
          System.out.println("Wrong!");
          game(ans, theme, hintOne);
      }
      
  }
}
