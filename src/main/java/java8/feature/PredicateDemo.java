package java8.feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo  {

    public static void main(String[] args) {

      /*  Predicate<Integer> pr = (t) -> t%2==0;

        System.out.println(pr.test(6));*/

        List<Integer> listIntger= Arrays.asList(1,5,8,1,9,8,17);



        listIntger.stream().filter((t) -> t%2==0).forEach(t->System.out.println(t));
    }


}
