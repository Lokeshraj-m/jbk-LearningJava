package collection.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Check {
	public static void student() {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(11, "lokesh", 21, "nakupoochi"));
		al.add(new Student(2, "srinivasan", 61, "samiyaru"));
		al.add(new Student(9, "anandh", 8, "thavakala"));
		al.add(new Student(50, "thulasi", 3, "nandu"));
		al.add(new Student(3, "bala", 22, "vathu"));
		al.add(new Student(31, "shahil", 45, "aamaii"));
		al.add(new Student(100, "gowtham", 99, "koranguu"));
		al.add(new Student(26, "roshini", 68, "Princess"));
		al.add(new Student(30, "dhivya", 91, "bootham"));
		al.add(new Student(15, "keerthi", 50, "inum peru vekala"));
		al.add(new Student(35, "revanth", 50, "inum peru vekala"));
		Collections.sort(al);
		//Collections.sort(al, new ComparatorAge());
		System.out.println(al);
		for (Student su : al) {
			System.out.println(su);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("enter  the  name");
		String name = input.nextLine();
		
		for(Student st :al) {
			if (st.getName().equals(name)) {
				System.out.println("your age = "+st.getAge() +"   "+ "your nickname = " +st.getNickname());
				
			}
		}
	}
	public static void main(String[] args) {
		Check.student();
	}
	
	}

