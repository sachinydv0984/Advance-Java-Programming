package area2;

interface Area{
	double PI=3.24;
	void getArea();
}

class Rectangle implements Area{
	int l,b;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	
	@Override
	public void getArea() {
		
		int r=l*b;
		System.out.println("Area of Rectangleis="+r);
	}
	void displayResult() {
		System.out.println("This is display  funcction in rectangle");
	}
}

public class MainArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(24,26);
		r1.getArea();
		r1.displayResult();
		Area r2=new Rectangle(34,56);     //upcasting
		r2.getArea();
		Area circle=new Area() {
		  int r=4;
			@Override
			public void getArea() {
				double result =3.14*r*r;
				System.out.println("Area of Circle="+result);
	 }
		};
		circle.getArea();
	}

}
