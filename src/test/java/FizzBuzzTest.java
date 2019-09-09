import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    @Test
    public void shouldGenerate1to100(){
        List<Integer> integerList = new FizzBuzz().generateListOfNumbers();
        Assert.assertEquals(100, integerList.size());
    }

}
