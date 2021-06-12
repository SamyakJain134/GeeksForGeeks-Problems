package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesfLimitedRangeArrayElements {
	static void findFrequency(int [] arr,
            int n)
{
Map<Integer, Integer> mp
= new HashMap<Integer, Integer>();

// traverse the array
	for (int i = 0; i < n; i++)
{

// update the frequency
		if (!mp.containsKey(arr[i]))
			mp.put(arr[i],0);

		mp.put(arr[i],mp.get(arr[i])+1);
}

// traverse the hashmap
		for (Map.Entry<Integer, Integer> kvp : mp.entrySet())
		{
			System.out.println("Element " + kvp.getKey() +
         " occurs " + kvp.getValue() +
         " times");
}
}
}
