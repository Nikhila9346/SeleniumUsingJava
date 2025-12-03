package CoreJava.JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreamsTwo {
	
	//print all the elements having length>4 and convert them into uppercase
	@Test
	public void MapOperation() {
		
		Stream.of("Apple", "Mango", "Banana", "Cherry", "Atom")
			  .filter(s->s.length()>4)
			  .map(s->s.toUpperCase())
			  .forEach(s->System.out.println(s));
		System.out.println("--------------------");
	}
	
	//print names first letter starts with a with uppercase and sorted
	@Test
	public void sortList() {
		List<String> names = Arrays.asList("Apple", "Mango", "Banana", "Cherry", "Atom", "AaaA");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("---------------------");
	}
	
	//Stream.concat(Stream1, Stream2)
	@Test
	public void mergeStreams() {
		ArrayList<String> list = new ArrayList<String>();
		
		List<String> names = Arrays.asList("Apple", "Mango", "Banana", "Cherry", "Atom", "AaaA");
		Stream<String> newStream = Stream.concat(list.stream(), names.stream());
//		newStream.forEach(s->System.out.println(s));
		
		//anyMatch(condition)
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("aaaa"));
		Assert.assertTrue(flag);
		
		System.out.println("---------------------");
	}
	
	//to convert the stream into list..
	@Test
	public void collectStream() {
		List<String> l = Stream.of("Apple", "Mango", "Banana", "Cherry", "Atom", "AaaA").map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(l);
		System.out.println("---------------------");
	}
	
	
	@Test
	public void uniqueElements() {
		List<Integer> l1 = Arrays.asList(3, 2, 2, 1, 9, 7, 5, 7);
		
		//print unique elements in sorted 
		//give me 3rd smallest element
		l1.stream().distinct().sorted().forEach(s->System.out.println(s));
	}
}