package za.ac.cput.projectsss;

import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    /**
     * Rigorous Test :-)
     */
    @Test
   public void shouldAnswerWithTrue()
    {
    assertTrue( true );
    }

    private App mathsproblems;

    @Before
    public void setUp() throws Exception{

        mathsproblems = new App();
    }
    @After
    public void tearDown() throws  Exception{

    }


    //TEST METHODS.....

    //IDENTITY
    @Test
    public void multiplicationIdentity() {
        int answer = mathsproblems.multiply(5,4);
        Assert.assertEquals(20, answer);
    }
    //EQUALITY
    @Test
    public void multiplicationEquality(){
        int answer = mathsproblems.multiply(5,4);
        Assert.assertEquals(30, answer);
    }


    //FAILING TEST
    @Test
    public void multiplicationFail(){
        Assert.fail("This is a failing test");


    }
    //TIMEOUT
    @Test
    public void multiplicationTimeOut(){
        int answer = mathsproblems.multiply(5,4);
        Assert.assertEquals(30, answer);
    }






    @Test
    public void multiplicationDisabled(){
        int answer = mathsproblems.multiply(5,4);
        Assert.assertEquals(30,answer);
    }


}
