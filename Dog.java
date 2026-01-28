package BaiTapXuatSac1;

public class Dog extends Mammal{
    @Override
   public void makeSound() {
       System.out.println(super.getName() + " says: Woof Woof!");
   }
   public void fetchBall(){
       System.out.println(super.getName() + " is fetching the ball.");

   }
}
