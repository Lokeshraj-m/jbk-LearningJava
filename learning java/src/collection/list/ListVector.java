package collection.list;

import java.util.Collections;
import java.util.Vector;

public class ListVector {
	
	public static void main(String[] args) {
		Vector<String> vr = new Vector<>();
		vr.add("lokesh");
		vr.add("raj");
		vr.add("loke");
		vr.add("lokesh");
		vr.add("finzly");
		Collections.sort(vr);
		System.out.println(vr);
		System.out.println(vr.get(3));
		vr.setSize(10);
		System.out.println(vr.size());
		System.out.println(vr.capacity());
		System.out.println(vr);
		vr.insertElementAt("first", 1);
		System.out.println(vr);
		System.out.println(vr.indexOf("lokesh"));
		for(String values : vr) {
			System.out.println(values);
		}
		vr.clear();
		System.out.println(vr);
		System.out.println(vr.isEmpty());
	}
	
	
	
	
}
