package acquistofarmaci.entity;

public class DettaglioFarmaco {
 private int dose;
 private PrincipioAttivo pa;

 
 public DettaglioFarmaco (int dose, PrincipioAttivo pa) {
	 this.setDose(dose);
	 this.setPa(pa);
 }


public int getDose() {
	return dose;
}


public void setDose(int dose) {
	this.dose = dose;
}


public PrincipioAttivo getPa() {
	return pa;
}


public void setPa(PrincipioAttivo pa) {
	this.pa = pa;
}
}
