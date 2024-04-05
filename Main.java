import java.util.*;

public class Main {
  public static void main(String[] args){

    // Create a hashmap mapping characters of DBZ to a fact about them
    HashMap<Character, String> dbzCharacters = new HashMap<Character, String>();
    dbzCharacters.put('G', "Goku-The main protagonist in the DBZ series.");
    dbzCharacters.put('V', "Vegeta-The main protaganist's rival in the DBZ series.");
    dbzCharacters.put('C', "Chichi-The main protagonist's wife in the DZ series.");
      dbzCharacters.put('K', "Krillin-The main protagonist's best friend in the DBZ series.");
      dbzCharacters.put('R', "Roshi-The main protagonist's mentor in the DBZ series.");
//Ask the user which character they want to know a fact about
      Scanner scanner = new Scanner(System.in);
      System.out.println("Which DBZ character do you want to know a fact about? (Enter the first letter of the character's name)");
    char character = scanner.next().charAt(0);

    //Print the fact related to the chosen character
    String fact = dbzCharacters.get(character);
  if(fact != null) {
    System.out.println(fact);
  }else{
    System.out.println("Sorry, I don't have a fact about that character.");
  }
}}//Good Job on the code! 
