package cakeinheritence;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake bday = new BirthdayCake();
        bday.setPrice(30.0);
        bday.setFlavor("Vanilla");
        bday.setCandles(5);

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("chocolate");
        weddingCake.setTiers(7);
        weddingCake.setPrice(100.00);
        System.out.println("Birthday cake costs: " + bday.getPrice() + " the flavor we have is " + bday.getFlavor()+ " it has " + bday.getCandles() + " candles");

        System.out.println("Wedding cake has " + weddingCake.getTiers() + " tiers, and it costs " + weddingCake.getPrice() + " and the flavor is " + weddingCake.getFlavor() );

    }
}
