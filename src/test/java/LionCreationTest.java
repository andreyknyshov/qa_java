import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionCreationTest {

    /*
    Если feline обращается к базе данных или выполняет другие сложные операции, лучше
    создать стаб
    */
    @Mock
    private Feline feline;

    @Test()
    public void canCreateMaleLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertNotNull(lion);
    }

    @Test()
    public void canCreateFemaleLion() throws Exception {
        Lion lion =  new Lion("Самка", feline);
        Assert.assertNotNull(lion);
    }

    // Проверяем на появление ошибки
    @Test(expected = Exception.class)
    public void cannotCreateLionWithWrongSex() throws Exception {
        new Lion("abracadabra", feline);
    }
}
