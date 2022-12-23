package Practical;
interface Printable {
	   void display();
	}
	interface Calculate {
	   int  cal(int n);
	}
	class Calsq implements Printable, Calculate {
	   public void display() {
	      System.out.print("square of a number:");
	   }
	   public int cal(int a) {
	      return a*a;
	   }
	}
	class Calcube implements Printable, Calculate {
		   public void display() {
		      System.out.print("Cube of a number: ");
		   }
		   public int cal(int a) {
		     return a* a *a;
		   }
	}
	
public class UseInterfa {

	public static void main(String[] args) {
		Calsq cs = new Calsq();
		cs.display();
		System.out.println(cs.cal(5));
		
		Calcube cc = new Calcube();
		cc.display();
		System.out.println(cc.cal(5));

	}

}
