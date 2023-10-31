import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Tests {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> lList = new LinkedList<>();
		
		Object obj = new String("ABCD");
		obj = new Integer(10);
		if(obj instanceof String) {
			System.out.println(((String)obj).length());
		}else if(obj instanceof Integer) {
			System.out.println(((Integer)obj)+10);			
		}
		//obj.
		String str = new String("B");
		//str.
	}
}
