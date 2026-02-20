package area;

 abstract class Area{
	int r,l,b;
	Area(String msg){
		System.out.println(msg);
	}
	void getArea() {
		System.out.println("This is area class");
	}
}
class Circle extends Area{
	final double PI=3.14;
	Circle (int r){
		super("This is area constructor");
		this.r=r;
	}
	void getCircleArea() {
		double result=PI*super.r*this.r;
		System.out.println("Area of Circle="+result);
	}
}
public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Circle c=new Circle(5);
       c.getArea();
       c.getCircleArea();
//       Area a=new Circle(34);                             //upcasting
//       a.getArea();											
//       Circle c=(Circle) new Area("abc");                    //downcasting
//       c.getArea();
//       c.getCircleArea();
	}
}
