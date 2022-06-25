public class Ejercicio_04 {

    static double centigradosaFahrenheit(int n) {
        double conversion = 32 + (9 * (double) n / 5);
        return conversion;
    }
    public static void main(String[] args) {
        var result = centigradosaFahrenheit(25);
        System.out.println(result);
    }
}
