package cakeinheritence;

public class TasteTester {
    public static void main(String[] args) {
        // used a constructor with a string argument called flavor
        BirthdayCake bday = new BirthdayCake("Vanilla");
        bday.setPrice(30.0);
        bday.setCandles(5);

        WeddingCake weddingCake = new WeddingCake("chocolate");
        weddingCake.setTiers(7);
        weddingCake.setPrice(100.00);

        Cake cake = new Cake("lemon");
        cake.setPrice(20.0);


        System.out.println("Birthday cake costs: " + bday.getPrice() + " the flavor we have is " + bday.getFlavor()+ " it has " + bday.getCandles() + " candles");

        System.out.println("Wedding cake has " + weddingCake.getTiers() + " tiers, and it costs " + weddingCake.getPrice() + " and the flavor is " + weddingCake.getFlavor() );
        System.out.println(" cake costs " + cake.getPrice() + " and the flavor is " + cake.getFlavor() );

    }
}
