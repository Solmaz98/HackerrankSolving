package Introduction;

import java.util.ArrayList;
import java.util.List;

public class DivisionClass implements DivisionInterface {
    @Override
    public int divisionSum(int myNum) {
        int sum = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < myNum; i++) {
            if (myNum % i == 0) {
                integerList.add(i);
            }
        }
        integerList.add(myNum);

        for (Integer lst : integerList
        ) {
            sum += lst;
        }
        return sum;
    }
}
