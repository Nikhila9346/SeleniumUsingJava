package CoreJava.JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStreamsTwo {
	
	//print all the elements having length>4 and convert them into uppercase
	@Test
	public void MapOperation() {
		Stream.of("Apple", "Mango", "Banana", "Cherry", "Atom")
			  .filter(s->s.length()>4)
			  .map(s->s.toUpperCase())
			  .forEach(s->System.out.println(s));;
	}
	
	//print names first letter starts with a with uppercase and sorted
	@Test
	public void sortList() {
		List<String> names = Arrays.asList("Apple", "Mango", "Banana", "Cherry", "Atom", "AaaA");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
