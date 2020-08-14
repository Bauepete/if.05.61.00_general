/**
 *
 * @author PRE
 */
public class Triangle {
    private int a,b,c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getType() {
        // Abpruefen auf Dreiecksungleichungen
        if  (    (a + b < c)
              || (a + c < b)
              || (b + c < a)
            ) {
            return "kein Dreieck";
        }

        // Abpruefen auf Gleichseitigkeit
        if (a == b && b == c ) {
            return "gleichseitig";
        } 
        
        // Abpruefen auf Gleichschenkeligkeit
        if (  (   (a == b) && (b != c))
               ||((b == c) && (a != b))
               ||((a == c) && (b != a))
              ) {
            return "gleichschenkelig";
        }

        return "ungleichseitig";
    }
}
