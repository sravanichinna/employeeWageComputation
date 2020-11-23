import java.util.Random;
public class empWageComputation {
        public static void main(String args[])
        {
             Random random=new Random();
                int randomNum=random.nextInt(3);
                System.out.println("Random number: "+randomNum);
                int fullTimePresent=2;
                int partTimePresent=1;
		int absent=0;
		int wagePerHour=20;
		int fullTimeHour=8;
		int partTimeHour=4;
		int dailyEmpWage=0;
		int NumberOfWorkingDays=20;
		int totalSalary=0;
		int day=0;
	for(day=1;day<=NumberOfWorkingDays;day++)
	{
		switch(randomNum)
		{
		case 1:
			int partTimeWage=(partTimeHour*wagePerHour);
			System.out.println("part time employee: "+partTimeWage);
			int totalWage=totalSalary+partTimeWage;
			System.out.println("total salary: "+totalWage);
      				break;
		case 2:
			int fullTimeWage=(fullTimeHour*wagePerHour);
			System.out.println("full time employee: "+fullTimeWage);
			int finalWage=totalSalary+fullTimeWage;
			System.out.println("total Salary: "+finalWage);
				break;
		default:
			System.out.println("Absent: "+absent);
		}
	}
	}
}
