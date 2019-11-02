
public class Application {

   public static void main(String[] args) {
      
       DuplicateRemover dp = new DuplicateRemover();
       //writes a text file with unique words from info given
       dp.remove("problem1.txt");
       dp.write("unique_words.txt");
      
   }
}
