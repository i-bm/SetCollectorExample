import java.util.*;
import java.util.stream.Collectors;

public class iSet {

    public List<Integer> getIntegerListFromSet(int[] ints){
        Set<Integer> integerSet = new HashSet<>();
        for(int a: ints) {
            integerSet.add(a);
        }
        return new ArrayList<>(integerSet);
    }

    public List<Integer> getIntegerListFromSetUsingStreams(int[] ints){
        Set<Integer> integerSet = new HashSet<>();
        Arrays.stream(ints).forEach(integerSet::add);
        return integerSet.stream().collect(Collectors.toList());
    }
}
