import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    @Mock
    private Feline feline;

    @Test
    public void getFriendsReturnCorrectList() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expectedValues = List.of("Marty", "Gloria", "Melman");

        List<String> actualValues = alex.getFriends();

        assertEquals("method return incorrect values", expectedValues, actualValues);
    }

    @Test
    public void getPlaceOfLivingReturnCorrectValue() throws Exception {
        Alex alex = new Alex(feline);
        String expected = "New York Zoo";

        String actual = alex.getPlaceOfLiving();

        assertEquals("method return incorrect value", expected, actual);
    }

    @Test
    public void getKittensReturnZero() throws Exception {
        Alex alex = new Alex(feline);
        int expected = 0;

        int actual = alex.getKittens();

        assertEquals("method return incorrect value", expected, actual);
    }
}
