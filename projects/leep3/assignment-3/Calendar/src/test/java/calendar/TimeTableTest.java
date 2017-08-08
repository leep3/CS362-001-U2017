package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		LinkedList<Appt> appts= new LinkedList<Appt>();	 

		int[] arr= {2};		 
		Appt appt1 = new Appt (13, 30, 10, 4, 2017, "Birthday Party1", "This is my birthday party.") ;
		Appt appt2 = new Appt (14, 30, 10, 4, 2017, "Birthday Party2", "This is my birthday party.") ;
		Appt appt3 = new Appt (13, 45, 10, 4, 2017, "Birthday Party3", "This is my birthday party.") ;
		Appt appt4 = new Appt (13, 15, 10, 4, 2017, "Birthday Party4", "This is my birthday party.") ;

		appt1.setRecurrence(arr, appt1.RECUR_BY_YEARLY, 2, appt1.RECUR_NUMBER_FOREVER);
		appt2.setRecurrence(arr, appt2.RECUR_BY_YEARLY, 2, appt2.RECUR_NUMBER_FOREVER);
		appt3.setRecurrence(arr, appt3.RECUR_BY_YEARLY, 2, appt3.RECUR_NUMBER_FOREVER);
		appt4.setRecurrence(arr, appt4.RECUR_BY_YEARLY, 2, appt4.RECUR_NUMBER_FOREVER);

		appts.add(appt1);
		appts.add(appt2);
		appts.add(appt3);
		appts.add(appt4); 
		
		GregorianCalendar start = new GregorianCalendar(2017,1,1);
		GregorianCalendar end = new GregorianCalendar(2017,10,1);
		 
		TimeTable tt= new TimeTable();
		 
		tt.getApptRange(appts,start,end);
		 
		tt.deleteAppt(appts,appt3);
		 
		int arr2[] = {0,1};
		tt.permute(appts,arr2);		 
	 }
	 @Test
	  public void test02()  throws Throwable  {
		LinkedList<Appt> appts= new LinkedList<Appt>();	 
		LinkedList<Appt> appts2 = null ;
		LinkedList<Appt> appts3 = new LinkedList<Appt>();

		int[] arr= {2};		 
		Appt appt1 = new Appt (13, 30, 10, 4, 2017, "Birthday Party1", "This is my birthday party.") ;
		Appt appt2 = new Appt (14, 30, 10, 4, 2017, "Birthday Party2", "This is my birthday party.") ;
		Appt appt3 = new Appt (13, 45, 10, 4, 2017, "Birthday Party3", "This is my birthday party.") ;
		Appt appt4 = new Appt (13, 15, 10, 4, 2017, "Birthday Party4", "This is my birthday party.") ;
		Appt appt5 = new Appt (50, 15, 10, 4, 2017, "Birthday Party4", "This is my birthday party.") ;

		appt1.setRecurrence(arr, appt1.RECUR_BY_YEARLY, 2, appt1.RECUR_NUMBER_FOREVER);
		appt2.setRecurrence(arr, appt2.RECUR_BY_YEARLY, 2, appt2.RECUR_NUMBER_FOREVER);
		appt3.setRecurrence(arr, appt3.RECUR_BY_YEARLY, 2, appt3.RECUR_NUMBER_FOREVER);
		appt4.setRecurrence(arr, appt4.RECUR_BY_YEARLY, 2, appt4.RECUR_NUMBER_FOREVER);

		appts.add(appt1);
		appts.add(appt2);
		appts.add(appt3);
		appts.add(appt4); 
		appts3.add(appt1);
		
		GregorianCalendar start = new GregorianCalendar(2017,11,1);
		GregorianCalendar end = new GregorianCalendar(2017,10,1);
		 
		TimeTable tt= new TimeTable();
		 
//		tt.getApptRange(appts,start,end);
		 
		tt.deleteAppt(appts2,appt3);
		tt.deleteAppt(appts,appt5);
		tt.deleteAppt(appts3,appt1);
		 
		int arr2[] = {0,1};
		tt.permute(appts,arr2);			 
	 }

