import java.awt.Point;



public class getCoordinates {

	//if slope is not equal
	// the longest side is smaller than the sum of others
	
	
	
	public static void main( String []args){
		
		
		
		Point p1 = new Point(0,0);   //A
		double x1 = p1.getX();
		double y1 = p1.getY();
		Point p2 = new Point(2,6);	//B
		double x2 = p2.getX();
		double y2 = p2.getY();
		Point p3 = new Point(4,0);	//C
		double x3 = p3.getX();
		double y3 = p3.getY();
		
		//find if they form a triangle
		
		double slopeAB = (y2-y1)/(x2-x1);
		double slopeBC = (y3-y2)/(x3-x2);
		
		if(slopeAB != slopeBC){
			//valid triangle
			double distAB =Math.sqrt( (Math.pow((x2-x1), 2) +  Math.pow((y2-y1), 2))) ;
			double distBC =Math.sqrt( (Math.pow((x3-x2), 2) +  Math.pow((y3-y2), 2)));
			double distAC =Math.sqrt( (Math.pow((x3-x1), 2) +  Math.pow((y3-y1), 2))) ;
			
			if(distAB == distAC || distAB == distBC || distBC == distAC ){
				System.out.println("isoceles");
			}
			else
				System.out.println("not isoceles");
		}
		else
			System.out.println("invalid");
		
		
		
	}

}
