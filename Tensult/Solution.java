/**
 * Given a statement : Order the unique words by frequency first then by length of the word and then by position from left.
 * 
 * Input Statement :
 * "India is a great country and I will work towards making our country the better India”
 * 
 * Output for this statement :
 * country, india, towards, making, better, great, will, work, and, our, the, is, a, i,
 */

import java.util.*;

class Solution  {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		output(s);
	}
	
	static void output(String s)    {
	    s = s.trim().toLowerCase();
	    String[] words = s.split(" ");
	    
	    ArrayList<ArrayList> list = worker(words);
	    
	    for(int i = 0 ; i < list.size() ; i++)
	        for(int j = 0 ; j < list.get(i).size() ; j++)
	            System.out.print(list.get(i).get(j) + ", ");
	}
	
	static ArrayList<ArrayList> worker(String arr[])    {
        HashMap<String, Integer> freqMap = new HashMap<String, Integer>(); 
        int size = arr.length, i, j;
  
        for (i = 0 ; i < size ; i++) 
            if (freqMap.containsKey(arr[i]))
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            else
                freqMap.put(arr[i], 1);
        
        ArrayList<ArrayList> set = new ArrayList<ArrayList>(0);
        
        for (j = size-1 ; j > 0  ; j--) {
            ArrayList<String> subset = new ArrayList<String>(0); //group by freq
            for (i = 0 ; i < size ; i++)
                if (freqMap.get(arr[i])==j)
                    subset.add(arr[i]);
            
            ArrayList<String> subsetout = new ArrayList<String>(0);
            
            for (String element : subset)
                if (!subsetout.contains(element))
                    subsetout.add(element);
            
            subsetout.sort(Comparator.comparing(String::length).reversed()); //sort by size
                    
            if(subsetout.size() > 0)
                set.add(subsetout);
        }
        return set;
    } 
}
