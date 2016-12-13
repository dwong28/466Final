import java.util.ArrayList;
import java.lang.Math;
public class Vector implements Comparable<Vector> {
	ArrayList<Integer> points;
	Integer classifier;
	Double distance;
	
	public Vector(ArrayList<Integer> dataRow) {
		this.points = new ArrayList<Integer>();
		for(int i = 0; i < dataRow.size() - 2; i ++) {
			points.add(dataRow.get(i));
		}
		classifier = dataRow.get(dataRow.size() - 1);
	}
	
	/*Write a function that takes in a vector and returns the distance.*/
	public void computeDistance(ArrayList<Integer> vectorB) {
		double dist = 0;
		for (int i = 0; i < vectorB.size(); i++) {
			double temp = this.points.get(i) - vectorB.get(i);
			dist += Math.pow(temp, 2);
		}

		return Math.sqrt(dist);
	}
	
	/*Implement a comparator on distance*/
	@Override
	public int compareTo(Vector o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
