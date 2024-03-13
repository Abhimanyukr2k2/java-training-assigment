package Assgigment2;
class Animal{
void Makesound(){
    System.out.println("this animal makes sound.");
}
}

class dog extends Animal{
void Makesound(){
    System.out.println(" the dog markes sound bhark.");
}
}
class cat extends Animal{
    void Makesound(){
      System.out.println("the cat makes sound mews. ");
    }
  }
public class multilevel_inheritance {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.Makesound();
        cat cc=new cat();
        cc.Makesound();
        dog dd=new dog();
        dd.Makesound();
      
      
    }
}