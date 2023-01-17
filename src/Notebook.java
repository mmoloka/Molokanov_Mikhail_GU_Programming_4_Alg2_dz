public class Notebook {

    private double price;
    private int ram;
    private Brand brand;

    public Notebook(double price, int ram, Brand brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public Brand getBrand() {
        return brand;
    }
}
