import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Palindrome {
	public static void main(String[] args) {
		List<String> a=Arrays.asList("madam","car","hello","abc","mom");
			palindrome(a,PalindromeCheck::palcheck).forEach(System.out::println);
		}
	static List<String> palindrome(List<String> list, Predicate<String> myp) {
			return list.stream().filter(str -> myp.test(str)).collect(Collectors.toList());
		}
}