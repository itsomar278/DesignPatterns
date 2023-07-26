public class Client {
    public static void main(String[] args) {
        // American
        System.out.println("American : ");
        American american = new American();

        System.out.println();
        american.sayHelloInEnglish();
        american.sayGoodbyeInEnglish();
        american.LaughInEnglish();
        System.out.println();


        // Spanish
        System.out.println("Spanish : ");
        Spanish spanish = new Spanish();

        System.out.println();


        spanish.sayHelloInSpanish();
        spanish.sayGoodbyeInSpanich();
        spanish.LaughInSpanich();
        System.out.println();


        // AmericanSpanishAdapter
        System.out.println("AmericanSpanishAdapter : ");
        IEnglishInteract americanSpanishAdapter = new AmericanSpanichAdapter(spanish);

        System.out.println();

        americanSpanishAdapter.sayHelloInEnglish();
        americanSpanishAdapter.sayGoodbyeInEnglish();
        americanSpanishAdapter.LaughInEnglish();
    }
}