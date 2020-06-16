package chapter05;

public class Method_ex {
	
	int e; 	//객체변수

	public int sum(int a, int b) {
		return a+b;
	}

	public int vartest(int d) {
		d++;
		return d;
	}
	
	//객체변수 메서드
	public void vartest(Method_ex t1) {
		t1.e++;
	}
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		Method_ex my1 = new Method_ex();
		int c = my1.sum(a, b);
		System.out.println(c);
		System.out.println("===================");
		
		int d = 1;
		Method_ex my2 = new Method_ex();
		d = my2.vartest(d);
		System.out.println(d);
		System.out.println("===================");
		
		Method_ex my3 = new Method_ex();
		my3.e = 3;
		my3.vartest(my3);
		System.out.println(my3.e);
		
	}

}
