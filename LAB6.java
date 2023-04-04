import java.io.*;
import java.util.*;
class LAB6{
    public static void vowel(){
        String fileName = "C:/Users/pande/Downloads/text.txt";
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int character;
            while ((character = bufferedReader.read()) != -1) {
                char c = (char) character;
                if (c == 'a' || c == 'A') {
                    aCount++;
                } else if (c == 'e' || c == 'E') {
                    eCount++;
                } else if (c == 'i' || c == 'I') {
                    iCount++;
                } else if (c == 'o' || c == 'O') {
                    oCount++;
                } else if (c == 'u' || c == 'U') {
                    uCount++;
                }
            }
            bufferedReader.close();
        } catch(Exception ex){
                System.out.println(ex.getMessage());
                 }
        System.out.println("---VOWELS---");
        System.out.println("A: " + aCount);
        System.out.println("E: " + eCount);
        System.out.println("I: " + iCount);
        System.out.println("O: " + oCount);
        System.out.println("U: " + uCount);
    }
    public static void digit(){
        try {
            // Open the file for reading
            String fileName = "C:/Users/pande/Downloads/text.txt";
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            int c;

            // Initialize an array to store the count of each digit
            int[] count = new int[10];

            // Read the file character by character
            while ((c = reader.read()) != -1) {
                // Check if the character is a digit
                if (Character.isDigit(c)) {
                    // Increment the count of the corresponding digit
                    count[c - '0']++;
                }
            }

            // Print the count of each digit
            System.out.println("---COUNT EVERY DIGIT---");
            for (int i = 0; i < 10; i++) {
                System.out.println(i + ": " + count[i]);
            }

            // Close the reader
            reader.close();

        } catch(Exception ex){
            System.out.println(ex.getMessage());
             }
    }
    public static void count(){
        try {
            // Open the file for reading
            FileReader fileReader = new FileReader("C:/Users/pande/Downloads/text.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // Initialize an array to store the count of each word
            int[] count = new int[5];
            String[] words = new String[5];

            // Read the file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words
                String[] wordsInLine = line.split("\\s+");
                
                // Count the occurrence of each word
                for (String word : wordsInLine) {
                    // Ignore words that are shorter than 3 characters
                    if (word.length() < 3) {
                        continue;
                    }
                    // Check if the word is one of the top five most repeated words
                    for (int i = 0; i < 5; i++) {
                        if (words[i] == null || words[i].equals(word)) {
                            count[i]++;
                            words[i] = word;
                            break;
                        }
                    }
                }
            }

            // Print the top five most repeated words
            System.out.println("---TOP REPEATED WORDS---");
            for (int i = 0; i < 5; i++) {
                if (words[i] != null) {
                    System.out.println(words[i] + ": " + count[i]);
                }
            }

            // Close the reader
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void least(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/pande/Downloads/text.txt"));
            String line;
            String[] words = new String[1000];
            int[] counts = new int[1000];
            int wordCount = 0;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    words[wordCount] = word;
                    wordCount++;
                }
            }
            for (int i = 0; i < wordCount; i++) {
                counts[i] = 0;
                for (int j = 0; j < wordCount; j++) {
                    if (words[i].equals(words[j])) {
                        counts[i]++;
                    }
                }
            }
            System.out.println("---LEAST REPEATED WORDS---");
            for (int i = 0; i < 5; i++) {
                int minCount = Integer.MAX_VALUE;
                int minIndex = -1;
                for (int j = 0; j < wordCount; j++) {
                    if (counts[j] < minCount) {
                        minCount = counts[j];
                        minIndex = j;
                    }
                }
                if (minIndex != -1) {
                    System.out.println(words[minIndex] + ": " + counts[minIndex]);
                    counts[minIndex] = Integer.MAX_VALUE;
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public static void repchar(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/pande/Downloads/text.txt"));
            int[] counts = new int[256];
            int charCount = 0;
            int c;
            while ((c = br.read()) != -1) {
                charCount++;
                counts[c]++;
            }
            System.out.println("---TOP REPEATED CHARACTERS---");
            for (int i = 0; i < 5; i++) {
                int maxCount = 0;
                int maxIndex = -1;
                for (int j = 0; j < 256; j++) {
                    if (counts[j] > maxCount) {
                        maxCount = counts[j];
                        maxIndex = j;
                    }
                }
                if (maxIndex != -1) {
                    System.out.println((char) maxIndex + ": " + maxCount);
                    counts[maxIndex] = 0;
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public static void leastchar(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/pande/Downloads/text.txt"));
            int[] counts = new int[256];
            int charCount = 0;
            int c;
            while ((c = br.read()) != -1) {
                charCount++;
                counts[c]++;
            }
            System.out.println("---LEAST REPEATED CHARACTERS---");
            for (int i = 0; i < 5; i++) {
                int minCount = charCount;
                int minIndex = -1;
                for (int j = 0; j < 256; j++) {
                    if (counts[j] > 0 && counts[j] < minCount) {
                        minCount = counts[j];
                        minIndex = j;
                    }
                }
                if (minIndex != -1) {
                    System.out.println((char) minIndex + ": " + minCount);
                    counts[minIndex] = charCount + 1;
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public static void additional(){
        System.out.println("************ADDITIONAL TASK***********");
        File file = new File("C:/Users/pande/Downloads/htmlFile (1).txt");
        try {
            FileInputStream inputStream = new FileInputStream(file);

            // Initialize character counts
            int openBrackets = 0;
            int closeBrackets = 0;
            int forwardSlash = 0;

            // Read the file character by character
            int c;
            while ((c = inputStream.read()) != -1) {
                char ch = (char) c;
                if (ch == '<') {
                    openBrackets++;
                } else if (ch == '>') {
                    closeBrackets++;
                } else if (ch == '/') {
                    forwardSlash++;
                }
            }

            // Close the file input stream
            inputStream.close();

            // Display the character counts
            System.out.println("Character counts:");
            System.out.println("< : " + openBrackets);
            System.out.println("> : " + closeBrackets);
            System.out.println("/ : " + forwardSlash);

        } catch (IOException e) {
            // Handle the exception
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    public static void additional2(){
        String wordToFind = "name"; 
        int count = 0;
        File file = new File("C:/Users/pande/Downloads/htmlFile (1).txt"); 

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToFind)) { // use equalsIgnoreCase to make the comparison case-insensitive
                        count++;
                    }
                }
            }
            System.out.println("The word \"" + wordToFind + "\" appears " + count + " times in the file.");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        LAB6 lb=new LAB6();
        lb.vowel();
        lb.digit();
        lb.count();
        lb.least();
        lb.repchar();
        lb.leastchar();
        lb.additional();
        lb.additional2();
    }

}
