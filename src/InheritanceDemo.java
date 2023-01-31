import java.util.ArrayList;

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        Person peter = new Person("000001", "Peter", "Yarrow", "Mr.", 1938);
        Person paul = new Person("000002", "Paul", "Stookey", "Mr.", 1937);
        Person mary = new Person("000003", "Mary", "Travers", "Ms.", 1936);

        Worker peterWorker = new Worker(peter, 20);
        SalaryWorker peterSalary = new SalaryWorker(peterWorker, 41600);

        Worker paulWorker = new Worker(paul, 25);
        SalaryWorker paulSalary = new SalaryWorker(paulWorker, 52000);

        Worker maryWorker = new Worker(mary, 30);
        SalaryWorker marySalary = new SalaryWorker(maryWorker, 62400);

        ArrayList<Worker> workerArray = new ArrayList<Worker>();
        workerArray.add(peterWorker);
        workerArray.add(paulWorker);
        workerArray.add(maryWorker);
        workerArray.add(peterSalary);
        workerArray.add(paulSalary);
        workerArray.add(marySalary);

        double[] weeklyHours = {40, 50, 40};
        for(int week = 0; week < 3; week++)
        {
            double peterPaidOne = peterWorker.calculateWeeklyPay(weeklyHours[week]);
            double peterPaidTwo = peterSalary.calculateWeeklyPay(weeklyHours[week]);
            double paulPaidOne = paulWorker.calculateWeeklyPay(weeklyHours[week]);
            double paulPaidTwo = paulSalary.calculateWeeklyPay(weeklyHours[week]);
            double maryPaidOne = maryWorker.calculateWeeklyPay(weeklyHours[week]);
            double maryPaidTwo = marySalary.calculateWeeklyPay(weeklyHours[week]);

            int whichWeek = week + 1;
            System.out.printf("WEEK: " + whichWeek);
            System.out.printf("\n=================================\n");
            System.out.printf("%-20s%-20s\n","WORKER", "AMOUNT PAID");
            System.out.printf("---------------------------------\n");
            System.out.printf("%-20s$%,10.2f\n", "PETER - Hourly", peterPaidOne);
            System.out.printf("%-20s$%,10.2f\n", "PETER - Salary", peterPaidTwo);
            System.out.printf("%-20s$%,10.2f\n", "PAUL - Hourly", paulPaidOne);
            System.out.printf("%-20s$%,10.2f\n", "PAUL - Salary", paulPaidTwo);
            System.out.printf("%-20s$%,10.2f\n", "MARY - Hourly", maryPaidOne);
            System.out.printf("%-20s$%,10.2f\n\n\n", "MARY - Salary", maryPaidTwo);

            /*System.out.println("new test");
            for(Worker worker : workerArray)
            {
                //System.out.println(worker);
                double Paid = worker.calculateWeeklyPay(weeklyHours[week]);
                System.out.printf("%-20s$%,10.2f\n", worker.getFirstName(), Paid);
            }*/
        }
    }
}
