public class Main {
    public static void main(String[] args) {
        AbstractFactory factory ;

        Needs[] needs = {Needs.Simulations, Needs.Streaming, Needs.OfficeWork, Needs.Programming, Needs.VideoEditing};
        for (int i = 0; i < needs.length; i++) {
            if (needs[i] == Needs.Simulations || needs[i] == Needs.VideoEditing)
            {
                System.out.println("for " + needs[i] +" : " );
                factory = new StrongFactory();
                Pc pc = factory.getPc(needs[i]);
                System.out.println(pc.toString());
                System.out.println("OR");
                Laptop laptop = factory.getLaptop(needs[i]);
                System.out.println(laptop.toString());
                System.out.println("------------------------------------------------");

            }
            else
            {
                System.out.println("for " + needs[i] +" : " );
                factory = new NormalFactory();
                Pc pc = factory.getPc(needs[i]);
                System.out.println(pc.toString());
                System.out.println("OR");
                Laptop laptop = factory.getLaptop(needs[i]);
                System.out.println(laptop.toString());
                System.out.println("------------------------------------------------");
            }
        }
    }
}