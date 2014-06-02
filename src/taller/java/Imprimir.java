package taller.java;

public class Imprimir {
  private Imprimible ob;
  
  public Imprimir (Imprimible ob){
	  this.ob = ob;
  }
  
  public void imprimirObjetoPorImpresora(){
	 /* todo el código relacionado con imprimir */ 
	 System.out.println(this.ob.imprimir()); 
    // EL método imprimir está construido en Cliente.java al final.
  }
  
}
