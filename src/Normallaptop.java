public class Normallaptop extends Laptop {

    public Normallaptop()
    {
        setValues();
    }

    @Override
    public String toString() {
        return "You need a Normal Laptop{" +
                "Ram=" + Ram +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }

    @Override
    void setValues() {
        this.CPU = "Intel i7";
        this.GPU = "GTX 1660 TI";
        this.Ram = 16;
    }
}
