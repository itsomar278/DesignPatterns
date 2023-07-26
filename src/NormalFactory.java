public class NormalFactory extends AbstractFactory{

    public Laptop getLaptop(Needs needs)
    {
        if (needs == Needs.Gaming)
        {
            return new StrongLaptop();
        }
        else if (needs == Needs.OfficeWork)
        {
            return new Normallaptop();
        }
        else if (needs == Needs.VideoEditing)
        {
            return new StrongLaptop();
        }
        else if (needs == Needs.Programming)
        {
            return new Normallaptop();
        }
        else
        {
            return new Normallaptop();
        }
    }

    @Override
    public Pc getPc(Needs need) {
        if (need == Needs.Gaming)
        {
            return new StrongPc();
        }
        else if (need == Needs.OfficeWork)
        {
            return new NormalPc();
        }

        else if (need == Needs.Programming)
        {
            return new NormalPc();
        }
        else
        {
            return new NormalPc();

        }

    }
}
