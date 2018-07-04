package codekamp;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by cerebro on 04/07/18.
 */
public class Demo {
    public static void main(String[] args) {

        LinkedList<String> namesList = new LinkedList<String>();

        String[] namesArray = new String[10];

        namesList.add("Suresh");
        namesList.add("Ramesh");
        namesList.add("Jignesh");

        System.out.println(namesList);

        namesList.add(1, "Dharmesh");
        namesList.set(2, "Mahesh");

        System.out.println(namesList);

        System.out.println(namesList.contains("Suresh"));
    }
}
