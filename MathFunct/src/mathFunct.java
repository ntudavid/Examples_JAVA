
public class mathFunct {
	
	public static double abs(double x){
		if(x<0){
			x = -x;
		}
		return x;
	}
	
	public static double expX(double x){
		double exp = 1.0;
		double term = 1.0;
		for(int i=1 ; i<=35; i++){
			term = term*x/i;
			exp = exp + term;
		}
		return exp;
	}
	
	public static double exp(double x){
		int z = (int)(x); 
		double f = x-z ;
		double exp1 = expX(1);
		double expAns = 1.0;
		for(int i=1; i<=abs(z); i++){
			expAns = expAns*exp1;
		}
		if(x<0){
			expAns = 1/expAns;
		}
		expAns = expAns*expX(f);
		return expAns;
	}
	
	public static double lnX(double x1){
		double x = x1 - 1;
		double ln = 0.0;
		double term = -1.0;
		for(int i=1 ; i<=35; i++){
			term = -1*term*x;
			ln = ln + term/i;
		}
		return ln;
	}
	
	public static double ln(double x){
		if(x<=0){
			System.out.println("Invalid input number.");
			return Double.NaN;
		}
		else{
			double cnt =0;
			double ln1p2 = lnX(1.2);
			while(x>1.2){
				cnt = cnt + 1;
				x = x/1.2;
			}
			return ln1p2*cnt + lnX(x);
		}
	}
	
	public static double power(double a, double b){ // power(a,b) = a^b = exp(b*ln(a))
		if(a == 0){
			if(b ==0){
				return 1.0;
			}
			else{
				return 0d;
			}
		}
		else if(a<0){
			int intB = (int)(b);
			if(b == intB){ 
				double ans = 1.0;
				double absA = abs(a);
				for(int i=1; i<=intB; i++){
					ans = ans*absA;
				}
				if(intB%2==0){
					return ans;
				}
				else{ // intB is odd, return
					return -ans;
				}
			}
			else{
				System.out.println("The answer is a complex number.");
				return Double.NaN;
			}
		}
		else{ // normal case
			return exp(b*ln(a));	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("exp(0) = " + exp(0));
		System.out.println("ln(1) = " + ln(1));
		System.out.println("pwr(-2.12,13) = " + power(-2.12, 13));
	
	}

}
