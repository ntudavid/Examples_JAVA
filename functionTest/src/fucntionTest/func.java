package fucntionTest;

public class func {
	
	public static int factorial_recursive(int x){
		if(x == 1){
			return 1;
		}
		else{
			return factorial_recursive(x-1)*x;
		}
	}
	
	public static int factorial(int x){
		int fact = 1;
		for(int i=2; i<=x; i++){
			fact = fact*i;
		}
		return fact;
	}
	
	public static void test(int a){
		a = a+2;
		System.out.println("In function, a = " + a);
	}

	public static void main(String[] args) {
		int n = 5;
		test(n);
		System.out.println("n = " + n);
		
		int ans = factorial(n);
		System.out.println(ans);
		System.out.println(factorial_recursive(n));
	}

}
