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

//add more unit tests as you needed
}
