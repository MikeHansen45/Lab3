import java.util.ArrayList;
import java.util.List;

public class PointList {
	
	//private Point3D array[][]=new Point3D[21][21];
	private ArrayList<ArrayList<Point3D>> list = new ArrayList<ArrayList<Point3D>>();//creates an array with 100 places named facets
	
	public void createList() {
		ConeCurve coneCurve = new ConeCurve();
		double stepSize = coneCurve.getStepSize();
		for (int i =-10; i <= 10; i= i+(int)stepSize) {
			ArrayList<Point3D> newlist = new ArrayList();
			for(int j =-10; j<=10  ;j++) {
				double z = coneCurve.getZ(i,j);
				double x = i;
				double y = j;
				newlist.add(new Point3D(y,x,z));
			}
			list.add(newlist);
		}
	}
	public void printList(){
		System.out.println("\nPoint Array");
		for (int i =0; i < list.size();i++) {
			for (int j=0;j <list.get(i).size(); j++){
				System.out.print(list.get(i).get(j)+ " ");
			}
			System.out.println();
		}
			
		
		}
		
	}



