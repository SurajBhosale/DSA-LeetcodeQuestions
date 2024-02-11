package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PerfectSquare {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 5, 2, 9, 8, 64, 27);

        System.out.println(ls.stream().filter(i -> Math.sqrt(i) % 1 == 0).collect(Collectors.toList()));

    }
}
