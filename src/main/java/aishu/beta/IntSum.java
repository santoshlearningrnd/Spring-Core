package aishu.beta;

public class IntSum {

    int a=10;
    String name="test";
    public IntSum(){
        name="testz";
        System.out.println("constr Block"+a+"name"+name);
    }

    {
        a++;
        name="testy";
        System.out.println("Instance Block"+a+"name"+name);

    }

   static  {

        System.out.println("static Block");

    }


    void m1(){
        System.out.println("no");

    }
    void m1(int a){
        System.out.println("one");

    }
   /* void m1(String s){
        System.out.println("two");

    }*/
    void m1(Float f){
        System.out.println("two");

    }

    public static void  main(String args[]){

        String s1="Test";
        String s2="Test";
        String s3=new String("Test");
        System.out.println("s1==s2 "+s1==s2);
        System.out.println("s1==s3 "+s1==s3);





    }
}
