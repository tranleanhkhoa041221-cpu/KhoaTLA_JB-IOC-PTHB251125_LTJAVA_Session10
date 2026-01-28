package BaiTapXuatSac1;

import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
    int choose;
    Scanner sc = new Scanner(System.in);

    Animal[] list;
    int maxAnimal;
        do {
        System.out.println("Nhập số lượng sở thú tối đa cần quản lý: ");
        maxAnimal = Integer.parseInt(sc.nextLine());
        if (maxAnimal < 1) {
            System.out.println("Số sở thú cần quản lý phải >0");
        }
    } while (maxAnimal < 1);
    list = new Animal[maxAnimal];
    int totalAnimal = 0;
        while (true) {
        System.out.println("================= ZOO MANAGEMENT MENU ==============");
        System.out.println("1. Hiển thị thông tin");
        System.out.println("2. Kiểm tra overriding: gọi makeSound() của từng con vật");
        System.out.println("3. Kiểm tra overloading: gọi eat() và eat(String)");
        System.out.println("4. Kiểm tra đa hình runtime (Animal Array");
        System.out.println("5. Gọi phương thức đặc trưng từng loại");
        System.out.println("6. Tạo đối tượng") ;
        System.out.println("7. Thoát");
        System.out.println("=======================================================");
        System.out.println("Lựa chọn của bạn: ");
        choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("--- THÔNG TIN CÁC ĐỘNG VẬT ---");
                for (int i = 0; i < totalAnimal; i++) {
                    Animal a = list[i];
                    if (a instanceof Dog) {
                        Dog dog = (Dog) a;
                        dog.showInfo();
                    } else if (a instanceof Cat) {
                        Cat cat = (Cat) a;
                        cat.showInfo();
                    } else if (a instanceof Elephant) {
                        Elephant elephant = (Elephant) a;
                        elephant.showInfo();
                    }
                    System.out.println("------------------------");
                }
                    break;

            case 2:
                System.out.println("--- OVERRIDING: makeSound() ---");
                for (int i = 0; i < totalAnimal; i++) {
                    Animal a = list[i];
                    if (a instanceof Dog) {
                        Dog dog = (Dog) a;
                        dog.makeSound();
                    } else if (a instanceof Cat) {
                        Cat cat = (Cat) a;
                        cat.makeSound();
                    } else if (a instanceof Elephant) {
                        Elephant elephant = (Elephant) a;
                        elephant.makeSound();
                    }
                }
                break;
                    case 3:
                        System.out.println("--- OVERRIDING: eat() ---");
                        for(int i =0; i < totalAnimal; i++){
                            Animal a = list[i];
                            if(a instanceof Dog){
                                Dog dog  = (Dog) a;
                                dog.eat();
                                dog.eat("meat");
                            }else if(a instanceof Cat){
                                Cat cat = (Cat) a;
                                cat.eat("fish");
                            }else if(a instanceof Elephant){
                                Elephant elephant = (Elephant) a;
                                elephant.eat();
                            }
                            System.out.println("------------------------");
                        }
                        break;
                    case 4:
                        System.out.println("--- POLYMORPHISM RUNTIME ---");
                        for(int i =0; i < totalAnimal; i++){
                            Animal a = list[i];
                            a.makeSound();
                        }
                        break;
                    case 5:
                        System.out.println("--- PHƯƠNG THỨC RIÊNG CỦA TỪNG LOÀI ---");
                        for(int i =0; i < totalAnimal; i++){
                            Animal a = list[i];
                            if(a instanceof Dog){
                                Dog dog = (Dog) a;
                                dog.fetchBall();
                            }else if(a instanceof Cat){
                                Cat cat = (Cat) a;
                                cat.climbTree();
                            }else if(a instanceof Elephant){
                                Elephant elephant = (Elephant) a;
                                elephant.sprayWater();
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Bạn muốn thêm loại động vật nào (1-Dog, 2-Cat, 3-Elephant)? ");
                        int animalType = Integer.parseInt(sc.nextLine());
                        switch (animalType) {
                            case 1:
                                Dog dog = new Dog();
                                System.out.println("Nhập vào tên: ");
                                dog.setName(sc.nextLine());
                                System.out.println("Nhập tuổi: ");
                                dog.setAge(Integer.parseInt(sc.nextLine()));
                                System.out.println("Có lông (true/false): ");
                                dog.setHasFur(Boolean.parseBoolean(sc.nextLine()));
                                list[totalAnimal++] = dog;
                                break;
                            case 2:
                                Cat cat = new Cat();
                                System.out.println("Nhập vào tên: ");
                                cat.setName(sc.nextLine());
                                System.out.println("Nhập tuổi: ");
                                cat.setAge(Integer.parseInt(sc.nextLine()));
                                System.out.println("Có lông (true/false): ");
                                cat.setHasFur(Boolean.parseBoolean(sc.nextLine()));
                                list[totalAnimal++] = cat;
                                break;
                            case 3:
                                Elephant elephant = new Elephant();
                                System.out.println("Nhập vào tên: ");
                                elephant.setName(sc.nextLine());
                                System.out.println("Nhập tuổi: ");
                                elephant.setAge(Integer.parseInt(sc.nextLine()));
                                System.out.println("Có lông (true/false): ");
                                elephant.setHasFur(Boolean.parseBoolean(sc.nextLine()));
                                list[totalAnimal++] = elephant;
                                break;
                            default:
                                System.out.println("Nhập không đúng loại động vật");
                        }
                        break;
                    case 7:
                        System.exit(0);
                }
        }
        }
    }

