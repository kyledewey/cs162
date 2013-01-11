import java.util.*;

public class FoldLeftExample {
    public static int summation(List<Integer> list) {
	int sum = 0;
	for (Integer i : list) {
	    sum += i.intValue();
	}
	return sum;
    }
}
