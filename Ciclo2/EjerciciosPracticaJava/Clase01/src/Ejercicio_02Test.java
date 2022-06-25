import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ejercicio_02Test {
    //private final Ejercicio_02 ej02 = new Ejercicion_02();

    @Test
    public void contadorDigitos() {
        //given
        var numeroIngresado = "12345";
        var expectativa = 5;
        //then
        int resultado = Ejercicio_02.contadorDigitos(numeroIngresado);

        assertEquals(expectativa, resultado);;
    }
}
