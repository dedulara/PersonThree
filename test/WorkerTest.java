import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkerTest
{
    Person peter;
    Worker w1;

    @BeforeEach
    void setUp()
    {
        peter = new Person("000001", "Peter", "Yarrow", "Mr.", 1938);
        w1 = new Worker(peter, 20);
    }

    @Test
    void setHourlyPayRate()
    {
        w1.setHourlyPayRate(20);
        assertEquals(20, w1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay()
    {
        assertEquals(800.0, w1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay()
    {
        assertEquals("Total hours worked: 40.0\nTotal pay: $800.00", w1.displayWeeklyPay(40));
    }
}
