public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        singleton s1 = singleton.getInstance();
        s1.print();
        singleton s2 = singleton.getInstance();
        s2.print();

    }
}