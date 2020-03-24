package acquistofarmaci.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClienteRegistrato {
    private String cf;
    private String nome;
    private String cognome;
    private LocalDate datadinascita;
    private ArrayList<Ordine> ListadiOrdini = new ArrayList<Ordine>();
    
    public ClienteRegistrato(String cf, String nome, String cognome, LocalDate datadinascita, ArrayList<Ordine> ListadiOrdini){
    	this.cf = cf;
    	this.nome = nome;
    	this.cognome = cognome;
    	this.datadinascita = datadinascita;
    	this.ListadiOrdini = ListadiOrdini;
    }
}
