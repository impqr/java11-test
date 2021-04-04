package java11;

import org.junit.Test;

public class StringTest {
    @Test
    public void lineCount() {
        String str = "abc\n\nefg";
        // 字符串的lines方法是一个流操作
        System.out.println(str.lines().count());
    }
}
