import enums.ContainerSize;
import enums.ContainerType;
import enums.Flavour;
import enums.Topping;

public class IceCream {
    private ContainerSize containerSize;
    private ContainerType containerType;
    private Flavour flavour;
    private int numberOfBalls;
    private Topping topping;
    private double price;

    public IceCream(ContainerSize containerSize, ContainerType containerType, Flavour flavour, int numberOfBalls, Topping topping, double price) {
        this.containerSize = containerSize;
        this.containerType = containerType;
        this.flavour = flavour;
        this.numberOfBalls = numberOfBalls;
        this.topping = topping;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "size: " + containerSize +
                "\nContainer:" + containerType +
                "\nflavour- " + flavour +
                ", number of balls:" + numberOfBalls +
                "\ntopping" + topping +
                "\nprice: " + price;
    }
}
