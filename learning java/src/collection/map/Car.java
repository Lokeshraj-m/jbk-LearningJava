package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
public class Car {
	HashMap<String, HashMap<String, ArrayList<String>>> indiaCar() {
		ArrayList<String> tata = new ArrayList<>();
		tata.add("nano");
		tata.add("nexon");
		tata.add("harrier");
		tata.add("punch");
		tata.add("altroz");
		tata.add("tiago");
		ArrayList<String> honda = new ArrayList<>();
		honda.add("jazz");
		honda.add("city");
		honda.add("amaze");
		honda.add("wr-v");
		ArrayList<String> hyndai = new ArrayList<>();
		hyndai.add("creta");
		hyndai.add("venue");
		hyndai.add("i20");
		hyndai.add("santro");
		hyndai.add("aura");
		ArrayList<String> toyota = new ArrayList<>();
		toyota.add("fortuner");
		toyota.add("crysta");
		toyota.add("vellfire");
		toyota.add("cruiser");
		
		HashMap<String, ArrayList<String>> brand = new HashMap<>();
		brand.put("Tata",tata);
		brand.put("Honda",honda);
		brand.put("Hyndai",hyndai);
		brand.put("Toyota",toyota);
		
		HashMap<String, HashMap<String, ArrayList<String>>> car = new HashMap<>();
		car.put("Car", brand);  
		return car;
	}
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.indiaCar());
		HashMap<String, ArrayList<String>> h =  c.indiaCar().get("Car");
		for(String fg: h.keySet()) {
			System.out.println(h.get(fg));
		}
	}

}
