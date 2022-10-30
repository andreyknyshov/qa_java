import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineKittensCountTest {
    int kittensCount;

    public FelineKittensCountTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters()
    public static Object[][] data() {
        return new Object[][]{{0}, {1}, {-1}, {Integer.MAX_VALUE}, {Integer.MIN_VALUE}};
    }

    @Test
    public void felineGetKittensReturnsKittensCount() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);

        Assert.assertEquals(kittensCount, actual);
    }
}
