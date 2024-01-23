public interface Sports {
   String name = "Football";

   public void game();
}

class Result extends Test implements Sports{

    @Override
     public void game(){
        System.out.println("The Name of Sports is:" + name);
     }
     
     @Override
    public  void Display(){
        System.out.println("The Roll no is:" + getRoll());
        System.out.println("The Marks of a student is:"+ getMarks());
    }
}
