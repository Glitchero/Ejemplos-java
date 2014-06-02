package taller.java;

public class app {

	public static void main(String[] args) {
		Coche c1=new Coche();
		c1.acelera();
		System.out.println(c1.velocidad);
		c1.para();
		System.out.println(c1.velocidad);
	}

}
