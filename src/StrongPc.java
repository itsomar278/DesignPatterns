public class StrongPc extends Pc
{
    @Override
    public String toString() {
        return "You need a StrongPc{" +
                "Ram=" + Ram +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", ScreenRefreshRate='" + ScreenRefreshRate + '\'' +
                '}';
    }

    public StrongPc()
    {
        setValues();
    }
    @Override
    void setValues() {
        this.CPU = "Intel i9-13900K";
        this.GPU = "RTX 4090";
        this.Ram = 64;
        this.ScreenRefreshRate = "240 Hz";

    }
}
