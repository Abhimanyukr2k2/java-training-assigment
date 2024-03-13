package Assgigment2;

import java.util.ArrayList;
import java.util.List;

public class reverse_string {
    public static void main(String[] args) {
       
        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("banana");
        list2.add("cherry");
        list2.add("date");
        list2.add("Abhimanyu");
        list2.add("kumar");
        System.out.println("---------Original -------");
        for( String list: list2){
            System.out.println(list);
        }
        System.out.println(list2);

    
    System.out.println("--------- Reverse -------");
    int i;
    String list3;
    for( i=list2.size()-1;i>=0;i--){
        list3=list2.get(i);
        System.out.println(list3);
    }
    
    }
}
