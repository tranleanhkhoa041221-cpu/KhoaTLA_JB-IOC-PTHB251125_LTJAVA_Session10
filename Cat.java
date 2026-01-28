package BaiTapXuatSac1;

public class Cat extends Mammal{
    @Override
    public void makeSound() {
        System.out.println(super.getName() + " says: Meow Meow!");
    }
    public void climbTree(){
        System.out.println(super.getName() + " is climbing a tree.");

    }
}
