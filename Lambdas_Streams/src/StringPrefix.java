import java.util.*;
import java.util.stream.Collectors;
public class StringPrefix {
	public static void main(String[] args) {
		List<String> n=Arrays.asList("aloha","Shravya","xyz","abc","amd","bgf");
		pre(n).forEach(System.out::println);
	}
	static List<String> pre(List<String> list) {
		return list.stream().filter(s->(s.length()==3 && s.charAt(0)=='a')).collect(Collectors.toList());
	}
}