/*
	 @Test
	  public void test03()  throws Throwable  {
		LinkedList<Appt> appts= new LinkedList<Appt>();	 
		int[] arr= {2};		 
		Appt appt1 = new Appt (13, 30, 10, 4, 2017, "Birthday Party1", "This is my birthday party.") ;
		Appt appt2 = new Appt (14, 30, 10, 4, 2017, "Birthday Party2", "This is my birthday party.") ;
		Appt appt3 = new Appt (13, 45, 10, 4, 2017, "Birthday Party3", "This is my birthday party.") ;
		Appt appt4 = new Appt (13, 15, 10, 4, 2017, "Birthday Party4", "This is my birthday party.") ;
		Appt appt5 = new Appt (50, 15, 10, 4, 2017, "Birthday Party5", "This is my birthday party.") ;
		Appt appt6 = new Appt (10, 15, 10, 4, 2018, "Birthday Party6", "This is my birthday party.") ;
		Appt appt7 = new Appt (10, 15, 10, 4, 2017, "Birthday Party7", "This is my birthday party.") ;		
		Appt appt8 = new Appt (10, 15, 10, 4, 2017, "Birthday Party8", "This is my birthday party.") ;		
		appt1.setRecurrence(arr, appt1.RECUR_BY_YEARLY, 2, appt1.RECUR_NUMBER_FOREVER);
		appt2.setRecurrence(arr, appt2.RECUR_BY_YEARLY, 2, appt2.RECUR_NUMBER_FOREVER);
		appt3.setRecurrence(arr, appt3.RECUR_BY_YEARLY, 2, appt3.RECUR_NUMBER_FOREVER);
		appt4.setRecurrence(arr, appt4.RECUR_BY_YEARLY, 2, appt4.RECUR_NUMBER_FOREVER);
		appt5.setRecurrence(arr, appt5.RECUR_BY_YEARLY, 2, appt5.RECUR_NUMBER_FOREVER);
		appt6.setRecurrence(arr, appt6.RECUR_BY_YEARLY, 2, appt6.RECUR_NUMBER_FOREVER);
		appt7.setRecurrence(arr, 5, 5, 5);
//		appt8.setRecurrence(arr, 0, 0, 0);
		appts.add(appt1);
		appts.add(appt2);
		appts.add(appt3);
		appts.add(appt4); 
		appts.add(appt5);
		appts.add(appt6);
//		appts.add(appt7);
		appts.add(appt8);
		
		GregorianCalendar start = new GregorianCalendar(2017,1,1);
		GregorianCalendar start2 = new GregorianCalendar(2017,10,2);
		GregorianCalendar end = new GregorianCalendar(2017,10,2);
		 
		TimeTable tt= new TimeTable();
		 
		tt.getApptRange(appts,start,end);
		tt.getApptRange(appts,start2,end);
		int arr2[] = {0,1};
		tt.permute(appts,arr2);			 
	 }
*/



	 @Test
	  public void test04()  throws Throwable  {
//		LinkedList<Appt> appts= null;

//		GregorianCalendar start = new GregorianCalendar(2017,1,1);
//		GregorianCalendar end = new GregorianCalendar(2017,10,2);
		 
//		TimeTable tt= new TimeTable();
		 
//		tt.getApptRange(appts,start,end);

//		int arr2[] = {0,1};
//		tt.permute(appts,arr2);			 
	 }



	 @Test
	  public void test08()  throws Throwable  {
		LinkedList<Appt> appts= new LinkedList<Appt>();	 

		Appt appt1 = new Appt (1, 1, 1, 1, 2017, "Birthday Party1", "This is my birthday party.") ;
	
		appts.add(appt1);

		GregorianCalendar start = new GregorianCalendar(2017,1,1);
		GregorianCalendar end = new GregorianCalendar(2017,1,2);

		TimeTable tt= new TimeTable();
//		tt.getApptRange(appts, start, end);	
	 }

	 @Test
	  public void test09()  throws Throwable  {
		LinkedList<Appt> appts= new LinkedList<Appt>();	 

		Appt appt1 = new Appt (1, 1, 1, 1, 2017, "Birthday Party1", "This is my birthday party.") ;
	
		appts.add(appt1);

		GregorianCalendar start = new GregorianCalendar(2016,2,1);
		GregorianCalendar end = new GregorianCalendar(2016,2,2);

		TimeTable tt= new TimeTable();
		tt.getApptRange(appts, start, end);	
	 }

	 @Test
	  public void test10()  throws Throwable  {
		LinkedList<Appt> appts= new LinkedList<Appt>();	 

		Appt appt1 = new Appt (1, 1, 1, 1, 2017, "Birthday Party1", "This is my birthday party.") ;
	
		appts.add(appt1);

		GregorianCalendar start = new GregorianCalendar(2016,2,1);
		GregorianCalendar end = new GregorianCalendar(2016,2,2);

		TimeTable tt= new TimeTable();
		tt.getApptRange(appts, start, end);	
	 }

