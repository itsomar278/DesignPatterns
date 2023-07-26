public class WeakLaptop extends Laptop {
  public WeakLaptop()
  {
        setValues();
  }
    @Override
    public String toString() {
        return "You need a weak Laptop{" +
                "Ram=" + Ram +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }

    @Override
    void setValues() {
this.CPU = "Intel i3";
        this.GPU = "GTX 1050";
        this.Ram = 8;

    }
}
