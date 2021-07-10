import enums.ContainerSize;
import enums.ContainerType;
import enums.Flavour;
import enums.Topping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a price:");
        double price = scanner.nextDouble();


        IceCream melbaStrawberry = new IceCream(ContainerSize.SIZE_SMALL,
                ContainerType.TYPE_CUP,
                Flavour.TYPE_STRAWBERRY,
                3,
                Topping.TOPPING_CHOCOLATE,
                1.5
                );
        IceCream melbaChocolate = new IceCream(ContainerSize.SIZE_MEDIUM,
                ContainerType.TYPE_FUNNEL,
                Flavour.TYPE_CHOCOLATE,
                5,
                Topping.TOPPING_COCONUT,
                2.3
                );
        IceCream melbaSweat = new IceCream(ContainerSize.SIZE_BIG,ContainerType.TYPE_FUNNEL,
                Flavour.TYPE_CARAMEL,
                5,
                Topping.TOPPING_COCONUT,
                2.3);
        IceCream melbaBig = new IceCream(ContainerSize.SIZE_SMALL, ContainerType.TYPE_FUNNEL,
                Flavour.TYPE_STRAWBERRY,
                4,
                Topping.TOPPING_MARSHMELOW,
                6.0);
        IceCream melbaDesire = new IceCream(ContainerSize.SIZE_BIG, ContainerType.TYPE_FUNNEL,
                Flavour.TYPE_VANILLA,
                6,
                Topping.TOPPING_COCONUT,
                5.0);

        List<IceCream> iceCreamList = new ArrayList<>();
        iceCreamList.add(melbaStrawberry);
        iceCreamList.add(melbaChocolate);
        iceCreamList.add(melbaSweat);
        iceCreamList.add(melbaBig);
        iceCreamList.add(melbaDesire);

       iceCreamList.stream()
               .filter(s -> s.getPrice() < price)
               .forEach(System.out::println);
    }
}
