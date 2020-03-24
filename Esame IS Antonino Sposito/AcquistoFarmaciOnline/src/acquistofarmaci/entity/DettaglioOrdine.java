package acquistofarmaci.entity;

public class DettaglioOrdine {
	
	private int quantita;
	private Farmaco farmaco;
	
	
    public DettaglioOrdine( int quantita, Farmaco f) {
    	
    	this.setQuantita(quantita);
    	this.farmaco = f;
     }
    
   
    
    
    public DettaglioOrdine() {
    	
    	this.quantita = 0;
    	this.farmaco = null;
     }


	public int getQuantita() {
		return quantita;
	}


	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}


	public Farmaco getFarmaco() {
		return farmaco;
	}


	public void setFarmaco(Farmaco farmaco) {
		this.farmaco = farmaco;
	}

}
