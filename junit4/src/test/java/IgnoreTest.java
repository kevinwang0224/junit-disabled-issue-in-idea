import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class IgnoreTest {

    @Ignore
    @Test
    public void ignoredMethod() {
        System.out.println("This is a ignored method.");
    }

    @Test
    public void enabledMethod() {
        System.out.println("This is a enabled method.");
    }
}
