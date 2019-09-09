import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<Integer> generateListOfNumbers(int upper) {

      return IntStream.rangeClosed(1,upper)
              .mapToObj(Integer::new)
              .collect(Collectors.toList());
    }

    public String generateListOf10Numbers(int upper) {

        return IntStream.rangeClosed(1,upper)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(","));


        //return "1,2,3,4,5,6,7,8,9,10";
    }
}
