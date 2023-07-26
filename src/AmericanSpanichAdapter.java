public class AmericanSpanichAdapter implements IEnglishInteract{
    ISpanishInteract spanish ;
    public AmericanSpanichAdapter(ISpanishInteract spanish){
        this.spanish = spanish;
    }
    @Override
    public void sayHelloInEnglish() {
        spanish.sayHelloInSpanish();
    }

    @Override
    public void sayGoodbyeInEnglish() {
        spanish.sayGoodbyeInSpanich();
    }

    @Override
    public void LaughInEnglish() {
        spanish.LaughInSpanich();
    }
}
