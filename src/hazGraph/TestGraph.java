package hazGraph;

import java.util.HashSet;
import java.util.Set;

public class TestGraph {
	Set<String> theData;
	
	
	public TestGraph() {
		theData = new HashSet<>();
	}
	
	public void add(String str) {
		theData.add(str);
	}
	
	public boolean search(String str) {
		String temp = "";
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				temp += (""+ch);
			}
		}
		return theData.contains(temp);		
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(String st : this.theData) {
			result += (st + ", ");
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		TestGraph obj = new TestGraph();
		
		obj.add("haz");
		
		System.out.println(obj);
		System.out.println();
	}

}
