package max_points_on_a_line;

public class Main {
	
	// Definition for a point.
	 public  static class  Point {
	      int x;
	      int y;
	      Point() { x = 0; y = 0; }
	      Point(int a, int b) { x = a; y = b; }
	  }
	 public static void main(String[] args) {
		 Point p1=new Point(1,1);
		 Point p2=new Point(1,1);
		 Point p3=new Point(2,3);
		 Point[] points=new Point[3];
		 points[0]=p1;
		 points[1]=p2;
		 points[2]=p3;
		 //points[1]=p2;
		 System.err.println(points.length);
		 int num= maxPoints2(points);
		 System.err.println(num);
	}
	
	 public static int maxPoints(Point[] points) {
		 int x_delta1,y_delta1,x_delta2,y_delta2,maxTemp;
		 int n = points.length;
		 if(n<2)
			 return n;
		 else{
			 int maxnum=2;
			 for(int i=0;i<n-1;i++){
				 int dup=0;
				 for(int j=i+1;j<n;j++){
					 x_delta1 = points[i].x-points[j].x;
					 y_delta1 = points[i].y-points[j].y;
					 if(x_delta1==0&&y_delta1==0){//新探测节点和源节点是重合的
						 dup++;
						 }
					 else{
						 //不重合
						 maxTemp = 2;
						 for(int k=j+1;k<n;k++){
							 x_delta2 = points[i].x-points[k].x;
							 y_delta2 = points[i].y-points[k].y;
							 if(x_delta1*y_delta2 ==x_delta2*y_delta1){
								 maxTemp++;
								 }
							 }
						 if(maxTemp+dup>maxnum)
							 maxnum=maxTemp+dup;
						 }
					 }
			 if(1+dup>maxnum)
					 maxnum = 1+dup;
				 }
			 return maxnum;
			 }
	 }
	 public static int maxPoints2(Point[] points){
		 int n=points.length;
		 if(n<=2){
			 return n;
		 }else{
			 int max=2,tempMax=0;
			 for(int i=0;i<n;i++){
				 int dup=0;
				 for(int j=i+1;j<n;j++){
					 if(points[j].x==points[i].x&&points[j].y==points[i].y)
						 dup++;
					 else{
						 //不和当前重合节点。
						 tempMax=2;
						int dx1=points[i].x-points[j].x;
						int dy1=points[i].y-points[j].y;
						 for(int k=j+1;k<n;k++){
							 int dx2=points[k].x-points[i].x;
							 int dy2=points[k].y-points[i].y;
							 if(dx1*dy2==dy1*dx2){		 
								 tempMax++;
							 }	  
						 }	
						 if(dup+tempMax>=max)
								max=dup+tempMax;
					 }
					
				 }
				 if(dup+1>=max)
					 max=dup+1; 
			 }
			 
			 return max;
		 }  
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
