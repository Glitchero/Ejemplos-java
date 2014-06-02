package taller.java;

public class Principal {

	public static void main(String[] args) {
		
      Cliente cli = new Cliente("11-1","nom1");
      
      Imprimir impresora = new Imprimir(cli);
      
      impresora.imprimirObjetoPorImpresora();
      
	}

}
