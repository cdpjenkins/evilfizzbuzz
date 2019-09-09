import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<Integer> generateListOfNumbers() {

      return IntStream.rangeClosed(1,100)
              .mapToObj(Integer::new)
              .collect(Collectors.toList());

    }
}
