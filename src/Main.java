public class Main {
    public static void main(String[] args) {
        AbstractFactory factory ;

        Needs[] needs = {Needs.Simulations, Needs.Streaming, Needs.OfficeWork, Needs.Programming, Needs.VideoEditing};
        for (int i = 0; i < needs.length; i++) {
            if (needs[i] == Needs.Simulations || needs[i] == Needs.VideoEditing)
            {
                Pc pc = new StrongFactory().getPc(needs[i]);
                System.out.println(pc.toString());
                System.out.println("OR");
                Laptop laptop = new StrongFactory().getLaptop(needs[i]);
                System.out.println(laptop.toString());
                System.out.println("------------------------------------------------");

            }
            else
            {
                Pc pc = new NormalFactory().getPc(needs[i]);
                System.out.println(pc.toString());
                System.out.println("OR");
                Laptop laptop = new NormalFactory().getLaptop(needs[i]);
                System.out.println(laptop.toString());
                System.out.println("------------------------------------------------");
            }
        }
    }
}