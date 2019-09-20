/* Vanessa Martin
 * Data Structures MW9 
 * Assignment 1
 */




package uniqueChar;
import java.util.Scanner;
import java.io.File;




public class uniqueChar {


        public static void main(String[] args) throws Exception {
                Scanner scan = new Scanner(new File("C:\\Users\\Vanessa\\Desktop\\words.txt"));
                String word; 
                
                
                while(scan.hasNext()) {
                        word = scan.next();
                        isUnique(word);
                        sortWord(word);
                        System.out.println( );
                        
                        
                }
                scan.close();
                
        }
        
public static boolean isUnique(String x) {
                
        for(int i = 0; i < x.length() - 1; i++) {
                
                for (int j = i + 1; j < x.length(); j++) {
                        if( x.charAt(i) == x.charAt(j)) {
                                System.out.print("false\t");
                                
                                return false;
                                
                        }
                        
                }
                
        }
        System.out.print("true\t" );


        return true;
        }


public static void sortWord(String word) {
        word.toLowerCase();
        char [] wordArray = word.toCharArray();
        
          int size = wordArray.length; 
      for (int i = 1; i < size; ++i) { 
          char key = wordArray[i]; 
          int j = i - 1; 


          while (j >= 0 && wordArray[j] > key) { 
              wordArray[j + 1] = wordArray[j]; 
              j = j - 1; 
          } 
          wordArray[j + 1] = key;
        
        
}
      
      for(int z = 0; z < wordArray.length ; z++) {
              System.out.print(wordArray[z]);
              


              
              
      }
      System.out.println( );
}
}