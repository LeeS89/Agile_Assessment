import junit.framework.TestCase;

public class GrossPayTest extends TestCase {

    //Test number: 1
    //Objective: Valid grossSales
    //Input(s): grossSales = 40,000
    //Expected output: 3,800
    public void testTotalGrossPay001() {

        GrossPay grossPay = new GrossPay();

        try{
            assertEquals(3800.00,grossPay.TotalGrossPay(40000));
        }catch(InvalidValueException e)
        {
            fail("No exception expected");
        }

    }

    //Test number: 2
    //Objective: Invalid low grossSales
    //Input(s): grossSales = 50.00
    //Expected output: "Invalid grossSales entered"
    public void testTotalGrossPay002()
    {
        GrossPay grossPay = new GrossPay();
        double actualPay = 0.0;

        try{
                actualPay = grossPay.TotalGrossPay(50.00);
                fail("Exception expected");
        }catch(InvalidValueException e)
        {
            assertEquals("Invalid grossSales entered",e.getMessage());
        }
    }

    //Test number: 3
    //Objective: Invalid high grossSales
    //Input(s): grossSales = 150,000
    //Expected output: "Invalid grossSales entered"
    public void testTotalGrossPay003()
    {
        GrossPay grossPay = new GrossPay();
        double actualPay = 0.0;

        try{
            actualPay = grossPay.TotalGrossPay(150000);
            fail("Exception expected");
        }catch(InvalidValueException e)
        {
            assertEquals("Invalid grossSales entered",e.getMessage());
        }
    }

    //Test number: 4
    //Objective: Valid low boundary grossSales
    //Input(s); grossSales = 100.00
    //Expected output: 309.00
    public void testTotalGrossPay004()
    {
        GrossPay grossPay = new GrossPay();

        try{
            assertEquals(209.00, grossPay.TotalGrossPay(100.00));

        }catch(InvalidValueException e)
        {
            fail("No exception expected");
        }
    }

    //Test number: 5
    //Objective: Valid high boundary grossSales
    //Input(s): grossSales = 100,000.00
    //Expected output: 9,200.00
    public void testTotalGrossPay005()
    {
        GrossPay grossPay = new GrossPay();

        try{
            assertEquals(9200.00,grossPay.TotalGrossPay(100000.00));
        }catch(InvalidValueException e)
        {
            fail("No exception expected");
        }
    }

    //Test number: 6
    //Objective: Invalid low boundary grossSales
    //Input(s): grossSales = 99.99
    //Expected output: "Invalid grossSales entered"
    public void testTotalGrossPay006()
    {
        GrossPay grossPay = new GrossPay();
        double actualPay = 0.0;

        try{
            actualPay = grossPay.TotalGrossPay(99.99);
            fail("Exception expected");

        }catch(InvalidValueException e)
        {
            assertEquals("Invalid grossSales entered",e.getMessage());
        }
    }

    //Test number: 7
    //Objective: Invalid high boundary grossSales
    //Input(s): grossSales = 100,000.01
    //Expected output: "Invalid grossSales entered"
    public void testTotalGrossPay007()
    {
        GrossPay grossPay = new GrossPay();
        double actualPay = 0.0;

        try{
            actualPay = grossPay.TotalGrossPay(100000.01);
            fail("Exception expected");

        }catch(InvalidValueException e)
        {
            assertEquals("Invalid grossSales entered",e.getMessage());
        }
    }

}