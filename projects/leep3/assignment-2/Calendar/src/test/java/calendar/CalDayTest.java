package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


//import java.util.LinkedList;


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


	 @Test
	  public void test02()  throws Throwable  {
		Appt appt1 = new Appt (13, 30, 10, 4, 2017, "Birthday Party", "This is my birthday party.") ;
		Appt appt2 = new Appt (-1, 30, 10, 4, 2017, "Birthday Party", "This is my birthday party.") ;
		Appt appt3 = new Appt (15, 30, 10, 4, 2017, "Birthday Party", "This is my birthday party.") ;
		Appt appt4 = new Appt (14, 30, 10, 4, 2017, "Birthday Party", "This is my birthday party.") ;
		Appt appt5 = new Appt (13, 45, 10, 4, 2017, "Birthday Party", "This is my birthday party.") ;
		Appt appt6 = new Appt (13, 15, 10, 4, 2017, "Birthday Party", "This is my birthday party.") ;
		GregorianCalendar cal = new GregorianCalendar(2017,4,24);
		CalDay calDay = new CalDay(cal) ; 
		calDay.addAppt(appt1) ;
		calDay.addAppt(appt2) ;
		calDay.addAppt(appt3) ;
		calDay.addAppt(appt4) ;
		calDay.addAppt(appt5) ;
		calDay.addAppt(appt6) ;
		calDay.iterator() ;
		System.out.println(calDay);
		assertEquals(2017, calDay.getYear());
		assertEquals(4, calDay.getSizeAppts());
		assertEquals(4, calDay.getMonth());
		assertEquals(24, calDay.getDay());
	 }



//add more unit tests as you needed	
}
