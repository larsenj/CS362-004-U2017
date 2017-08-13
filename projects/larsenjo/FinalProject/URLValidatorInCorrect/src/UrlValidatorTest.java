/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import junit.framework.TestCase;
import java.util.Random;

/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase 
{
    private static int MAX_TESTS = 20;//number of iterations to run of testIsValid
    private int numParts = 2; //total number of parts

    private boolean printStatus = false;
    private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

    //establish the patterns
        //ASCII patterns
        

        //URL patterns


        //schemes
        String validScheme[] = {"http://", "ftp://"}; 
        String invalidScheme[] = {"hppt://", "ftp::/"};

        //authority
        String validAuthority[] = {"www.google.com", "123.123.123.123"};
        String invalidAuthority[] = {".abc@", "!@#"};

        //path
   
   
        //query
   
   
        //fragment

    public UrlValidatorTest(String testName) 
    {
        super(testName);
    }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   
	   
   }
   
   //tests that should pass 
   public void testYourFirstPartition()
   {
        //instantiate the validator 
        UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
        
        //build the url to test from random valid parts
        String url = "";
        Random rand = new Random();
        int scheme = rand.nextInt(validScheme.length);
        int auth = rand.nextInt(validAuthority.length);
        url = validScheme[scheme] + validAuthority[auth];
        
        //print out the url and test if valid
        System.out.print(url + " :  ");
	    System.out.println(urlVal.isValid(url));
    
   }


   
   //tests that should fail
   public void testYourSecondPartition()
   {
        //instantiate the validator 
        UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
        
        //build the url to test from random valid parts
        String url = "";
        Random rand = new Random();
        int whichInvalid = rand.nextInt(numParts);
        int scheme;
        int auth;

        switch(whichInvalid)
        {
            case 0:
                scheme = rand.nextInt(invalidScheme.length);
                auth = rand.nextInt(validAuthority.length);
                url = invalidScheme[scheme] + validAuthority[auth];
            case 1:
                scheme = rand.nextInt(validScheme.length);
                auth = rand.nextInt(invalidAuthority.length);
                url = validScheme[scheme] + invalidAuthority[auth];
        }
        
        //print out the url and test if valid
        System.out.print(url + " :  ");
	    System.out.println(urlVal.isValid(url));
    
 
   }
   
   
   public void testIsValid()
   {
        for(int i = 0;i < MAX_TESTS; i++)
	    {
            if (i == 0)
               System.out.println("***** The folowing URLs should test as valid *****");

            if(i == MAX_TESTS/2)
               System.out.println("***** The folowing URLs should test as invalid *****");

            if(i < MAX_TESTS/2)
               testYourFirstPartition();
            else
               testYourSecondPartition();
	   }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
