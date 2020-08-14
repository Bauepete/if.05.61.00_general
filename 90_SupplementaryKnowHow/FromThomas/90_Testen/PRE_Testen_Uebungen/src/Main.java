
/**
 *
 * @author PRE@HTL
 */
public class Main {

    public static void main(String... args) {
        // main() nicht implementiert --> Unit-Tests
    }

    /**
     * Ermittlung des Dreiecktyps
     *
     * Mögliche Rückgaben:<br />
     *  * Falsche Parameteranzahl: Aufruf mit 3 Seiten<br />
     *  * kein Dreieck möglich (nur Dreiseit)<br />
     *  * gleichseitig<br />
     *  * gleichschenkelig<br />
     *  * ungleichseitig<br />
     *
     * @param seiten
     * @return Typ des Dreiecks
     */
    public static String getTriangleType(double... seiten) {

        // auf korrekte Parameterzahl abpruefen
        if (seiten.length != 3) {
            return "Falsche Parameteranzahl: Aufruf mit 3 Seiten";
        }

        double a = seiten[0];
        double b = seiten[1];
        double c = seiten[2];

        // Abpruefen auf Dreiecksungleichungen
        if (!(a + b > c) || !(a + c > b) || !(b + c > a)) {
            return "kein Dreieck möglich (nur Dreiseit)";
        }

        // Abpruefen auf Gleichseitigkeit
        if (a == b && b == c) {
            return "gleichseitig";
        }

        // Abpruefen auf Gleichschenkeligkeit
        if (((a == b) && (b != c)) || ((b == c) && (a != b)) || ((a == c) && (b != a))) {
            return "gleichschenkelig";
        }

        return "ungleichseitig";
    }

    /**
     *
     * @param seiten
     * @return Typ des Dreiecks
     */
//    public static String getTriangleType(int ... seiten) {
//
//        // auf korrekte Parameterzahl abpruefen
//        if (seiten.length != 3) {
//            return "Falsche Parameteranzahl: Aufruf mit 3 Seiten";
//        }
//
//        double a = seiten[0];
//        double b = seiten[1];
//        double c = seiten[2];
//
//        return getTriangleType(a,b,c);
//    }
}
