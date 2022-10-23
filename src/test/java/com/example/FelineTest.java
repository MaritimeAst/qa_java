package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int kittenNumber;
    private final int expected;

    public FelineTest(int kittenNumber, int expected) {
        this.kittenNumber = kittenNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittenNumber() {
        return new Object[][] {
                {1, 1},
                {0, 0},
                {100, 100},
        };
    }

    @Test
    public void felineGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittenNumber);

        assertEquals(expected, actual);
    }

    @Test
    public void felineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void felineGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";

        assertEquals(expected, actual);
    }
}
