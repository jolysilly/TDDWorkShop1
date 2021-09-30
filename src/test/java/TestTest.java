import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestTest {
    private final String input;

    TestTest(String input) {
        this.input = input;
    }

    public boolean startWithInc(){
     return input.startsWith("[");
    }

    @Test
    @DisplayName("")
    public void case01(){

    }
}