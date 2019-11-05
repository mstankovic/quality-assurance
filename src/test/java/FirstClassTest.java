import org.junit.*;

public class FirstClassTest {


    @BeforeClass
    public static void beforeClassMethod() {
        System.out.println(FirstClassTest.class.getName() + " --> " + "Before Class Method");
    }

    @Before
    public void beforeEveryTestMethod() {
        System.out.println(FirstClassTest.class.getName() + " --> " + "Before Test Method");
    }

    @Test
    public void secondMethod() {
        System.out.println(FirstClassTest.class.getName() + " --> " + "Second Test Method");
    }

    @Test
    public void firstMethod() {
        System.out.println(FirstClassTest.class.getName() + " --> " + "First Test Method");
    }

    @After
    public void afterEveryTestMethod() {
        System.out.println(FirstClassTest.class.getName() + " --> " + "After Test Method");
    }

    @AfterClass
    public static void afterClassMethod() {
        System.out.println(FirstClassTest.class.getName() + " --> " + "After Class Method");
    }
}
