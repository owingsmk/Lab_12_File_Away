import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int lines = 0; // lines holds the number of lines in the file set lines to 0
        int words = 0; // words holds the number of words in the file set words to 0
        int characters = 0; // characters holds the number of characters in the file set characters to 0
        File inputFile; // input holds the File instance of the file

                JFileChooser aJFileChooser = new JFileChooser(); // use JFileChooser to get the name of the input file
                                                         // make an instance of JFileChooser and save it to aJFileChooser
                int result = aJFileChooser.showSaveDialog(new JPanel()); // call showSaveDialog of
                                                                 //   aJFileChooser and use a new
                                                                 //   instance of JPanel as parameter
                                                                 //   save result to result
                if (result == JFileChooser.APPROVE_OPTION) { // if result is APPROVE_OPTION of JFileChooser
                inputFile = aJFileChooser.getSelectedFile(); //   file is selected
                                                             //   call getSelectedFile of aJFileChooser and save it to inputFile
            } else{
                System.out.println("Error: no input file selected"); //   otherwise no file selected display error message and end program
                return;
            }

            Scanner aScanner = new Scanner(inputFile);
            while (aScanner.hasNextLine()) {

                String line = aScanner.nextLine(); // call nextLine if aScanner and save it to line
                ++lines; // wordsArray holds the words in a line
                String[] wordsArray = line.split(" "); // call split with space as delimiter and save it to line
                for (int ctr = 0; ctr < wordsArray.length; ++ctr) {// increment lines go through each element of wordsArray using ctr as index

                    if ((wordsArray[ctr] != null) &&
                            (wordsArray[ctr].length() > 0)) {
                        ++words;
                    }
                }

                characters += line.length();
            }

                    aScanner.close();

                            System.out.println("The name of the file: " + inputFile.getName());
                            System.out.println("Number of lines in the file: " + lines);
                            System.out.println("Number of words in the file: " + words);
                            System.out.println("Number of characters in the file: " + characters);
                          }



    }
}