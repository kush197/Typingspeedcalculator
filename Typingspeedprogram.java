import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Typingspeedprogram {
	
	static String[] words = {"envelop","cantelop","the","hello","microphone",
	                "elephant","biscuit","microscope","ambassador","mind"};		
	

	public static void main(String[] args)  throws InterruptedException {
		 
	   System.out.println("3");
	   TimeUnit.SECONDS.sleep(1);
	    
	   System.out.println("2");
	   TimeUnit.SECONDS.sleep(1);
	   
	   System.out.println("1");
	   TimeUnit.SECONDS.sleep(1);

	   Random rand = new Random();
	   for(int i= 0; i < 10; i++)
	       System.out.print(words[rand.nextInt(9)] + " ");
	
	   System.out.println();

	   double start = LocalTime.now().toNanoOfDay();
	   
	   Scanner scan = new Scanner(System.in);
	   String typedWords = scan.nextLine();
       
	   double end = LocalTime.now().toNanoOfDay();
	   double elaspedTime = end - start;
	   double seconds = elaspedTime /  1000000000.0;
       System.out.println(seconds);
       int numChars = typedWords.length();
       // {x characters / 5) / 1min = y WPM
       int wpm = (int) ((((double) numChars / 5)	/ seconds) * 60);
	
       System.out.println("Your wpm is "+wpm + "!");   
	}
}	
    