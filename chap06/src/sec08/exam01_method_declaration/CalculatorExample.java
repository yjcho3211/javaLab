package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: "+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 =myCalc.divide(x, y); 
		// �ڵ��� ��ȯ: int(4) <- byte(1)
		// ������ ��ȯ: byte(1) <- int(4), 
		// ��) int num = 10,
		//    byte b1 = (byte) num;
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
		
		
	}

}
