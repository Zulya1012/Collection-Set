package sets;
import java.util.*;
public class Dispatcher {
	public static void main(String[] args) {
		NavigableSet<Integer> ts = new TreeSet();
		ts.add(7);
		ts.add(2);
		ts.add(14);
		ts.add(9);
		ts.add(5);
//		System.out.println(ts);
//		System.out.println(ts.add(7));
//		System.out.println(ts);
//		System.out.println(ts.ceiling(10));
		NavigableSet<Car> tc = new TreeSet();
		tc.add(new Car(5000));
		tc.add(new Car(3000));
//		System.out.println(tc);
		NavigableSet<Integer> ts1 = ts.headSet(5,true);
//		System.out.println(ts1);
		ts1.add(3);
//		System.out.println(ts);
//		System.out.println(ts1);
		ts.add(8);
//		System.out.println(ts);
//		System.out.println(ts1);
		Iterator<Integer> iterator = ts.iterator();
		while(iterator.hasNext()) {
			Integer temp = iterator.next();
			temp++;
		}
			System.out.println(ts);
			Iterator<Car> carIterator = tc.iterator();
			while(carIterator.hasNext()) {
				Car temp = carIterator.next();
				temp.price++;
			}
			System.out.println(tc);
	}
}
class Car implements Comparable<Car>{
	int price;
	Car(int price){
		this.price = price;
	}
	public String toString() {
		return "" + this.price;
	}
	public int compareTo(Car c) {
		return this.price - c.price;
	}
}