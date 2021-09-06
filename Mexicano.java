package practica3;

public class Mexicano {
	String nom, rfc, curp;
	
	public Mexicano(String nom, String curp, String rfc){
		setNombre(nom);
		setCURP(curp);
		setRFC(rfc);
	}
	
	
	//--------Setters--------
	public void setNombre(String nom) {
		this.nom = nom;
		}
	public void setCURP(String curp) {
		this.curp = curp;
		}
	public void setRFC(String rfc) {
		this.rfc = rfc;
		}
	//--------Getters--------
	public String getNombre() {
		return nom;
	}
	public String getCURP() {
		return curp;
	}
	public String getRFC() {
		return rfc;
	}
	
}



