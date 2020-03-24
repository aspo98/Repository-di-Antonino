package acquistofarmaci.entity;

import java.util.ArrayList;

public class Ordine {
	private String idcodice;
	private ArrayList<DettaglioOrdine> ListaDettagliOrdine = new ArrayList<DettaglioOrdine>();
	private String CodiceRicetta;
	
	public Ordine(String idcodice, ArrayList<DettaglioOrdine> ListaDettagliOrdine, String CodiceRicetta ) {
		this.idcodice = idcodice;
		this.setListaDettagliOrdine(ListaDettagliOrdine);
		this.setCodiceRicetta(CodiceRicetta);
	}
	
	public Ordine() {
		this.idcodice = null;
		this.setListaDettagliOrdine(null);
		this.setCodiceRicetta(null);
	}

	public String getCodiceRicetta() {
		return CodiceRicetta;
	}

	public void setCodiceRicetta(String codiceRicetta) {
		CodiceRicetta = codiceRicetta;
	}

	public ArrayList<DettaglioOrdine> getListaDettagliOrdine() {
		return ListaDettagliOrdine;
	}

	public void setListaDettagliOrdine(ArrayList<DettaglioOrdine> listaDettagliOrdine) {
		ListaDettagliOrdine = listaDettagliOrdine;
	}
	

}
