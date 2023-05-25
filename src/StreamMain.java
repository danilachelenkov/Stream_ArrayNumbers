import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    List<Integer> integerList;

    public StreamMain(List<Integer> listInteger) {
        this.integerList = listInteger;
    }

    public void runStream() {
        System.out.println("StreamAPI");

        integerList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}

