import com.example.Feline;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    private Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void felineGetFoodReturnsListOfFood() throws Exception {
        List<String> expected = Feline.PREDATOR_FOOD;
        List<String> actual = feline.eatMeat();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void felineGetFamilyReturnsFeline() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensWithoutArgumentsReturnsOne() {
        int expected = 1;
        int actual = feline.getKittens();

        Assert.assertEquals(expected, actual);
    }


}
