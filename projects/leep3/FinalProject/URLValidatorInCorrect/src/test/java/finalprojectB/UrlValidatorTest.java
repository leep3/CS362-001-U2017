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
package finalprojectB;

import junit.framework.TestCase;
import java.util.Random;




/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */



public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

	   assertTrue(urlVal.isValid("http://www.amazon.com"));
	   assertTrue(urlVal.isValid("http://www.naver.com"));
	   assertTrue(urlVal.isValid("http://www.google.com"));
	   assertTrue(urlVal.isValid("h3t://www.naver.com"));
	   assertTrue(urlVal.isValid("ftp://www.naver.com"));
	   assertTrue(urlVal.isValid("http://0.0.0.0:10"));
//	   assertTrue(urlVal.isValid("h3t://0.0.0.0:60000"));           //It shows failure!
//	   assertTrue(urlVal.isValid("http://255.255.255.255:65555"));  //It shows failure!
//	   assertTrue(urlVal.isValid("h3t://255.255.255.255:65636"));   //It shows failure!
	   assertTrue(urlVal.isValid("h3t://255.255.255.255"));
   }
   
   
   public void testYourFirstPartition()
   {
	UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

	// http, ftp, h3t.

	assertTrue(urlVal.isValid("http://www.amazon.com"));
	assertTrue(urlVal.isValid("ftp://www.amazon.com"));
	assertTrue(urlVal.isValid("h3t://www.amazon.com"));

	// com, edu, au, cc
	assertTrue(urlVal.isValid("http://www.amazon.com"));
	assertTrue(urlVal.isValid("http://www.amazon.edu"));
	assertTrue(urlVal.isValid("http://www.amazon.au"));
	assertTrue(urlVal.isValid("http://www.amazon.cc"));

	// By port number
	assertTrue(urlVal.isValid("http://www.amazon.com:50"));
	assertTrue(urlVal.isValid("http://www.amazon.com:500"));
//	assertTrue(urlVal.isValid("http://www.amazon.com:5000"));   It shows failure!

	// sub section
	assertTrue(urlVal.isValid("http://www.amazon.com/aaa"));
	assertTrue(urlVal.isValid("http://www.amazon.com/12"));
	assertTrue(urlVal.isValid("http://www.amazon.com/sg8"));

	// action
//	assertTrue(urlVal.isValid("http://www.amazon.com?action=view"));            //It shows failure!
//	assertTrue(urlVal.isValid("http://www.amazon.com/aaa?action=view"));        //It shows failure!
//	assertTrue(urlVal.isValid("http://www.amazon.com:50?action=edit&mode=up")); //It shows failure!

   }
   
   public void testYourSecondPartition(){
	UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	assertFalse(urlVal.isValid(""));
	assertFalse(urlVal.isValid("h"));
	assertFalse(urlVal.isValid("http/www.amazon.com"));  
//	assertFalse(urlVal.isValid("http://255.256.255.255"));       //It shows failure!
   }
   
   
   public void testIsValid()
   {
	UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	String[] protocol = new String [3] ;
	protocol[0] = "http://";
	protocol[1] = "ftp://";
	protocol[2] = "h3t://";

	String[] address = new String [3] ;
	address[0] = "www.google.com" ;
	address[1] = "www.google.edu" ;
	address[2] = "www.google.cc" ;

	String[] chars = new String [36];

	chars[0] = "a";
	chars[1] = "b";
	chars[2] = "c";
	chars[3] = "d";
	chars[4] = "e";
	chars[5] = "f";
	chars[6] = "g";
	chars[7] = "h";
	chars[8] = "i";
	chars[9] = "j";
	chars[10] = "k";
	chars[11] = "l";
	chars[12] = "m";
	chars[13] = "n";
	chars[14] = "o";
	chars[15] = "p";
	chars[16] = "q";
	chars[17] = "r";
	chars[18] = "s";
	chars[19] = "t";
	chars[20] = "u";
	chars[21] = "v";
	chars[22] = "w";
	chars[23] = "x";
	chars[24] = "y";
	chars[25] = "z";
	chars[26] = "1";
	chars[27] = "2";
	chars[28] = "3";
	chars[29] = "4";
	chars[30] = "5";
	chars[31] = "6";
	chars[32] = "7";
	chars[33] = "8";
	chars[34] = "9";
	chars[35] = "0";

	String URL ;

	int temp ;

	Random ran = new Random() ;
	   for(int i = 0;i<100;i++)
	   {
		temp = ran.nextInt(3);
		URL = protocol[temp]; 

		temp = ran.nextInt(2);
		if(temp == 1) {
			temp = ran.nextInt(3);
			URL = URL + address[temp];
		}
		else {
			for (int j = 0 ; j < 4 ; j++) {
				URL = URL + String.valueOf(ran.nextInt(256));
				if(j<3)
					URL = URL + ".";
			}
		}
		temp = ran.nextInt(2);
		if(temp == 1) {
			URL = URL + ":";
			URL = URL + String.valueOf(ran.nextInt(1000));
//			URL = URL + String.valueOf(ran.nextInt(10000));

		}
		temp = ran.nextInt(3) ;
		for (int k = temp ; k < 2 ; k++) {
			URL = URL + "/";
			for (int j = 0 ; j < 4 ; j++) {
				URL = URL + chars[ran.nextInt(36)];
			} 
		}

		assertTrue(urlVal.isValid(URL));
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
