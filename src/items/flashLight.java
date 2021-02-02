package items;

public class flashLight extends Item {
    private static final int price =2;
    private boolean status;           //is flashLight turned on
    public static final String name = "flashLight";

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    @Override
    public String toString() {
        return "FlashLight  " + price;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }

}
