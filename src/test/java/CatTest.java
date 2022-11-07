import com.example.Cat;
import com.example.Feline;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;
    @Mock
    private Feline feline;

    @Before
    public void init() {
        cat = new Cat(feline);
    }

    @Test
    public void catGetSoundReturnsMeow() {
        String expected = "Мяу";
        String actual = cat.getSound();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catGetFoodReturnsListOfFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Feline.PREDATOR_FOOD);

        List<String> expected = Feline.PREDATOR_FOOD;
        List<String> actual = cat.getFood();

        Assert.assertEquals(expected, actual);
    }
}
