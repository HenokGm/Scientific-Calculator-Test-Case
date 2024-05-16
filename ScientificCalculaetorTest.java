
import java.beans.Transient;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ScientificCalculaetorTest {

    @Test
    public void addTest(){
        
          
        ArrayList<String> testInput = new ArrayList<>(Arrays.asList("3", "+", "5", "+", "2", "+", "10"));

        // Expected result after addition
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("20.0"));

        // Call the additionMaker method
        ArrayList<String> result = ScientificCalculaetor.additionMaker(testInput);

        // Check if the result matches the expected result
        assertEquals(expectedResult, result);

    }
    


}
