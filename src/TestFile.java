/**
 * Created by rickus on 10/1/17.
 */

/*class tests the file which will be used for the game to ensure it meets the following:
    1 The file contains 3 lines no more no less
    2 each line has 8 coordinates
    3 each coordinate is in the following format (x,x) where x is a placeholder for an interger
    4 there are no spaces between coordinates

    class as readfile method which acts on the test

    readfile returns 0 if file passes tests returns 1 if file fails tests
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestFile {
    private File file;

    // constructor takes test file location as a string

   public TestFile(String testFile){
       file = new File(testFile);
   }

   public int readfile(){
       String pattern = "(\\(\\d+,\\d+\\)){8}";
       Pattern r = Pattern.compile(pattern);

       // checks to see if file exists
       try {

           Scanner sc = new Scanner(file);
           int count = 0;
               while(sc.hasNextLine()) {
                   count++;
                   String line = sc.next();
                   Matcher m = r.matcher(line);
                   if(!m.find()){
                       System.out.println("file improperly formated use (x,x) x placeholder for interger. must have 8 coordinates. No spaces between coordinates");
                       return 1;
                   }
                   sc.nextLine();
               }
               if(count < 3){
                   System.out.print("file has less than 3 lines file must contain three lines");
                   return 1;
               }
               if(count > 3){
                   System.out.println("file has greater than 3 lines file must contain three lines");
                   return 1;
               }

       } //try

       catch (FileNotFoundException e){
           System.out.println("file not found");
       }

       return 0; //test pass

   } //readfile close


} // close class
