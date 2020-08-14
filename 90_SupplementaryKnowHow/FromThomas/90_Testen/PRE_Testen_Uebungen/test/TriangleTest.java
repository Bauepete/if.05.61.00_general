import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PRE@HTL
 */
public class TriangleTest {

    public TriangleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test 1: gültiger Wert
     */
    @Test
    public void test010GetTriangleType() {
        System.out.println("getTriangleType Testfall 1: nur Dreiseit");
        //String result = Main.getTriangleType((double) 1,(double) 2,(double) 3);
        String result = Main.getTriangleType(1,2,3);
        String expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(1,3,2);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(2,3,1);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(2,1,3);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(3,1,2);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(3,2,1);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(1,2,4);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(6,16,30);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
    }

    /**
     * Test 2: gleichseitiges Dreieck
     */
    @Test
    public void test020GetTriangleType() {
        System.out.println("getTriangleType Testfall 2: gleichseitiges Dreieck");
        String result = Main.getTriangleType(3,3,3);
        String expResult = "gleichseitig";
        assertEquals(expResult, result);
    }

    /**
     * Test 3: gleichschenkeliges Dreieck
     */
    @Test
    public void test030GetTriangleType() {
        System.out.println("getTriangleType Testfall 3: gleichschenkeliges Dreieck");
        String result = Main.getTriangleType(2,3,2);
        String expResult = "gleichschenkelig";
        assertEquals(expResult, result);
        result = Main.getTriangleType(3,2,2);
        expResult = "gleichschenkelig";
        assertEquals(expResult, result);
        result = Main.getTriangleType(2,2,3);
        expResult = "gleichschenkelig";
        assertEquals(expResult, result);
    }

    /**
     * Test 4: eine Seite = 0
     */
    @Test
    public void test040GetTriangleType() {
        System.out.println("getTriangleType Testfall 4: eine Seite = 0");
        String result = Main.getTriangleType(0,2,3);
        String expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(2,0,3);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(2,3,0);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
    }

    /**
     * Test 5: eine Seite negativ
     */
    @Test
    public void test050GetTriangleType() {
        System.out.println("getTriangleType Testfall 5: eine Seite negativ");
        String result = Main.getTriangleType(-1,2,3);
        String expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(2,-1,3);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
        result = Main.getTriangleType(2,3,-1);
        expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
    }

    /**
     * Test 6: ungleichseitiges Dreieck
     */
    @Test
    public void test060GetTriangleType() {
        System.out.println("getTriangleType Testfall 6: ungleichseitiges Dreieck");
        String result = Main.getTriangleType(4,2,3);
        String expResult = "ungleichseitig";
        assertEquals(expResult, result);    }

    /**
     * Test 7: zuwenige Parameter
     */
    @Test
    public void test070GetTriangleType() {
        System.out.println("getTriangleType Testfall 7: zuwenige Parameter");
        String result = Main.getTriangleType(4,2);
        String expResult = "Falsche Parameteranzahl: Aufruf mit 3 Seiten";
        assertEquals(expResult, result);}


    /**
     * Test 8: zuviele Parameter
     */
    @Test
    public void test080GetTriangleType() {
        System.out.println("getTriangleType Testfall 8: zuviele Parameter");
        String result = Main.getTriangleType(4,2,4,5);
        String expResult = "Falsche Parameteranzahl: Aufruf mit 3 Seiten";
        assertEquals(expResult, result);
    }

    /**
     * Test 9: alle Seiten = 0
     */
    @Test
    public void test090GetTriangleType() {
        System.out.println("getTriangleType Testfall 9: alle Seiten = 0");
        String result = Main.getTriangleType(0,0,0);
        String expResult = "kein Dreieck möglich (nur Dreiseit)";
        assertEquals(expResult, result);
    }

//    /**
//     * Test 10: mit Dezimalzahlen
//     * ANMERKUNG: Wird vom Compiler geprüft, daher Test nicht möglich
//     */
//    @Test
//    public void test090GetTriangleType() {
//        System.out.println("getTriangleType Testfall 10: mit Dezimalzahlen");
//        String result = Main.getTriangleType(4.0,2.0,3.0);
//        String expResult = "kein Dreieck möglich (nur Dreiseit)";
//        assertEquals(expResult, result);
//    }

}