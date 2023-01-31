public class Worker extends Person
{
    private double hourlyPayRate;

    /*public Worker(String idString, String firstName, String lastName, String title, int birthYear, double hourlyPayRate)
    {
        super(idString, firstName, lastName, title, birthYear);
        this.hourlyPayRate = hourlyPayRate;
    }*/
    public Worker(Person person, double hourlyPayRate)
    {
        super(person.getIdString(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getBirthYear());
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {return this.hourlyPayRate;}
    public void setHourlyPayRate(double hourlyPayRate) {this.hourlyPayRate = hourlyPayRate;}

    public double calculateWeeklyPay(double hoursWorked)
    {
        double paidAmount = 0;
        if(hoursWorked <= 40)
        {
            paidAmount = this.hourlyPayRate * hoursWorked;
        }
        else if (hoursWorked >= 40)
        {
            double normalAmount = this.hourlyPayRate * 40;
            double overtimeAmount = this.hourlyPayRate * 1.5 * (hoursWorked - 40);
            paidAmount = normalAmount + overtimeAmount;
        }
        return paidAmount;
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        double paidAmount = 0;
        String displayPay = "";
        if(hoursWorked <= 40)
        {
            paidAmount = this.hourlyPayRate * hoursWorked;
            displayPay = String.format("Total hours worked: " + hoursWorked + "\nTotal pay: $%.2f", paidAmount);
        }
        else if (hoursWorked >= 40)
        {
            double normalAmount = this.hourlyPayRate * 40;
            double overtimeAmount = this.hourlyPayRate * 1.5 * (hoursWorked - 40);
            paidAmount = normalAmount + overtimeAmount;
            displayPay = String.format("Total hours worked: %.2f\nTotal regular pay: $%.2f\nHours worked overtime: %.2f\nTotal overtime pay: $%.2f\nTotal pay: $%.2f", hoursWorked, normalAmount, (hoursWorked-40), overtimeAmount, paidAmount);
        }
        return displayPay;
    }

    public String toString()
    {
        return "Worker{" + super.toString() + " hourly pay rate=" + this.hourlyPayRate + "}";
    }
}