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
	  public void test04()  throws Throwable  {
		 int startHour=13;
		 int startMinute=60;
		 int startDay=10;
		 int startMonth=12;
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




//add more unit tests as you needed
	
}
