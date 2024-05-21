package none;
import java.util.Arrays;

public class Sorter implements Runnable {
    private final int[] array;
    private final int start;
    private final int end;

    public Sorter(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        Arrays.sort(array, start, end);
    }
}
