package collectionsprogram;



import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] num = {4,3,6,8,29,1,2,4,7,8};
		System.out.println("The duplicate numbers : ");
	
		Set<Integer>duplist=new TreeSet<Integer>();
			for(int i=0;i<num.length;i++) {				
		 {
			if(!duplist.add(num[i])) {
				System.out.println(num[i]);
			}
		}
	}
						

	}
	}

