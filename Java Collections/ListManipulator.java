/**
 * @Author Nhu Ly
 * @Date 10/20/2022
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ListManipulator {
	public static void main(String[] args) {
		ListManipulator obj = new ListManipulator();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10); a.add(9); a.add(12); a.add(-1);
		a.add(10); a.add(9);
		
		System.out.println("a = "+a);
		
		System.out.println("Swapping => "+obj.swapLargestSmallest(a));
		
		System.out.println("Sorting  => "+obj.sort(a, false));
		
		obj.table(a);
		
		
	}
	
	/**
	 * Accepting array lists of integers
	 * Sorting in ascending and descending order
	 * @param myLst
	 * @param ascending
	 * @return
	 */
	ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
		ArrayList<Integer> list = (ArrayList<Integer>) myLst.clone();
		if(ascending)	Collections.sort(list);
		else Collections.sort(list, Collections.reverseOrder());
		return list;
	}
	
	/**
	 * Accepting array lists of integers
	 * Swapping positions of the largest and smallest values
	 * @param myLst
	 * @return
	 */
	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
		ArrayList<Integer> list = (ArrayList<Integer>) myLst.clone();
		int minIndex = 0, maxIndex = 0;
		for(int i=0 ; i<list.size() ; i++) {
			if(list.get(i) > list.get(maxIndex))
				maxIndex = i;
			if(list.get(i) < list.get(minIndex))
				minIndex = i;
		}
		int t1 = list.get(minIndex), t2 = list.get(maxIndex);
		list.set(minIndex, t2); list.set(maxIndex, t1); 
		return list;
	}
	
	/**
	 * Accepting array lists of integers
	 * Creating a table of unique values and number of times each value occurs
	 * Sorting the table
	 * @param myLst
	 */
	void table(ArrayList<Integer> myLst) {
		HashMap<Integer, Integer> frequency = new HashMap<>();
		for(int i=0 ; i<myLst.size() ; i++) {
			if(!frequency.containsKey(myLst.get(i))) {
				frequency.put(myLst.get(i), 1);
			} else {
				frequency.put(myLst.get(i), frequency.get(myLst.get(i))+1);
			}
		}
		Map<Object, Object> sortedMap = frequency.entrySet().stream()
		        .sorted(Comparator.comparingInt(e -> e.getValue()))
		        .collect(Collectors.toMap(
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                (a, b) -> { throw new AssertionError(); },
		                LinkedHashMap::new
		        ));
		for(Object key : sortedMap.keySet()) {
			System.out.println(key +"\t:\t"+ sortedMap.get(key));
		}
	}
}
