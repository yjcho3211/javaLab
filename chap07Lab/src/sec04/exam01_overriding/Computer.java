package sec04.exam01_overriding;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer ��ü�� areaCircle()����");
		return Math.PI * r * r;
		
	}

}
