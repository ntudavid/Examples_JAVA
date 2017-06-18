package classTest;

public class vectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector(5);
		double arr1[] = {2d,1d,2d,3d,2d};
		v1.setValue(arr1);
		v1.showData();
		
		Vector v2 = new Vector(5);
		double arr2[] = {1d,0d,-2d,2d,3d};
		v2.setValue(arr2);
		v2.showData();
		
		Vector v3 = v1.add(v2);
		v3.showData();
		
		System.out.println("Inner product of v1 and v2 = " + v1.dot(v2));
		System.out.println("Inner product of v2 and v3 = " + v2.dot(v3));
		System.out.println("Inner product of v1 and v3 = " + v1.dot(v3));
	}

}
