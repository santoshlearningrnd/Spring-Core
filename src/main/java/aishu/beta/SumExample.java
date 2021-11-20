package aishu.beta;

public class SumExample {


    public static void main(String args[]){


        int a=5;
        int b=58;
        int c=58;
        int result=a+b+c;
        int result2=b/c+a;
        result2++;
        System.out.println("result2=" +result2);
        result2--;
        System.out.println("result2=" +result2);
        System.out.println("Result of a,b,c::=" +result);

        if(b==c){
            System.out.println("B and C are Equall");
        }else{
            System.out.println("B and C are Not Equall");

        }


        //for example

        for(int i=0;i<=100;i++){

            if(i%2!=0){

                System.out.println("Number is : "+i);
            }


        }

        




    }


}
