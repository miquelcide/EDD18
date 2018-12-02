public class Persona {
	private String nom;
	private int edat;
	private double pes;
	
	public Persona(String nom, int edat, double pes) {
		this.nom=nom;
		this.edat=edat;
		this.pes=pes;
	}
	
	public String NomComplet() {
		return (this.nom+" "+this.edat);
	}
	

}
