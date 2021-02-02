package items;

public class Key extends Item {
    private static final int price =10;
    private String name;



    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return name + " Key" + "   " + price;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
