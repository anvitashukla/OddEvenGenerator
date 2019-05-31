
import java.util.*;
import java.util.stream.*;
public class EvenOdd {
	public static void main(String[] args){
		int[] input = {1, 3, 2, 5, 4, 7, 10, 1, 2, 2, 4};
		List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toList());
		Collections.sort(list);
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++){
			if(list.get(i)%2==0){
				even.add(list.get(i));
			}else{
				odd.add(list.get(i));
			}
		}
		String leftOut = "";
		List<Integer> finalL = new ArrayList<Integer>();
		for(int i=0,j=0;i<odd.size() && j<even.size();i++,j++){
			finalL.add(odd.get(i));
			finalL.add(even.get(j));
			if(i==odd.size()-1)
				leftOut = "even";
			else
				leftOut = "odd";
		}
		
		if(leftOut.equals("even")){
			for(int i=odd.size();i<even.size();i++){
				finalL.add(even.get(i));
			}
		}else{
			for(int i=even.size();i<odd.size();i++){
				finalL.add(odd.get(i));
			}
		}
		
		for(int i=0;i<finalL.size();i++){
			System.out.print(finalL.get(i) + ".");
			
		}
		System.out.println();
		if(finalL.get(0)%2==0){
			System.out.println("Even-Odd");
		}else{
			System.out.println("Odd-Even");
		}
		
	}
}
