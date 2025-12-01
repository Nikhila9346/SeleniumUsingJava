package CoreJava;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class Iterator1 {

	public static void main(String[] args) {
		
		//Iterator - Java object which is used to traverse through the elements one at a time

		List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

        Iterator<String> it = fruits.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
	}

}
