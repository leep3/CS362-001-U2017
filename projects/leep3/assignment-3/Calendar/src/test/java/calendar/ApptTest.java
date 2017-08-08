package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */




	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());    
		 assertFalse(appt.isRecurring());    
		 assertEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());		
	 }





	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 appt.setStartHour(1);
		 appt.setStartMinute(1);
		 appt.setStartDay(1);
		 appt.setStartMonth(1);
		 appt.setStartYear(1);
		 appt.setTitle("Stay at home");
		 appt.setDescription("Change the plan");
		 assertTrue(appt.getValid());
		 assertEquals(1, appt.getStartHour());
		 assertEquals(1, appt.getStartMinute());
		 assertEquals(1, appt.getStartDay());
		 assertEquals(1, appt.getStartMonth());
		 assertEquals(1, appt.getStartYear());
		 assertEquals("Stay at home", appt.getTitle());
		 assertEquals("Change the plan", appt.getDescription());         		
	 }

	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 String temp = null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt.setTitle(temp);
		 appt.setDescription(temp);
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	 }

	 @Test
	  public void test05()  throws Throwable  {
		 int startHour=13;
		 int startMinute=70;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());        		
		 assertEquals(null, appt.toString());		
	 }

	 @Test
	  public void test06()  throws Throwable  {
		 int startHour=25;
		 int startMinute=70;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());        		
	 }

	 @Test
	  public void test07()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=50;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());        		
	 }

	 @Test
	  public void test08()  throws Throwable  {
		 int startHour=-1;
		 int startMinute=70;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());        		
	 }

	 @Test
	  public void test09()  throws Throwable  {
		 int startHour=13;
		 int startMinute=-1;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());        		
	 }

	 @Test
	  public void test10()  throws Throwable  {
		 int startHour=13;
		 int startMinute=20;
		 int startDay=-10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());        		
	 }

	 @Test
	  public void test11()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=0;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertFalse(appt.getValid());        		
	 }

	 @Test
	  public void test12()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 int[] recur = null ;
		 appt.setRecurrence(recur, 10, 11, 12);
		 assertEquals(12, appt.getRecurNumber());  		
		 assertEquals(10, appt.getRecurBy());  		
		 assertEquals(11, appt.getRecurIncrement());  
		 assertTrue(appt.isRecurring());		
	 }

	 @Test
	  public void test13()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 int[] recur = {20} ;
		 appt.setRecurrence(recur, 10, 11, 12);
		 int temp = appt.getRecurDays()[0];
		 assertEquals(20, temp);  		
	 }

	 @Test
	  public void test14()  throws Throwable  {
		 int startHour=0;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 assertEquals("\t4/10/2017 at 12:30am ,Birthday Party, This is my birthday party.\n", appt.toString());			
	 }




