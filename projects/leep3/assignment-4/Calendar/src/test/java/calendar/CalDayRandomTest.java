package calendar;
import java.util.Calendar;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.GregorianCalendar;

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	 @Test
	  public void radnomtest()  throws Throwable  {
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 Random rand = new Random();
		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				GregorianCalendar cal = new GregorianCalendar(2017,1,1);
				CalDay cd = new CalDay(cal);
				for (int i = 0 ; i < 3 ; i++){
				long randomseed =System.currentTimeMillis();
				Random random = new Random(randomseed);
				
				 int startHour=rand.nextInt(45)-11;
				 int startMinute=rand.nextInt(80)-10;
				 int startDay=rand.nextInt(50)-10;;
				 int startMonth=rand.nextInt(25)-10;;
				 int startYear=rand.nextInt(3000)-1000;
				 String title=(String) ValuesGenerator.getString(random);
				 String description=(String) ValuesGenerator.getString(random);
 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				cd.addAppt(appt);
}
				if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			        

		


	 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
		 
		 
	 }


	
}
