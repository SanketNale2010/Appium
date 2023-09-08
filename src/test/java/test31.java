import java.util.ArrayList;
import java.util.Iterator;

public class test31 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Sanket");
		list.add("sagar");
		list.add("mayur");
		
		
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			
			if (itr.next().contains("m")) {
				
				System.out.println(itr.next());
			}
			
			
		}
		
	}

}
