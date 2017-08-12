package calendar;
import java.util.Calendar;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	public int temp = 1;
	public long startTime = Calendar.getInstance().getTimeInMillis();
	public long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
	public Random rand = new Random();
	public TimeTable tt = new TimeTable();
	public int iter = 0;
	public int ending = 0;
	
	 @Test
	  public void radnomtest()  throws Throwable  {
//		 System.out.println("Start testing...");
		try{ 
//			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
for (int iteration = iter ; elapsed < TestTimeout; iteration++) {
				if (iter == 0)
					System.out.println("Start testing...");
				iter++ ;
				GregorianCalendar cal = new GregorianCalendar(2017,1,1);
				CalDay cd = new CalDay(cal);
				LinkedList<Appt> appts = new LinkedList<Appt>();
				Appt tempAppt ;

				for (int i = 0 ; i < 3 ; i++){
				long randomseed =System.currentTimeMillis();
				Random random = new Random(randomseed);
				
				 int startHour=rand.nextInt(45)-11;
				 int startMinute=rand.nextInt(80)-10;
				 int startDay=rand.nextInt(50)-10;;
				 int startMonth=rand.nextInt(25)-10;;
				 int startYear=rand.nextInt(6)+2008;
				 String title=(String) ValuesGenerator.getString(random);
				 String description=(String) ValuesGenerator.getString(random);
 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				appts.add(appt);

				if (i == 2) {tt.deleteAppt(appts,appt);}
				int tem = rand.nextInt(10);
				if (i == tem) {
					LinkedList<Appt> apptsTem = null;
					tt.deleteAppt(apptsTem, appt);
				}
				tem = rand.nextInt(10);
				if (i == tem) {
					Appt apptTem = null;
					tt.deleteAppt(appts, apptTem);
				}
				tem = rand.nextInt(10);
				if (i == tem) {
					Appt apptTem = new Appt(1,1,1,1,1,"AA","BB");
					tt.deleteAppt(appts, apptTem);
				}
				tem = rand.nextInt(10);
				if (i == tem) {
					LinkedList<Appt> apptsTem = new LinkedList<Appt>();
					tt.deleteAppt(apptsTem, appt);
				}
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				cd.addAppt(appt);
		}
				int year = rand.nextInt(10)+2009;
				GregorianCalendar start = new GregorianCalendar(year,10,10);
				year= rand.nextInt(10)+2016;
				GregorianCalendar end = new GregorianCalendar(year,10,11);

				tt.getApptRange(appts,start,end);
				temp++ ;

				if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout); 
			}




		}catch(NullPointerException e){	
}
		catch(DateOutOfRangeException e){
	radnomtest();
}
		if (ending == 0) { System.out.println("Done testing...");
		ending++;} 
	 }



}
