public class LaptopFactory {

    public Laptop getLaptop(Needs needs)
    {
        if (needs == Needs.Gaming)
        {
            return new StrongLaptop();
        }
        else if (needs == Needs.OfficeWork)
        {
            return new WeakLaptop();
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
}
