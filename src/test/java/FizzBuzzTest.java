import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    @Test
    public void shouldGenerate1to100(){
        List<Integer> integerList = new FizzBuzz().generateListOfNumbers(100);
        Assert.assertEquals(100, integerList.size());
    }

    @Test
    public void isOutputACommaDelimitedList()
    {
        String outputStringof10 = "1,2,3,4,5,6,7,8,9,10";
        Assert.assertEquals(outputStringof10, new FizzBuzz().generateListOf10Numbers(10));
    }

}
