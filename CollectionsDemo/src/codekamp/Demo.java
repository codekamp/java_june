package codekamp;

import java.util.*;

/**
 * Created by cerebro on 04/07/18.
 */
public class Demo {
    public static void main(String[] args) {

        List<String> names = Student.getNames();

        System.out.println(names);

        System.out.println(names.get(0));

        Collections.shuffle(names);
        System.out.println(names);

//        namesList.add(1, "Dharmesh");
//        namesList.set(2, "Mahesh");
//
//        System.out.println(namesList);
//
//        System.out.println(namesList.contains("Suresh"));
//
//        HashMap<String, Integer> population = new HashMap<>();
//
//        population.put("India", 1000);
//        population.put("China", 1005);
//
//        System.out.println(population.get("China"));

//        for(int i = 0; i < namesList.size(); i++) {
//            System.out.println(namesList.get(i));
//        }

        // this loop is alternate way of writing above loop
//        for(String name: namesList) {
//            System.out.println(name);
//        }
    }
}
