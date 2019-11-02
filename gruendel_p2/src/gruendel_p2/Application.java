
public class Application {
	  
private static final String INPUT_FILE = "problem2.txt";
private static final String OUTPUT_FILE = "unique_word_counts.txt";
  
public static void main(String[] args) {
	// scans for DuplicateCounter file
	DuplicateCounter duplicateCounter = new DuplicateCounter();
	
	// counts and writes new file with info given from text file
	duplicateCounter.count(INPUT_FILE);
	duplicateCounter.write(OUTPUT_FILE);
}
}