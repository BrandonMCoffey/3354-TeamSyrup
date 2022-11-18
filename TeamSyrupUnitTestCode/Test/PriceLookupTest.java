import org.junit.Test;

import static org.junit.Assert.*;

public class PriceLookupTest {
    @Test
    public void getPrices(){
        PriceLookup priceTest = new PriceLookup();

        //If there's available price information on the item, it will return the average price of the item
        assertEquals(350,priceTest.getAveragePrice("nintendo-switch"));

        //If there's no available price information on the item, it will return 0
        assertEquals(0,priceTest.getAveragePrice("forza-horizon-5"));
    }
}