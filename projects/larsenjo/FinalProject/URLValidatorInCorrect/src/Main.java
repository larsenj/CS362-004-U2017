/*
 * A file that contains a main function because this assignment is poorly
 * explained, so I'm just guessing this is what needs to be done.
 */
import java.util.*;

public class Main   
{
    public static void main(String[] args)
    {
        String a = new String("URL Testing");
        UrlValidatorTest urlTest = new UrlValidatorTest(a); 
    
        //base test - if "http://www.amazon.com" is valid
        System.out.print("Base test, http://www.amazon.com : ");
        urlTest.testManualTest();

        //for debugging
        //urlTest.testYourFirstPartition();
        //urlTest.testYourSecondPartition();
        
        //run the tests
        urlTest.testIsValid();

    }//end main

}//end class
