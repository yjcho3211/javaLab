package sec09.exam01_instance_member;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("������");
		Car yourCar = new Car("����");
		
		
		myCar.model = "���׽ý�"; // �ν��Ͻ� �ʵ�
		myCar.run();   // �ν��Ͻ� �޼ҵ�
		yourCar.run(); // �ν��Ͻ� �޼ҵ�
		
		
		
	}

}
