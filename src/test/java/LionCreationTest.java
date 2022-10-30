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
        new Lion("Самец", feline);
    }

    @Test()
    public void canCreateFemaleLion() throws Exception {
        new Lion("Самка", feline);
    }

    @Test(expected = Exception.class)
    public void cannotCreateLionWithWrongSex() throws Exception {
        new Lion("abracadabra", feline);
    }
}
