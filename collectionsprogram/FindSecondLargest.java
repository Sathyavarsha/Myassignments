package collectionsprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		// a) Create a empty Set Using TreeSet
               Set<Integer> num=new TreeSet<Integer>();
              for(int i:data) {
            	  num.add(i);
              }
           List<Integer> l=new ArrayList<Integer>(num);
           Collections.sort(l);
           System.out.println(l);
           System.out.println(l.get(4));
              }
	}


