/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 07 08:39:09 GMT 2017
 */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import calendar.CalendarMain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CalendarMain_ESTest extends CalendarMain_ESTest_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      System.setCurrentTimeMillis((-9223372036854775808L));
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        CalendarMain.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         assertThrownBy("calendar.CalendarUtil", e);
      }
  }

  @Test
  public void test1()  throws Throwable  {
      CalendarMain calendarMain0 = new CalendarMain();
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        CalendarMain.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }
}
