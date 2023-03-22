package day12;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
	
	
	
	public boolean equals(Object o) {
		
		if(this == o)
			return true;
		if(o!=null && o instanceof Value) {
			Value v = (Value)o;
			if(value == v.value) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash();
	}
	
	@Override
	public String toString() {
		return "Value[" + value + "]";
	}
	
	
}


public class EqualsTest3 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null)); 
		System.out.println(v1.equals(v3)); 
		System.out.println(v1.equals(v2));		//true
		System.out.println(v1.equals(new Date())); 

		Set<Value> hash = new HashSet<>();
		hash.add(v1);
		hash.add(v2);
		hash.add(v3);
		
		Iterator<Value> v = hash.iterator();
		while(v.hasNext()) {
			System.out.println(v.next());
		}
		
		//해쉬코드가 다 다름
		System.out.println(v1.hashCode());		//41
		System.out.println(v2.hashCode());		//41
		System.out.println(v3.hashCode());		//51
		
		
		
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		v2 = v1;
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}


}
