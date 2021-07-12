package ingredients.containers.containerCup;

public abstract class Container {
    private ContainerType containerType;
    private ContainerSize containerSize;
    private double price;

    public Container(ContainerType containerType, ContainerSize containerSize, double price) {
        this.containerType = containerType;
        this.containerSize = containerSize;
        this.price = price;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public ContainerSize getContainerSize() {
        return containerSize;
    }

    public double setPrice(ContainerSize containerSize, double price) {
         price = 0.0;
        if(containerSize.equals(ContainerSize.SMALL_SIZE)) {
            price = 0.1;
        }else if(containerSize.equals(ContainerSize.MEDIUM_SIZE)) {
            price = 0.15;
        }else if(containerSize.equals(ContainerSize.BIG_SIZE)) {
            price = 0.2;
        }
        return price;
    }
}
