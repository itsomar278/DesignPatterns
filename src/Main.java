public class Main {
    public static void main(String[] args) {
        LaptopFactory laptopFactory = new LaptopFactory();
        Laptop laptop = laptopFactory.getLaptop(Needs.Gaming);
        System.out.println(laptop);
        laptop = laptopFactory.getLaptop(Needs.OfficeWork);
        System.out.println(laptop);
        laptop = laptopFactory.getLaptop(Needs.VideoEditing);
        System.out.println(laptop);
        laptop = laptopFactory.getLaptop(Needs.Programming);
        System.out.println(laptop);
    }
}