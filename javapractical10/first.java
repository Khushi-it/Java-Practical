class Animal{
          void sound(){
     System.out.println("Different Sounds of Animals:");
   }
 }

class Cat extends Animal{
     void meow(){
   System.out.println("this is sound of cat");
  }
public class First{
   public static  void main(String[]  args){
      Cat c =new Cat();
      c.sound();
      c.meow();
  }
 }
}    
