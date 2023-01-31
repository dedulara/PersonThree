public class SalaryWorker extends Worker
{
    private double annualSalary;

    /*public SalaryWorker(String idString, String firstName, String lastName, String title, int birthYear, double annualSalary)
    {
        super(idString, firstName, lastName, title, birthYear, hourlyPayRate);
        this.annualSalary = annualSalary;
    }*/
    public SalaryWorker(Worker worker, double annualSalary)
    {
        super(worker, worker.getHourlyPayRate());
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double paidAmount = annualSalary / 52;
        return paidAmount;
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        String displayPay = "";
        double paidAmount = annualSalary / 52;
        displayPay = String.format("Total weekly pay: $%.2f", paidAmount);
        return displayPay;
    }

    public String toString()
    {
        return "SalaryWorker{" + super.toString() + " annual salary=" + annualSalary + "}";
    }
}