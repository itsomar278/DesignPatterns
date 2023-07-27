public class StrongFactory extends AbstractFactory{
    @Override
    public Pc getPc(Needs needs)
    {
       return new StrongPc();
    }

    @Override
    public Laptop getLaptop(Needs needs) {
        return new StrongLaptop();
    }
}
