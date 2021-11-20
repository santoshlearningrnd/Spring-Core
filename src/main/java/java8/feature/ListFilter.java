package java8.feature;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class ListFilter {




        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<Product>();
            //Adding Products
            productsList.add(new Product(1,"HP Laptop",25000f));
            productsList.add(new Product(2,"Dell Laptop",30000f));
            productsList.add(new Product(3,"Lenevo Laptop",28000f));
            productsList.add(new Product(4,"Sony Laptop",28000f));
            productsList.add(new Product(5,"Apple Laptop",90000f));
            List<Float> productPriceList = new ArrayList<Float>();
            for(Product product: productsList){

                // filtering data of list
                if(product.price<30000){
                    productPriceList.add(product.price);    // adding price to a productPriceList
                }
            }
            System.out.println(productPriceList);   // displaying data

            List<Float> productPriceList2nd=productsList.stream().filter(k-> k.price<30000).map(p -> p.price).collect(Collectors.toList());
            Set<Float> productPriceList3nd=productsList.stream().filter(k-> k.price<30000).map(p -> p.price).collect(Collectors.toSet());
           // Map<Float> productPriceList4nd=productsList.stream().filter(k-> k.price<30000).map(p -> p.price).collect(Collectors.toMap());
            System.out.println(productPriceList2nd);
            System.out.println("sdfsdf"+productPriceList3nd);   // displaying data
            Stream.iterate(1, element->element+1)
                    .filter(element->element%5==0)
                    .limit(5)
                    .forEach(System.out::println);

            productsList.stream().filter(p->p.price>2500).forEach(p-> System.out.println(p.name));

        }





    }


