package taller.java;
import java.lang.*;

public class ArrayMain {

	public static void main(String[] args) {
		      char[] b = new char[50];
		
		      char palabra[] = {'i','n','t','e','r','e','s','a','n','t','e'}; 
		     
		    
		      // copies an array from the specified source array
		      System.arraycopy(palabra, 0, b, 0, palabra.length);
		      System.out.println("la palabra tiene un ancho de " + palabra.length);
		      System.out.print("array2 = ");
		      System.out.print(b[0] + " ");
		      System.out.print(b[1] + " ");
		      System.out.print(b[2] + " ");
		      System.out.print(b[3] + " ");
		      System.out.print(b[4] + " ");
		      System.out.print(b[5] + " ");
		      System.out.print(b[6] + " ");
		      System.out.print(b[7] + " ");
		      System.out.print(b[8] + " ");
		      System.out.print(b[9] + " ");
		      System.out.print(b[10] + " ");
		    //  System.out.print(b[11] + " ");
		      
	}

}
