import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Integer> sqInRect(int lng, int wdth) {

        List<Integer> result = new ArrayList<Integer>();
        int tempL = lng;
        int tempW = wdth;

        if (tempL == tempW)
            return null;
        while ( tempW > 0) {
            int tempCounter = tempL / tempW;
            for (int i = 0; i < tempCounter; i++) {
                result.add(tempW);
            }
            int tempW2 = tempW;
            tempW = tempL - (tempW * tempCounter);
            tempL = tempW2;
        }
        return result;
    }

}
