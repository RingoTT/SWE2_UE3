package at.jku.ssw.app;

import Items.*;

public class Example {

    public static void main(String[] args) {
        Item chives = new Herb("Schnittlauch", 10, 5);
        Item spiderLeg = new AnimalProduct("Spinnenbein");
        Item darkpotion = new Potion("Dunkeltrank", chives, spiderLeg);
        Item nightpotion = new Potion(
                "Nachttrank",
                darkpotion,
                spiderLeg);


        print(chives);

        print(spiderLeg);

        print(darkpotion);

        print(nightpotion);

    }

    public static void print(Item item) {
        System.out.println(item);
        System.out.println(item.getPrice() + " Geld");
        System.out.println(item.getPower());
        System.out.println(item.getCooldown());
        System.out.println(item.getReducedPrice(DiscountRate.HIGH) + " Geld");
        System.out.println(item.getReducedPrice() + " Geld");
        System.out.println();
    }
}
