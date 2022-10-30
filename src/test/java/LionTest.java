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

import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    private boolean hasMane;
    private String sex;
    @Mock
    private Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {{"Самец", true}, {"Самка", false}};
    }

    public LionTest(String sex, boolean hasMane) {
        this.hasMane = hasMane;
        this.sex = sex;
    }

    @Test
    public void lionGetKittensReturnsOne() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);

        int expected = 1;
        int actual = lion.getKittens();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lionGetFoodReturnsListOfFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood(Feline.PREDATOR_TYPE)).thenReturn(Feline.PREDATOR_FOOD);

        List<String> expected = Feline.PREDATOR_FOOD;
        List<String> actual = lion.getFood();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lionHasManeDependedOfSex() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(hasMane, actual);
    }
}
