import junit.framework.TestCase;

public class GrossPayTest extends TestCase {

    //Test number: 1
    //Objective: Valid grossSales
    //Input(s): grossSales = 40,000
    //Expected output: 43,800
    public void testTotalGrossPay001() {

        GrossPay grossPay = new GrossPay();

        try{
            assertEquals(43,800,grossPay.TotalGrossPay(40000));
        }catch(InvalidValueException e)
        {
            fail("No exception expected");
        }

    }

    //Test number 2:
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

    //Test number 3:
    //Objective: Invalid high grossSales
    //Input(s): 150,000
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




}