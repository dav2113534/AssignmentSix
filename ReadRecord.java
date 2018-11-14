
// import File, FileNotFoundException and Scanner classes
// import
import java.io.FileNotFoundException;
import java.util.*;

/*---------------------------------------------------------------------------
// AUTHOR: David Palacios           
// SPECIFICATION:   This program is about file i/o
// INSTRUCTIONS:    Read the following code skeleton and add your own code
//                  according to the comments. When you see
//                  //--> that is where you need to add code.
//-------------------------------------------------------------------------*/
public class ReadRecord {
        /*
         * The objective of this program is to read address records from a file that
         * contains 5 address records and extracts just the names and then prints them
         * to the screen. The file is formatted like
         * 
         * Name: <name> Phone Number: <number> Address: <address> ------------ Name:
         * <name> Phone Number: <number> Address: <address> ------------
         */

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String inputFile;

                // instantiate an object of type ReadRecord
                // -->

                // declare an array of strings called names

                // User input will be like address.txt
                // Ask the user for the input file
                // -->
                // -->

                inputFile =

                                // get the list of names from the file
                                names = rr.readNames(inputFile);

                // print the names
                rr.printNames(names);
        }

        // method that returns a String array of names read from the file
        public String[] readNames(String filename)
        {
                String[] names = new String[5];
                String currentLine = "";
                // create an integer named index and initialize it to 0
                //-->
                
                
                try
                {
                        //make a new scanner object that will read from the file
                        
                        
                        //loop as long as the scanner still has contents (use the hasNext method)
                        
                        {
                                //if the current line has "Name" in it, add the name (starts at the 
                                //7th character) to the array and increase the index
                                if(currentLine.contains())
                                {
                                        names[index] = currentLine.substring(6);
                                        iex++;
                                }
                                //read the next line from the file
                                currentLine = in.nextLine();
                        }
                        
                        //print a message saying the address book file is done being read
                        //-->
                        
                        
                }
                 (FileNotFoundException e)
                {
                        // print the exception message
                        //-->
                        
                }
                
                //return the array of names
                return //names;
        }

        public void printNames(String[] names) {
                // print out every element in the array
                // -->

                {
                        System.out.println();
                }
        }
}