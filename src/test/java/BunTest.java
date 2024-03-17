import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {
    private String name = "Burger";
    private float price = 10.5F;
    private Bun bun =  new Bun(name, price);

    @Test
    public void testGetName() {
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void testGetPrice() {
        Assert.assertEquals(price, bun.getPrice(), 0);
    }
}