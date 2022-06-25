import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Ejercicio_04Test {
    //private final Ejercicio_02 ej02 = new Ejercicion_02();

    @Test
    public void centigradosaFahrenheit() {
        //given
        var num = 25;
        var expected = 77.0;
        //when
        var resultado = Ejercicio_04.centigradosaFahrenheit(num);
        //then
        assertEquals(resultado, expected, 0.1);;
    }
}
