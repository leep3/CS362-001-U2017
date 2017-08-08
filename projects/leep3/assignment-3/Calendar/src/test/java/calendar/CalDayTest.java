package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		CalDay calDay = new CalDay() ;
		System.out.println(calDay);
		assertFalse(calDay.isValid());
		assertEquals(null, calDay.iterator());
	 }

// Code Added


  @Test
  public void test101()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.isValid();
  }

  @Test
  public void test102()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getYear();
  }

  @Test
  public void test103()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.year = (-2143);
      calDay0.getYear();
  }

  @Test
  public void test104()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getMonth();
  }

  @Test
  public void test109()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = (-1);
      calDay0.getMonth();
  }

  @Test
  public void test105()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getDay();
  }

  @Test
  public void test106()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = 357;
      calDay0.getDay();
  }

  @Test
  public void test107()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = (-5317);
      calDay0.getDay();
  }

  @Test
  public void test108()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getAppts();
  }

  @Test
  public void test109()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.toString();
  }

//add more unit tests as you needed	
}