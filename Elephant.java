package BaiTapXuatSac1;

public class Elephant extends Mammal{
    @Override
    public void makeSound() {
        System.out.println(super.getName() + " says: Pawooooo!");
    }
    public void sprayWater(){
        System.out.println(super.getName() + " is spraying water!");

    }
}

