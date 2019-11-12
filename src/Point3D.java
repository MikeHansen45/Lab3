
public class Point3D {
	private double x;
	private double y;
	private double z;
	
	
	public Point3D(double x, double y, double z) {
		//constructor to populate the x y and z
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static Point3D calcNormal(Point3D v1, Point3D v2, Point3D v3) {
		double a1= v2.x - v1.x;
		double b1 = v2.y - v1.y;
		double c1= v2.z - v1.z;
		double a2 = v3.x -v2.x;
		double b2 = v3.y -v2.y;
		double c2 = v3.z -v2.z;
	    double a = b1 * c2 - b2 * c1; 
	    double b = a2 * c1 - a1 * c2; 
	    double c = a1 * b2 - b1 * a2; 
	    double mag = Math.sqrt((a*a)+(b*b)+(c*c));
		Point3D normal = new Point3D(a/mag,b/mag,c/mag);
		return normal;
	}

	@Override
	public String toString() {//to string 
		return  "(" + x + " " + y + " " + z + ")" ;
	}
	
	
	
	

}
