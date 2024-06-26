import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @ParameterizedTest
    @CsvSource({
            "Emilia,4",
            "Jarosław,6",
            "Maja,3",
            "Stanisława,5"
    })
    public void isCompleted(String input, int expected) {
        // when
        int wynik = Main.countLettersAndReturnPosition(input);

        // then
        Assertions.assertEquals(expected, wynik);
    }

}
