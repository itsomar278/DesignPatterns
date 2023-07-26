public class NormalPc extends Pc{
    public NormalPc()
    {
        setValues();
    }

    @Override
    public String toString() {
        return "You need a NormalPc{" +
                "Ram=" + Ram +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", ScreenRefreshRate='" + ScreenRefreshRate + '\'' +
                '}';
    }

    @Override
    void setValues() {
        this.CPU = "Intel i7-9th Gen";
        this.GPU = "RTX 3060";
        this.Ram = 32;
        this.ScreenRefreshRate = "144 Hz";
    }
}
