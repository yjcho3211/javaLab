package verify.exam16;

public class Printer {
	//�޼ҵ�
	static void println(int value) {
		System.out.println(value);
	}
	
	//�޼ҵ� �����ε�(overloading)
	static void println(boolean value) {
		System.out.println(value);
	}
	
	static void println(double value) {
		System.out.println(value);
	}
	
	
	static void println(String value) {
		System.out.println(value);
	}
}
