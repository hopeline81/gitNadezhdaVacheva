
import ingredients.BallIceCream.BallOfIceCream;
import ingredients.BallIceCream.Flavour;
import ingredients.Topping;
import ingredients.containers.containerCup.Container;
import ingredients.containers.containerCup.ContainerSize;
import ingredients.containers.containerCup.ContainerType;

public class IceCream {
    private String name;
    private ContainerSize containerSize;
    private ContainerType containerType;
    private Flavour flavour;
    private int numberOfBalls;
    private Topping topping;

    public IceCream(String name
            , ContainerSize containerSize
            , ContainerType containerType
            ,Flavour flavour
            , int numberOfBalls
            , Topping topping
    ) {
        this.name = name;
        this.containerSize = containerSize;
        this.containerType = containerType;
        this.flavour = flavour;
        this.numberOfBalls = numberOfBalls;
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public ContainerSize getContainerSize() {
        return containerSize;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public int getNumberOfBalls() {
        return numberOfBalls;
    }

    public Topping getTopping() {
        return topping;
    }

    public double setPrice( ) {
        int numberOfBalls = getNumberOfBalls();
        double priceOfBall = getPriceOfBall();
        double priceOfContainer = getPriceOfContainer();
        return (numberOfBalls * priceOfBall) + priceOfContainer;
    }

    private double getPriceOfBall() {
        double priceOfBall = 0.0;
        if(flavour.equals(Flavour.FLAVOUR_STRAWBERRY)) {
            priceOfBall = 1.4;
        }else if(flavour.equals(Flavour.FLAVOUR_HAZELNUT)) {
            priceOfBall = 1.7;
        }else if(flavour.equals(Flavour.FLAVOUR_CARAMEL)) {
            priceOfBall = 1.3;
        }else if(flavour.equals(Flavour.FLAVOUR_CHOCOLATE)) {
            priceOfBall = 1.5;
        }else if(flavour.equals(Flavour.FLAVOUR_VANILLA)) {
            priceOfBall = 1.0;
        }
        return priceOfBall;
    }

    private double getPriceOfContainer(){
        double priceOfContainer = 0.0;
        if(containerSize.equals(ContainerSize.SMALL_SIZE)) {
            priceOfContainer = 0.1;
        }else if(containerSize.equals(ContainerSize.MEDIUM_SIZE)) {
            priceOfContainer = 0.15;
        }else if(containerSize.equals(ContainerSize.BIG_SIZE)) {
            priceOfContainer = 0.2;
        }
        return priceOfContainer;
    }

    @Override
    public String toString() {
        return "-------------" + getName() + "-----------\n" +
                "Size: " + containerSize +
                "\nContainer:" + containerType +
                "\nIce cream:" +
                "\n" + flavour +
                " - " + numberOfBalls +
                "\nTopping: " + topping +
                "\nPrice: " + setPrice() + "\n";
    }
}
