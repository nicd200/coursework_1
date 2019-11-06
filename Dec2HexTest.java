import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void TestWithCorrectInteger() {
        Dec2Hex.Arg1 = 30;
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Dec2Hex.Arg1;
        String hexadecimal = "";
        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }
        String result = hexadecimal;

        assertEquals("1E", result);

    }
}
