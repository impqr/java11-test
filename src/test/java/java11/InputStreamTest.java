package java11;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {
    @Test
    public void copyFile() {
        try (var input = new FileInputStream("file1");
             var output = new FileOutputStream("file2")) {
            // 多了个transferTo方法，不需要开发者去管理缓存了
            input.transferTo(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
