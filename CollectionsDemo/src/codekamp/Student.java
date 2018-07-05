package codekamp;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cerebro on 05/07/18.
 */
public class Student {

    public static List<String> getNames() {
        List<String> namesList = new LinkedList<>();

        namesList.add("Suresh");
        namesList.add("Ramesh");
        namesList.add("Jignesh");

        return namesList;
    }
}
