package lowOfDemeterEx;

public class House implements IHouse {
    private IAddress address;
    private String color;
    private String size;

    public House(IAddress address, String color, String size) {
        this.address = address;
        this.color = color;
        this.size = size;
    }

    @Override
    public IAddress getAddress() {
        return address;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String getZipCode() {
        return address.getZipCode();
    }
}