// I add more code.





  @Test
  public void test101()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        timeTable0.permute((LinkedList<Appt>) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test102()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = timeTable0.deleteAppt((LinkedList<Appt>) null, (Appt) null);
      assertNull(linkedList0);
  }

  @Test
  public void test103()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt((-594), (-594), 5, 5, 5, "|~:jiSpu.+<Q|YU", "|~:jiSpu.+<Q|YU");
      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt0);
      assertNull(linkedList1);
  }

  @Test
  public void test104()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, (Appt) null);
      assertNull(linkedList1);
  }
	@Test
	public void test105() throws Throwable {
		TimeTable timetable = new TimeTable();
		Appt appt_1 = new Appt(1, 1, 3, 5, 2017,"Appt_1","");
		Appt appt_2 = new Appt(5, 14, 8, 4, 2017,"Appt_2","");
		Appt appt_3 = new Appt(1, 25, 6, 3, 2017,"Appt_3","");
		Appt appt_4 = new Appt(1, 25, 6, 0, 2017,"Appt_3","");
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		appt_1.setRecurrence(arr, 2, 20, 1);
		appt_2.setRecurrence(arr, 1, 10, 20);
		appt_3.setRecurrence(arr, 3, 30, -1);
		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2018, 7, 7);
		try {
			LinkedList<CalDay> t = timetable.getApptRange(ApptsList, first, last);
			assertEquals(0, t.size());
		} catch (NullPointerException e) {}
		try {
			LinkedList<Appt> ApptsList_1 = timetable.deleteAppt(ApptsList, appt_4);
			assertEquals(2, ApptsList_1.size());
			assertNull(ApptsList_1);
			ApptsList_1 = timetable.deleteAppt(ApptsList, appt_3);
			assertEquals(2, ApptsList_1.size());
			assertNotNull(timetable.deleteAppt(ApptsList, appt_3));
		} catch (NullPointerException e) {}
	}
		@Test
		public void test106() throws Throwable {
			TimeTable timetable = new TimeTable();
			Appt appt_1 = new Appt(1, 1, 3, 5, 2017,"Appt_1","");
			Appt appt_2 = new Appt(5, 14, 8, 4, 2017,"Appt_2","");
			Appt appt_3 = new Appt(1, 25, 6, 3, 2017,"Appt_3","");
			Appt appt_4 = new Appt(1, 25, 6, 0, 2017,"Appt_3","");
			int [] arr = {1,2,3,4,5,6,7,8,9,0};
			appt_1.setRecurrence(arr, 0, 0, 0);
			appt_2.setRecurrence(arr, 1, 10, 20);
			appt_3.setRecurrence(arr, 3, 30, -1);
			LinkedList<Appt> ApptsList = new LinkedList<Appt>();
			ApptsList.add(appt_1);
			ApptsList.add(appt_2);
			ApptsList.add(appt_3);
			GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
			GregorianCalendar last = new GregorianCalendar(2018, 7, 7);
			try {
				LinkedList<CalDay> t = timetable.getApptRange(ApptsList, first, last);
				assertEquals(0, t.size());
			} catch (NullPointerException e) {}
			try {
				LinkedList<Appt> ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_4);
				assertEquals(2, ApptsList_1.size());
				assertNull(ApptsList_1);
				ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_3);
				assertEquals(2, ApptsList_1.size());
				assertNotNull(timetable.deleteAppt(ApptsList ,appt_3));
			} catch (NullPointerException e) {}
		}
//add more unit tests as you needed
}