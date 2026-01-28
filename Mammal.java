package BaiTapXuatSac1;

public class Mammal extends Animal {
    private boolean hasFur;
    public Mammal() {

    }

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
    @Override
    public void showInfo() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
        System.out.println("Has fur: " + hasFur);
    }

}
