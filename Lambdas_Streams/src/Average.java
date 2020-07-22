import java.util.*;
public class Average {
	public static double calculateAverage(List<Integer> numbers){
		return numbers.stream().mapToInt(j -> j).average().getAsDouble();   
	}
	public static void main(String[] args){
		List<Integer> numbers=new ArrayList<Integer>();
		for(int i=1;i<=5;i++) {
			numbers.add(i);
		}
		double average=calculateAverage(numbers);
		System.out.println("The average is : "+average);
	}

}
