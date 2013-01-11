import java.util.*;

public class FilterExample {
    public static List<Integer> getGreaterThanAmount(List<Integer> list,
						     int amount) {
	List<Integer> retval = new ArrayList<Integer>(list.size());
	for (Integer i: list) {
	    if (i.intValue() > amount) {
		retval.add(i);
	    }
	}
	return retval;
    }
}
