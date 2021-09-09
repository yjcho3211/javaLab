package sec05.exam02_final_method;

public class SprotsCar extends Car {

	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//Cannot override the final method from Car
	/*
	@Override
	public void stop() {
		System.out.println("½ºÆ÷Ã÷Ä«¸¦ ¸ØÃã");
		speed = 0;
	}
	*/
	
}
