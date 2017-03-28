package lecture1;

import java.text.DecimalFormat;

public class ShortestDistance {

	public static double distance(double x1, double y1,double z1, double x2, double y2 , double z2)
	{
		return Math.sqrt ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2-z1) * (z2-z1) );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
		double dist =0.0;
		int p1 =0, p2 =1;
		int i=0,j=0;
		double shortestdistance = distance (points[p1][0],points[p1][1],points[p1][2],points[p2][0],points[p2][1],points[p2][2]);
		for (i =0;i< 6; i++)
		{
			for(j =i+1; j< 8; j++)
				
				{dist = distance(points[i][0],points[i][1],points[i][2],points[j][0],points[j][1],points[j][2]);
			
			if (dist < shortestdistance)
			{
				p1=i;
				p2=j;
				
				shortestdistance = dist;
			}
				}
		}
		
		DecimalFormat df = new DecimalFormat (".##");
		System.out.println("Nearest points are: (" + points[p1][0]+","+points[p1][0] +","+points[p1][0] +") and ("+ points[p2][0]+","+points[p2][1] +","+points[p2][2] + ") and shortest distance is : "+ df.format(shortestdistance));
		
		
	}

}
