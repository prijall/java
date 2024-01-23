abstract class Person2{  
  abstract void eat();  
}  
class TestAnonymousInner{  
 public static void main(String args[]){  
  Person2 p=new Person2(){  
  void eat(){System.out.println("nice fruits");}  
  };  
  p.eat();  
 }  
}  