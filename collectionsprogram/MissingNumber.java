package collectionsprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = {1,5,6,2,4,3,8,9};
		
		List<Integer> arr=new ArrayList<Integer>();
	for(Integer i:num) {
		arr.add(i);
			}
Collections.sort(arr);
for(int i=0;i<arr.size();i++) {
	if(arr.get(i)!=(i+1)) {
		System.out.println("my missing number:"+(i+1));
		break;
	}
}
	}

}
