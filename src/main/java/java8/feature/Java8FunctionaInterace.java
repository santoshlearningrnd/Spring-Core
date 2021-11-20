package java8.feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8FunctionaInterace {


    public static void main(String args[]){

        Predicate<String> checkLength=str->str.length()>5;

        System.out.println(checkLength.test("santosh"));
        System.out.println(checkLength.test("asd"));

        Student s1=new Student("asdas");
        Consumer<Student> consumer=t->t.setName("My Name is santosh");
        consumer.accept(s1);
        System.out.println(s1.getName());

        Function<Integer,String> fn=t->t*10+"mutiplied by 10";
        System.out.println(fn.apply(4));

        List<Integer> listIntger= Arrays.asList(1,5,8,1,9,8,17);

        Consumer<Integer> contwo=t->System.out.println(t);
        listIntger.stream().forEach(contwo);





    }
}
class Student {
  String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}