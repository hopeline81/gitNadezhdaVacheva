package ingredients.BallIceCream;

public abstract class BallOfIceCream {
    private Flavour flavour;
    private double price;

    public BallOfIceCream(Flavour flavour, double price) {
        this.flavour = flavour;
        this.price = price;
    }

    public void setFlavour(Flavour flavour) {
        this.flavour = flavour;
    }

    public double setPrice(Flavour flavour, double price) {
        price = 0.0;
        if(flavour.equals(Flavour.FLAVOUR_STRAWBERRY)) {
           price = 1.4;
        }else if(flavour.equals(Flavour.FLAVOUR_HAZELNUT)) {
            price = 1.7;
        }else if(flavour.equals(Flavour.FLAVOUR_CARAMEL)) {
                price = 1.3;
        }else if(flavour.equals(Flavour.FLAVOUR_CHOCOLATE)) {
            price = 1.5;
        }else if(flavour.equals(Flavour.FLAVOUR_VANILLA)) {
            price = 1.0;
        }
       return price;
    }
}
