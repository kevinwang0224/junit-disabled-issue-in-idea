import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class DisabledTest {

    @Disabled
    @Test
    void disabledMethod() {
        System.out.println("This is a disabled method.");
    }

    @Test
    void enabledMethod() {
        System.out.println("This is a enabled method.");
    }
}
