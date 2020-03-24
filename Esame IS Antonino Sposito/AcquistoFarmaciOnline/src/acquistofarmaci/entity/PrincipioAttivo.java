package acquistofarmaci.entity;

public class PrincipioAttivo {
	private String codice;
	private String nome;
	private String tipo;
	private int quantres;
	
	public PrincipioAttivo(String codice, String nome, String tipo, int quantres) {
		this.codice = codice;
		this.nome = nome;
		this.tipo = tipo;
		this.setQuantres(quantres);
		
	}
	
	public PrincipioAttivo(String codice, int quantres) {
		this.codice = codice;
		this.nome = "";
		this.tipo = "";
		this.setQuantres(quantres);
		
	}
	
	public PrincipioAttivo() {
		this.codice = "";
		this.nome = "";
		this.tipo = "";
		this.setQuantres(0);
		
	}

	public int getQuantres() {
		return quantres;
	}

	public void setQuantres(int quantres) {
		this.quantres = quantres;
	}

}
