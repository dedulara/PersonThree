import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaryWorkerTest
{
    Person peter;
    Worker w1;
    SalaryWorker s1;

    @BeforeEach
    void setUp()
    {
        peter = new Person("000001", "Peter", "Yarrow", "Mr.", 1938);
        w1 = new Worker(peter, 20);
        s1 = new SalaryWorker(w1, 41600);
    }

    @Test
    void setAnnualSalary()
    {
        s1.setAnnualSalary(41600);
        assertEquals(41600, s1.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay()
    {
        assertEquals(800.0, s1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay()
    {
        assertEquals("Total weekly pay: $800.00", s1.displayWeeklyPay(40));
    }
}
