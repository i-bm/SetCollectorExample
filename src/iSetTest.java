import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class iSetTest {
    @Test
    public void getIntegerListTest(){
        iSet iset = new iSet();
        List<Integer> actual = iset.getIntegerListFromSet(new int[]{2,4,6,8,3});
        List<Integer> expected = List.of(2,3,4,6,8);
        assertEquals(expected, actual);
    }
}
