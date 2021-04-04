package java11;

import org.junit.Test;

import java.util.List;

public class CollectionTest {
    @Test
    public void of() {
        // NotEditable in <Collection>.of() method
        List<String> a = List.of("a", "b", "c");
        System.out.println(a);
        // a.add("d");
    }
}
