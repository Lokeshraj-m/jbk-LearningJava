package collection.set;

import java.util.LinkedHashSet;

public class SetLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lh =new LinkedHashSet<>();
		lh.add(15);
		lh.add(89);
		lh.add(15);
		lh.add(35);
		System.out.println(lh);
	}

}
