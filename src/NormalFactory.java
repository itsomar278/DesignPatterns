public class NormalFactory extends AbstractFactory{

    public Laptop getLaptop(Needs needs)
    {
      return new Normallaptop();
    }

    @Override
    public Pc getPc(Needs need) {
        return new NormalPc();
    }
}
