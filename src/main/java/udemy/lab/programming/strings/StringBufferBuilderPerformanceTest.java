package udemy.lab.programming.strings;

public class StringBufferBuilderPerformanceTest {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        long startTime = System.currentTimeMillis();
        System.out.println("Start Time for StringBuffer: " + startTime);
        for (int i = 0; i < 100000; i++) {
            buffer.append("World");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        StringBuilder builder = new StringBuilder("Hello");
        startTime = System.currentTimeMillis();
        System.out.println("Start Time for StringBuilder: " + startTime);
        for (int i = 0; i < 100000; i++) {
            builder.append("World");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
