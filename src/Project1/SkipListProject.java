package Project1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * < MUST add honor pledge here >
 */

/**
 * The class containing the main method, the entry point of the application. It
 * will take a command line file argument which include the commands to be read
 * and creates the appropriate SkipList object and outputs the correct results
 * to the console as specified in the file.
 *
 * @author <your_name>
 * @version <version_no>
 */
@SuppressWarnings("unused")
public class SkipListProject {
	/**
	 * The entry point of the application.
	 *
	 * @param args The name of the command file passed in as a command line
	 *             argument.
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Invalid file. No filename in command line arguments");
			return;
		}
			
		// takes the first command line argument and opens that file
		String filename = args[0];
		
		// TODO: write code to open the file with Scanner class 
		// and scan each line

	}
	
}
