package acquistofarmaci.control;

import java.util.ArrayList;
import java.util.HashMap;



import acquistofarmaci.entity.DettaglioFarmaco;
import acquistofarmaci.entity.DettaglioOrdine;
import acquistofarmaci.entity.Farmaco;
import acquistofarmaci.entity.Ordine;
import acquistofarmaci.entity.PrincipioAttivo;



public class GestioneFarmaci {
	private ArrayList<Farmaco> ListaFarmaci = new ArrayList<Farmaco>();
	private ArrayList<DettaglioOrdine> ListaDettagliOrdine = new ArrayList<DettaglioOrdine>();
	
	public ArrayList<Farmaco> getListaFarmaci() {
		return ListaFarmaci;
	}

	public void setListaFarmaci(ArrayList<Farmaco> listaFarmaci) {
		ListaFarmaci = listaFarmaci;
	}
	
	public void DecrementaQuantita(int a, PrincipioAttivo b) {
		int c = b.getQuantres() - a;
		b.setQuantres(c);
	}
	
	public Ordine EffettuaOrdine(HashMap<String,Integer> mappa, String codiceRicetta) {
		Ordine o = new Ordine();
		
		for (String key : mappa.keySet()) {
		
			
			for (Farmaco f : ListaFarmaci) {
			String codicef = f.getCodice();
			
			
			if(key.equals(codicef)) {
				Integer quantitaf = f.getQuantres();
				
				
				if(mappa.get(key)>quantitaf) {
					System.out.println("Quantità selezionata non disponibile\n");
					return null;
					}
					
				if(f.isPrescr()) {
					o.setCodiceRicetta(codiceRicetta);
					}
				
				
				if(f.isGalenico()) {
					ArrayList<DettaglioFarmaco> ListaDettagliFarmaco = f.getListaDettagliFarmaco();
					
					for(DettaglioFarmaco df : ListaDettagliFarmaco) {
						
						int a = df.getDose();
						PrincipioAttivo b = df.getPa();						
						DecrementaQuantita(a,b);
						
						
					}
					
				}
					
					DettaglioOrdine d = new DettaglioOrdine();
					d.setFarmaco(f);
					d.setQuantita(mappa.get(key));
					ListaDettagliOrdine.add(d);
					
					
					
				
					
			}
			
			
			
		}
		
		}
		o.setListaDettagliOrdine(ListaDettagliOrdine);
		System.out.println("Ordine eseguito con successo");
		return o;
		
	}
}
