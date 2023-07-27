public class StrongLaptop extends Laptop {

public StrongLaptop()
{
    setValues();
}
    @Override
    public String toString() {
        return "You need a Strong Laptop{" +
                "Ram=" + Ram +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }

    @Override
    void setValues() {
this.CPU = "Intel i9";
        this.GPU = "RTX 2080 TI";
        this.Ram = 32;
    }
}
