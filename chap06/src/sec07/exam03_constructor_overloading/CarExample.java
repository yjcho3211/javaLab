package sec07.exam03_constructor_overloading;

import sec06.exam01_field_declaration.car;
import sec07.exam04_other_constructor_call.Car;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new car();
		System.out.println("car1.company: "+car1.company);
		System.out.println("car1.maxspeed: "+car1.maxSpeed);
		
		car car4 = new car("택시", "검정", 200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car41.maxspeed: "+car4.maxSpeed);
	}

}
