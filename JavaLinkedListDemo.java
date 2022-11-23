https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder

import java.util.LinkedList;
import java.util.Iterator;

public class JavaLinkedListDemo {

	public static Car mostExpensive(LinkedList<Car> carList) {
		
		if (carList.isEmpty()) { return null; }
		
		Car expensiveCar = null;
		Car c = null;
		
		// traverse the list using index
		
		int high = 0;
		for (int i=0; i<carList.size(); i++) {
			c = carList.get(i);
			int p = c.getPrice();
			if (p > high) {
				high = p;
				expensiveCar = c;
			}
		}

		return expensiveCar;
	}
	
	public static Car oldest(LinkedList<Car> carList) {
		
		if (carList.isEmpty()) { return null; }
		
		Car oldestCar = null;
		Car c = null;
		
		// traverse the list using index
		
		int oldestYear = 10000;
		for (int i=0; i<carList.size(); i++) {
			c = carList.get(i);
			int y = c.getYear();
			if (y < oldestYear) {
				oldestYear = y;
				oldestCar = c;
			}
		}

		return oldestCar;
	}

	
	public static void main(String[] args) {

		LinkedList<Car> carLinkedList = new LinkedList<>();
		
		Car c= null;
		c = new Car("V111WXY", "Honda", 2013, 20000);
		carLinkedList.add(c);
		c = new Car("V789JKL", "Ford", 2020, 25000);
		carLinkedList.add(c);
		c = new Car("V555LMN", "Hyundai", 2005, 15000);
		carLinkedList.add(c);
		c = new Car("V876FOX", "Chevy", 2010, 20000);
		carLinkedList.add(c);
		c = new Car("V100DOG", "Toyota", 2010, 17000);
		carLinkedList.add(c);
		
		// print all cars in the list
		// traverses the list using iterator
		
		Iterator<Car> carIterator = carLinkedList.iterator();
		
		System.out.println("Print all cars in the list");
		while (carIterator.hasNext()) {
			System.out.println(carIterator.next());
		}
		
		System.out.println("\nPrint most expensive car");
		System.out.println(mostExpensive(carLinkedList));
		
		System.out.println("\nPrint oldest car");
		System.out.println(oldest(carLinkedList));
		
	}

}
