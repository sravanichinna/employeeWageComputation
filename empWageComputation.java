import java.util.Random;
public class empWageComputation {
        public static void main(String args[])
        {
                int maxHrsInMonth=100;
		int noOfWorkDay=20;
		int empRatePerHr=20;
		int isPartTime=1;
		int isFullTime=2;
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkDay=0;
		int totalEmpWage=0;
	while( totalWorkDay<noOfWorkDay && totalEmpHrs<=maxHrsInMonth)
	{
		 Random random=new Random();
                int randomNum=random.nextInt(3);
                System.out.println("Random number: "+randomNum);
	switch(randomNum)
	{
	case isPartTime: int empHrs=4;
		break;
	case isFullTime: int empHrs=8;
		break;
	default; int empHrs=0;
	}
		totalWorkDays++;
		totalEmpHrs=totalEmpHrs + empHrs;
		System.out.println("employee days: "+totalWorkDay + "work hours: "+totalEmpHrs);
	}
totalEmpWage=(toatalEmpHrs * empRatePerHour);
System.out.println("employee total salary is: "+totalEmpWage);

	}
}
