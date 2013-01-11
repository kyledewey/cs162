import java.util.*;

public class MapExample {
    public static List<Integer> addAmount(List<Integer> list, int amount) {
	List<Integer> retval = new ArrayList<Integer>(list.size());
	for (Integer i : list) {
	    retval.add(i.intValue() + amount);
	}
	return retval;
    }
}
