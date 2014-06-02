package taller.java;

public class Admin implements Imprimible{

	private String usuario;
	private String pass;
	
	public Admin(String usuario, String pass){
	this.usuario = usuario;
	this.pass = pass;
	}
	
	public String getUsuario(){
		return usuario;
		}
	
	public void setUsuario (String usuario){
	this.usuario = usuario;
	}	
	
	public String getPass(){
		return pass;
		}
	
	public void setPass (String pass){
	this.pass = pass;
	}	
	
	
	@Override
	public String imprimir() {
		return this.usuario +"- "+ this.pass;
	}

}
