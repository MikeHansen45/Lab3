import java.util.ArrayList;

public class DoubleList { 
	private ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();// empty array to instatiate later


	public void createList() {
		ConeCurve coneCurve = new ConeCurve();
		double stepSize = coneCurve.getStepSize();
		for (int i =-10; i <= 10; i= i+(int)stepSize) {
			ArrayList<Double> newlist = new ArrayList();
			for(int j =-10; j<=10 ;j++) {
				double z = coneCurve.getZ(i,j);

				newlist.add(z);
			}
			list.add(newlist);
		}
	}
	public void printList(){
		System.out.println("Double Array");
		for (int i =0; i < list.size();i++) {
			for (int j=0;j <list.get(i).size(); j++){
				System.out.print(list.get(i).get(j)+ " ");
			}
			System.out.println();
		}
		
	}
	
	
}


