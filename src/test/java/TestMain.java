import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class TestMain {

    @Test
    public void test1() {
        List<Integer> res = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
        for (int r : res)
            assertEquals(res, Main.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(null, Main.sqInRect(5, 5));
    }

}
