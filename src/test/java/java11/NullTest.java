package java11;

import org.junit.Test;

import java.util.Optional;

public class NullTest {
    @Test
    public void nullTest() {
        Optional<Object> o = Optional.ofNullable(null);
        Optional<Object> o2 = Optional.ofNullable("");
        // isEmpty只能判断是否为null，空字符串无法判断
        if (o.isEmpty()) {
            System.out.println("o is null");
        }
        if (o2.isEmpty()) {
            System.out.println("o2 is null");
        }
    }
}
