package verify.exam16;

public class Printer {
	//메소드
	static void println(int value) {
		System.out.println(value);
	}
	
	//메소드 오버로딩(overloading)
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
