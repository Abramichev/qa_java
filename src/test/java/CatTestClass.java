import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTestClass {

    @Mock
    Cat cat;

    @Test
    public void getsound_returns_мяу() throws Exception {

        Mockito.when(cat.getSound()).thenReturn("мяу");
       // Mockito.when(cat.getSound()).thenReturn(List.of("Рыба","Мясо","Сметана"));
    }

    @Test
    public void getfood_returns_list() throws Exception {

        Mockito.when(cat.getFood()).thenReturn(List.of());
    }


}
