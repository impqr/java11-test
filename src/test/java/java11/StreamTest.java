package java11;

import org.junit.Test;

import java.util.stream.Stream;

public class StreamTest {
    @Test
    public void create() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        // 流被终止之后无法再使用
        stream.forEach(System.out::println);
    }

    @Test
    public void takeWhile() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        // 从流中根据判定器获取true的元素，如果为false则马上停止
        stream.takeWhile(i -> i < 4).forEach(System.out::println);
    }

    @Test
    public void dropWhile() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        // 从流中根据判定器丢弃true的元素，如果为false则马上停止并返回剩下值
        stream.dropWhile(i -> i < 4).forEach(System.out::println);
    }

    @Test
    public void iterate() {
        // 流的迭代（这是一个无限流，直接输出会出问题）
        Stream<Integer> iterate = Stream.iterate(1, i -> i + 1);
        iterate.limit(10).forEach(System.out::println);
    }

    @Test
    public void iterateLimit() {
        // 流的迭代（有界的迭代）
        Stream<Integer> iterate = Stream.iterate(1, i -> i < 100, i -> 2 * i + 1);
        iterate.forEach(System.out::println);
    }
}
