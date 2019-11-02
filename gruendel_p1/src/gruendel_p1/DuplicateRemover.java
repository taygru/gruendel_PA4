import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// create a class called DuplicateRemover
public class DuplicateRemover {

   private Set<String> uniqueWords;

   public DuplicateRemover() {

       uniqueWords = new HashSet<>();
   }

   public void remove(String dataFile) {

       try {
           Scanner scan = new Scanner(new File(dataFile));

	       while (scan.hasNext()) {
	    	   		// scan and add unique words
	               uniqueWords.add(scan.next());
	           }
	           
	       		scan.close();
	       } 
	       
	       catch (FileNotFoundException e) {
	           System.out.println(e);
	       }
	
	   }

   public void write(String outputFile) {
       try {
           PrintWriter pt = new PrintWriter(new File(outputFile));

           for (String string : uniqueWords) {

               pt.println(string);
           }
           
           pt.flush();
           pt.close();
       
       } 
      
       catch (FileNotFoundException e) {
       	
    	   System.out.println(e);
       }
   }
}
