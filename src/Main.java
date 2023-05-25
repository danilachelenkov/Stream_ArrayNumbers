import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        System.out.println("SimpleProcess");
        runSimpleProcess(integerList);

        StreamMain streamMain = new StreamMain(integerList);
        streamMain.runStream();
    }

    private static void runSimpleProcess(List<Integer> integerList) {

        integerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > 0) {
                if (integerList.get(i) % 2 == 0) {
                    System.out.println(integerList.get(i));
                }
            }
        }
    }
}

