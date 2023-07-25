public class singleton {

    private static singleton instance = null;
    private static int count = 0;

    private singleton() {

    }

    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
            System.out.println("here is your only instance");
            count++;
        }
        return instance;
    }

    public void print() {
        System.out.println(count);
    }
}
