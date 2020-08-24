package questions;
import Q11otherP.Oclass; //Imports the package and the class

public class Q11 {
	public float getF() {
		Oclass f = new Oclass();//instantiate object f using the Oclass constructor 
		System.out.println("Floating Variables from other package:");//title used in console
		System.out.println(f.var1);//Prints first floating-variables
		System.out.println(f.var2 + "\n");
		return f.var1;
		
		
	}
}
