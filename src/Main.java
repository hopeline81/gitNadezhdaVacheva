
import ingredients.BallIceCream.Flavour;
import ingredients.Topping;
import ingredients.containers.containerCup.ContainerSize;
import ingredients.containers.containerCup.ContainerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a price:");
        double price = scanner.nextDouble();


        IceCream melba1 = new IceCream("Sunshine"
                ,ContainerSize.SMALL_SIZE
                ,ContainerType.TYPE_CUP
                ,Flavour.FLAVOUR_STRAWBERRY
                ,5
                , Topping.TOPPING_COCONUT
                );
        IceCream melba2 = new IceCream("Sunny day"
                ,ContainerSize.SMALL_SIZE
                ,ContainerType.TYPE_CUP
                ,Flavour.FLAVOUR_CARAMEL
                ,3
                , Topping.TOPPING_CHOCOLATE
        );
        IceCream melba3 = new IceCream("Choco"
                ,ContainerSize.SMALL_SIZE
                ,ContainerType.TYPE_CUP
                ,Flavour.FLAVOUR_HAZELNUT
                ,6
                , Topping.TOPPING_CHOCOLATE
        );
        IceCream melba4 = new IceCream("Caramel"
                ,ContainerSize.BIG_SIZE
                ,ContainerType.TYPE_FUNNEL
                ,Flavour.FLAVOUR_VANILLA
                ,4
                , Topping.TOPPING_COCONUT
        );

        List<IceCream> iceCreamList = new ArrayList<>();
        iceCreamList.add(melba1);
        iceCreamList.add(melba2);
        iceCreamList.add(melba3);
        iceCreamList.add(melba4);

       iceCreamList.stream()
               .filter(s -> s.setPrice() < price)
               .forEach(System.out::println);
    }
}
