package acquistofarmaci.entity;

import java.util.ArrayList;

public class Farmaco {
	private String codice;
	private String nome;
	private int prezzo;
	private int quantres;
	private boolean prescr;
	private boolean galenico;
	private ArrayList<DettaglioFarmaco> ListaDettagliFarmaco = new ArrayList<DettaglioFarmaco>();
	
	public Farmaco(String codice, String nome, int prezzo, int quantres, boolean prescr, boolean galenico, ArrayList<DettaglioFarmaco> ListaDettagliFarmaco) {
		this.setCodice(codice);
		this.nome = nome;
		this.prezzo = prezzo;
		this.setQuantres(quantres);
		this.setPrescr(prescr);
		this.setGalenico(galenico);
		this.setListaDettagliFarmaco(ListaDettagliFarmaco);
	}
	
	public Farmaco(String codice, int quantres, boolean prescr, boolean galenico, ArrayList<DettaglioFarmaco> ListaDettagliFarmaco) {
		this.setCodice(codice);
		this.nome = "";
		this.prezzo = 0;
		this.setQuantres(quantres);
		this.setPrescr(prescr);
		this.setGalenico(galenico);
		this.setListaDettagliFarmaco(ListaDettagliFarmaco);
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public int getQuantres() {
		return quantres;
	}

	public void setQuantres(int quantres) {
		this.quantres = quantres;
	}

	public boolean isPrescr() {
		return prescr;
	}

	public void setPrescr(boolean prescr) {
		this.prescr = prescr;
	}

	public boolean isGalenico() {
		return galenico;
	}

	public void setGalenico(boolean galenico) {
		this.galenico = galenico;
	}

	public ArrayList<DettaglioFarmaco> getListaDettagliFarmaco() {
		return ListaDettagliFarmaco;
	}

	public void setListaDettagliFarmaco(ArrayList<DettaglioFarmaco> listaDettagliFarmaco) {
		ListaDettagliFarmaco = listaDettagliFarmaco;
	}

}