// Now I will add new test cases.

	 @Test 
	  public void test101()  throws Throwable  {
		Appt appt = new Appt(10, 10, 10, 10, 2010, "Title", "Description");
		assertTrue(appt.getValid());
		assertEquals(10, appt.getStartHour());
		assertEquals(10, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(10, appt.getStartMonth());
		assertEquals(2010, appt.getStartYear());
		assertEquals("Title", appt.getTitle());
		assertEquals("Description", appt.getDescription());
		appt.setRecurrence(null, 0, 0, 0);
		assertEquals(0, appt.getRecurBy());
		assertEquals(0, appt.getRecurIncrement());
		assertEquals(0, appt.getRecurNumber());
		assertFalse(appt.isRecurring());
		int[] re = new int[5];
		appt.setRecurrence(re, 6, 7, 8);
 		assertEquals(6, appt.getRecurBy());
		assertEquals(7, appt.getRecurIncrement());
		assertEquals(8, appt.getRecurNumber());
		assertTrue(appt.isRecurring());
		appt.setStartHour(-1);
		appt.setStartMinute(0);
		appt.setStartDay(1);
		appt.setStartMonth(1);
		appt.setStartYear(0);
		appt.setTitle("222");
		appt.setDescription("333");
		assertEquals(-1, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(1, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertEquals("222", appt.getTitle());
		assertEquals("333", appt.getDescription());
		assertFalse(appt.getValid());		 
		appt.setStartHour(24);
		appt.setStartMinute(0);
		appt.setStartDay(1);
		appt.setStartMonth(1);
		appt.setStartYear(0);
		assertEquals(24, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(1, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertTrue(appt.getValid()); 
		appt.setStartHour(25);
		appt.setStartMinute(0);
		appt.setStartDay(1);
		appt.setStartMonth(1);
		appt.setStartYear(0);
		assertEquals(25, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(1, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertFalse(appt.getValid());
		appt.setStartHour(0);
		appt.setStartMinute(61);
		appt.setStartDay(0);
		appt.setStartMonth(0);
		appt.setStartYear(0);
		appt.setTitle("444");
		appt.setDescription("555");
		assertEquals(0, appt.getStartHour());
		assertEquals(61, appt.getStartMinute());
		assertEquals(0, appt.getStartDay());
		assertEquals(0, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertEquals("444", appt.getTitle());
		assertEquals("555", appt.getDescription());
		assertFalse(appt.getValid());
		appt.setStartHour(0);
		appt.setStartMinute(0);
		appt.setStartDay(40);
		appt.setStartMonth(0);
		appt.setStartYear(0);
		appt.setTitle("666");
		appt.setDescription("777");	 
		assertEquals(0, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(40, appt.getStartDay());
		assertEquals(0, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertEquals("666", appt.getTitle());
		assertEquals("777", appt.getDescription());
		assertFalse(appt.getValid());
		appt.setStartHour(0);
		appt.setStartMinute(0);
		appt.setStartDay(1);
		appt.setStartMonth(0);
		appt.setStartYear(0);
		appt.setTitle("888");
		appt.setDescription("999");
		assertEquals(0, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(0, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertEquals("888", appt.getTitle());
		assertEquals("999", appt.getDescription());
		assertFalse(appt.getValid());
		appt.setStartHour(0);
		appt.setStartMinute(0);
		appt.setStartDay(11);
		appt.setStartMonth(11);
		appt.setStartYear(0);
		appt.setTitle("000");
		appt.setDescription("111");
		assertEquals(0, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(11, appt.getStartDay());
		assertEquals(11, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertEquals("000", appt.getTitle());
		assertEquals("111", appt.getDescription());
		assertTrue(appt.getValid());
		appt.setStartHour(0);
		appt.setStartMinute(0);
		appt.setStartDay(1);
		appt.setStartMonth(1);
		appt.setStartYear(0);
		appt.setTitle("222");
		appt.setDescription("333");
		assertEquals(0, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(1, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertEquals("222", appt.getTitle());
		assertEquals("333", appt.getDescription());
		assertTrue(appt.getValid());
		appt.setStartHour(0);
		appt.setStartMinute(0);
		appt.setStartDay(CalendarUtil.NumDaysInMonth(0, 1));
		appt.setStartMonth(1);
		appt.setStartYear(0);
		appt.setTitle("444");
		appt.setDescription("555");
		assertEquals(0, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(CalendarUtil.NumDaysInMonth(0, 1), appt.getStartDay());
		assertEquals(1, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertEquals("444", appt.getTitle());
		assertEquals("555", appt.getDescription());
		assertTrue(appt.getValid());	 
		appt.setStartHour(0);
		appt.setStartMinute(0);
		appt.setStartDay(1);
		appt.setStartMonth(1);
		appt.setStartYear(0);
		appt.setTitle(null);
		appt.setDescription(null);
		assertEquals(0, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(1, appt.getStartMonth());
		assertEquals(0, appt.getStartYear());
		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());
		assertTrue(appt.getValid());
	 }

//add more unit tests as you needed
	
}