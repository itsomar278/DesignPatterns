public class StrongFactory extends AbstractFactory{
    @Override
    public Pc getPc(Needs needs)
    {
        if (needs == Needs.Simulations)
        {
            return new StrongPc();
        }
        else if (needs == Needs.Streaming)
        {
            return new NormalPc();
        }
        else if (needs == Needs.OfficeWork)
        {
            return new NormalPc();
        }
        else if (needs == Needs.Programming)
        {
            return new NormalPc();
        }
        else if (needs == Needs.VideoEditing)
        {
            return new StrongPc();
        }
        else
        {
            return null;
        }
    }

    @Override
    public Laptop getLaptop(Needs needs) {
        if (needs == Needs.Simulations)
        {
            return new StrongLaptop();
        }
        else if (needs == Needs.Streaming)
        {
            return new StrongLaptop();
        }
        else if (needs == Needs.OfficeWork)
        {
            return new Normallaptop();
        }
        else if (needs == Needs.Programming)
        {
            return new StrongLaptop();
        }
        else if (needs == Needs.VideoEditing)
        {
            return new StrongLaptop();
        }
        else
        {
            return null;
        }
    }
}
