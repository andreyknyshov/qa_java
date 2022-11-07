import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;
    private final String LION_SEX = "Самка";

    @Test
    public void lionGetKittensReturnsOne() throws Exception {
        Lion lion = new Lion(LION_SEX, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);

        int expected = 1;
        int actual = lion.getKittens();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lionGetFoodReturnsListOfFood() throws Exception {
        Lion lion = new Lion(LION_SEX, feline);
        Mockito.when(feline.getFood(Feline.PREDATOR_TYPE)).thenReturn(Feline.PREDATOR_FOOD);

        List<String> expected = Feline.PREDATOR_FOOD;
        List<String> actual = lion.getFood();

        Assert.assertEquals(expected, actual);
    }


}
