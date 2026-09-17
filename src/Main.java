/*******************************
 * Name: Max
 * Class: ICS3U
 * Date:Friday Sept 18
 * Project Name: MadLibs
 * 
 * Project Description
 * You will read in multiple entries from the user and store the results in variables
 * You will then insert those variables into the following story to create a MadLib style result
 * 
 * A recent survey informs us that one out of every PLURALNOUN1 owns a/an ADJECTIVE1 phone. 
 * Fortunately, VERB_ING_1 over a mobile NOUN1 in recent years has improved ADVERB1. 
 * Today, BODY_PART1-held PLURALNOUN2 are all the rage. 
 * In restaurants, you find many PLURALNOUN3 talking ADVERB2 into their ADJECTIVE2 phones as they eat their NOUN2. 
 * NUMBER1 percent of American PLURALNOUN4 place their NOUN3 calls from their cars as they are VERB_ING_2 to and from their home, office, or NOUN4. 
 * Walking and talking are now the “in” NOUN5 to do. 
 * Over NUMBER2 percent of Americans walk our ADJECTIVE3 streets with a handheld PLURALNOUN5 pressed against their BODYPART2.
 * 
 * Ask for the capitalized words in the input. Print out the full story in the output.
 * See https://www.thewordfinder.com/wordlibs/story/41/ for an example.
 ********************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// YOUR CODE GOES HERE!!!!
		System.out.println("Give me a noun thats a food");
		String Noun = in.nextLine();
		System.out.println("Give me a number 0-100");
		String Num = in.nextLine();
		System.out.println("Give me a food");
		String Food = in.nextLine();
		System.out.println("Give me another number");
		String Num2 = in.nextLine();
		System.out.println("Give me another food");
		String Food2 = in.nextLine();
		System.out.println("Give me an adjective");
		String Adj = in.nextLine();
		System.out.println("Give me a violent verb ending with ING");
		String Verb = in.nextLine();
		System.out.println("Give me another verb (no ING)");
		String Verb2 = in.nextLine();
		System.out.println("Give me a past tense verb that deals with leaving");
		String Verb3 = in.nextLine();
		System.out.println("Give me a final number");
		String Num3 = in.nextLine();
		System.out.println("I was walking to the restaurant when I saw the new " +Noun+ " info plaque, it read; Did you know that " +Num+ "% of Canadians are upset about the price of this food? When I got into the restaurant I ordered " +Food+ " the waiter brought me " +Num2+  " of them! Before I left I ended up eating some " +Food2+ " When I left I saw a " +Adj+ " person " +Verb+ " another person. I decided to " +Verb2+ ". After this I went home where I " +Verb3+ " for " +Num3+ " hours.");
		
		
		
		
		
		
		
		
		
		in.close();//Don't forget to clean up after yourselves!
	}

}
