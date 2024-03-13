package Assgigment2;

import java.util.ArrayList;

public class sum_of_all_evenno {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<Integer>();

        no.add(2);
        no.add(5);
        no.add(8);
        no.add(10);
        no.add(15);
        int i;
        int sum=0;
        
        for (i = 0; i < no.size(); i++) {
            System.out.println(no.get(i));
            if(no.get(i)%2==0){
                
                sum+=no.get(i);
                
                }
                
        }
        System.out.println("Sum of All even number : "+sum);
        
    }
}
