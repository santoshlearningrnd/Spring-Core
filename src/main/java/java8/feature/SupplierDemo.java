package java8.feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {


    public static void main(String[] args) {
        String s1="Santosh";
        String s2="Santosh";
        String s3=new String("Santosh");
        System.out.println(s1.equals(s2));

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        /*Supplier<String> sipplier = ()->  "java hello44";


        List<String> listIntger= Arrays.asList("asd");
        System.out.println(listIntger.stream().findFirst());
        System.out.println(listIntger.stream().findAny().orElseGet( ()->  "java fff"));*/
    }
}
