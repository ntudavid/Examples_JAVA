package classTest;

public class Vector {
	private int vLen;
	public double[] vData;
	public Vector(int length){
		vLen = length;
		vData = new double[vLen];
	}
	public void showData(){
		for(int i=0; i<vLen; i++){
			System.out.print(vData[i] + " ");
		}
		System.out.println();
	}
	public void setValue(double arr[]){
		int len = arr.length;
		if(vLen<len){
			len = vLen;
		}
		for(int i=0; i<len; i++){
			vData[i]=arr[i];
		}
	}
	public Vector add(Vector vect){
		int len = vect.vLen;
		Vector vectorAns = new Vector(len);
		if(this.vLen!=len){
			System.out.println("Unmatched dimension!");
		}
		else{
			for(int i=0; i<len; i++){
				vectorAns.vData[i] = this.vData[i] + vect.vData[i];
			}
		}
		return vectorAns;
	}
	public double dot(Vector vect){
		int len = vect.vLen;
		double ans = 0;
		if(this.vLen!=len){
			System.out.println("Unmatched dimension!");
		}
		else{
			for(int i=0; i<len; i++){
				ans = ans + this.vData[i]*vect.vData[i];
			}
		}
		return ans;
	}
}
