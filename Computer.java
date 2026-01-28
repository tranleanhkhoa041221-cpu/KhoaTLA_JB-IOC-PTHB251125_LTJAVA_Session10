package BaiTapGioi1;

public class Computer {
        public double calculatePrice(double basePrice) {
            System.out.println("[Using basePrice only]");
            return basePrice;
        }

        public double calculatePrice(double basePrice, double tax) {
            System.out.println("[Using basePrice + tax]");
            return basePrice + tax;
        }

        public double calculatePrice(double basePrice, double tax, double discount) {
            System.out.println("[Using basePrice + tax + discount]");
            return basePrice + tax - discount;
        }
    public static void main(String[] args) {
        Computer myComputer = new Computer();

        double basePrice = 1000.0;
        double tax = 100.0;
        double discount = 50.0;

        double price1 = myComputer.calculatePrice(basePrice);
        System.out.println("Final Price = " + price1);

        double price2 = myComputer.calculatePrice(basePrice, tax);
        System.out.println("Final Price = " + price2);

        double price3 = myComputer.calculatePrice(basePrice, tax, discount);
        System.out.println("Final Price = " + price3);
    }
}






