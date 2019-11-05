import org.junit.*;

public class SecondClassTest {


    @BeforeClass
    public static void beforeClassMethod() {
        System.out.println(SecondClassTest.class.getName() + " --> " + "Before Class Method");
    }

    @Before
    public void beforeEveryTestMethod() {
        System.out.println(SecondClassTest.class.getName() + " --> " + "Before Test Method");
    }

    @Test
    public void secondMethod() {
        System.out.println(SecondClassTest.class.getName() + " --> " + "Second Test Method");
    }

    @Test
    public void firstMethod() {
        System.out.println(SecondClassTest.class.getName() + " --> " + "First Test Method");
        System.out.println("Failing " + SecondClassTest.class.getName() + " --> " + "First Test Method");
        assert false;
    }

    @After
    public void afterEveryTestMethod() {
        System.out.println(SecondClassTest.class.getName() + " --> " + "After Test Method");
    }

    @AfterClass
    public static void afterClassMethod() {
        System.out.println(SecondClassTest.class.getName() + " --> " + "After Class Method");
    }
}
