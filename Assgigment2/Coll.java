package Assgigment2;
import java.util.ArrayList;

class Book{
    int Bookid;
    String Bookname;
    String AuthorName;
    public Book(int Bookid, String Bookname, String AuthorName){
        System.out.println(Bookid+" "+Bookname+" "+AuthorName);
      
    }
}

public class Coll {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();


        
        
        list.add(new Book(100, "java", "ram shyam"));
        list.add(new Book(101, "Python", "ramchandra"));
        list.add(new Book(102, "Math", "uday Sahu"));
        list.add(new Book(103, "DataStructure", "david Kumar"));
        list.add(new Book(104, "Cotloin", "Abhay"));
        list.add(new Book(105, "C", "Shivani"));
        list.add(new Book(106, "c++", "abhimanyu"));
       
        for(Book b:list){
            System.out.println(b);
        }
        

    }
    
}