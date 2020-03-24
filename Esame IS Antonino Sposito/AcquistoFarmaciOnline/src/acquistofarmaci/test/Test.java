package acquistofarmaci.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import acquistofarmaci.control.GestioneFarmaci;
import acquistofarmaci.entity.DettaglioFarmaco;
import acquistofarmaci.entity.Farmaco;
import acquistofarmaci.entity.Ordine;
import acquistofarmaci.entity.PrincipioAttivo;

public class Test {
Ordine ord = new Ordine();
HashMap<String, Integer> mappa = new HashMap<String, Integer>();


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test1() {
		GestioneFarmaci gf = new GestioneFarmaci();
		PrincipioAttivo paa = new PrincipioAttivo("1001",20);
		PrincipioAttivo pab = new PrincipioAttivo("100a",20);
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco1 = new ArrayList<DettaglioFarmaco>();
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco2 = new ArrayList<DettaglioFarmaco>();
		
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,paa));
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,pab));
		
		ListaDettagliFarmaco2.add( new DettaglioFarmaco(10,pab));
		
		
		gf.getListaFarmaci().add( new Farmaco("0001", 10, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0002", 10, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0003", 10, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0004", 10, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0005", 10, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0006", 10, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0007", 10, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0008", 10, false, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000a", 1, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000b", 1, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000c", 1, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000d", 1, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000e", 1, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000f", 1, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000g", 1, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000h", 1, false, false, ListaDettagliFarmaco1));
		ord=gf.EffettuaOrdine(mappa,null);
		
		assertTrue(mappa.size()==0);
	}
	
	
	

	@org.junit.Test
	public void test2() {
		GestioneFarmaci gf = new GestioneFarmaci();
		
		PrincipioAttivo paa = new PrincipioAttivo("1001",20);
		PrincipioAttivo pab = new PrincipioAttivo("100a",20);
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco1 = new ArrayList<DettaglioFarmaco>();
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco2 = new ArrayList<DettaglioFarmaco>();
		
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,paa));
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,pab));
		
		ListaDettagliFarmaco2.add( new DettaglioFarmaco(10,pab));
		
		
		gf.getListaFarmaci().add( new Farmaco("0001", 10, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0002", 10, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0003", 10, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0004", 10, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0005", 10, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0006", 10, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0007", 10, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0008", 10, false, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000a", 1, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000b", 1, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000c", 1, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000d", 1, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000e", 1, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000f", 1, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000g", 1, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000h", 1, false, false, ListaDettagliFarmaco1));
		
		mappa.put("0004", 1);
		ord=gf.EffettuaOrdine(mappa, null);
		assertNotNull(ord.getListaDettagliOrdine());
	}




	@org.junit.Test
	public void test3() {

		GestioneFarmaci gf = new GestioneFarmaci();
		PrincipioAttivo paa = new PrincipioAttivo("1001",20);
		PrincipioAttivo pab = new PrincipioAttivo("100a",20);
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco1 = new ArrayList<DettaglioFarmaco>();
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco2 = new ArrayList<DettaglioFarmaco>();
		
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,paa));
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,pab));
		
		ListaDettagliFarmaco2.add( new DettaglioFarmaco(10,pab));
		
		
		gf.getListaFarmaci().add( new Farmaco("0001", 10, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0002", 10, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0003", 10, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0004", 10, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0005", 10, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0006", 10, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0007", 10, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0008", 10, false, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000a", 1, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000b", 1, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000c", 1, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000d", 1, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000e", 1, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000f", 1, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000g", 1, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000h", 1, false, false, ListaDettagliFarmaco1));
		
		
		mappa.put("0001", 1 );
		ord=gf.EffettuaOrdine(mappa, "codice");
		assertNotNull(ord.getCodiceRicetta());
	}
	
	
	@org.junit.Test
	public void test4() {
		GestioneFarmaci gf = new GestioneFarmaci();
		PrincipioAttivo paa = new PrincipioAttivo("1001",20);
		PrincipioAttivo pab = new PrincipioAttivo("100a",20);
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco1 = new ArrayList<DettaglioFarmaco>();
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco2 = new ArrayList<DettaglioFarmaco>();
		
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,paa));
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,pab));
		
		ListaDettagliFarmaco2.add( new DettaglioFarmaco(10,pab));
		
		
		gf.getListaFarmaci().add( new Farmaco("0001", 10, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0002", 10, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0003", 10, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0004", 10, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0005", 10, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0006", 10, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0007", 10, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0008", 10, false, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000a", 1, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000b", 1, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000c", 1, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000d", 1, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000e", 1, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000f", 1, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000g", 1, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000h", 1, false, false, ListaDettagliFarmaco1));
		
		mappa.put("000d", 3);
		
		assertNull(ord=gf.EffettuaOrdine(mappa, null));
	}
	
	
	

	@org.junit.Test
	public void test5() {
		GestioneFarmaci gf = new GestioneFarmaci();
		PrincipioAttivo paa = new PrincipioAttivo("1001",20);
		PrincipioAttivo pab = new PrincipioAttivo("100a",20);
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco1 = new ArrayList<DettaglioFarmaco>();
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco2 = new ArrayList<DettaglioFarmaco>();
		
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,paa));
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,pab));
		
		ListaDettagliFarmaco2.add( new DettaglioFarmaco(10,pab));
		
		
		gf.getListaFarmaci().add( new Farmaco("0001", 10, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0002", 10, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0003", 10, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0004", 10, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0005", 10, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0006", 10, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0007", 10, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0008", 10, false, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000a", 1, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000b", 1, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000c", 1, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000d", 1, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000e", 1, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000f", 1, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000g", 1, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000h", 1, false, false, ListaDettagliFarmaco1));
		
		mappa.put("0002", 1);
		
		assertNotNull(ord=gf.EffettuaOrdine(mappa, null));
	}
	
	
	
	@org.junit.Test
	public void test6() {
		GestioneFarmaci gf = new GestioneFarmaci();
		PrincipioAttivo paa = new PrincipioAttivo("1001",20);
		PrincipioAttivo pab = new PrincipioAttivo("100a",20);
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco1 = new ArrayList<DettaglioFarmaco>();
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco2 = new ArrayList<DettaglioFarmaco>();
		
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,paa));
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,pab));
		
		ListaDettagliFarmaco2.add( new DettaglioFarmaco(10,pab));
		
		
		gf.getListaFarmaci().add( new Farmaco("0001", 10, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0002", 10, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0003", 10, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0004", 10, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0005", 10, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0006", 10, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0007", 10, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0008", 10, false, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000a", 1, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000b", 1, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000c", 1, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000d", 1, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000e", 1, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000f", 1, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000g", 1, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000h", 1, false, false, ListaDettagliFarmaco1));
		
		mappa.put("0004", 1);
		mappa.put("0002", 1);
		
		assertNotNull(ord=gf.EffettuaOrdine(mappa, null));
	}	
	
	
	
	@org.junit.Test
	public void test7() {
		GestioneFarmaci gf = new GestioneFarmaci();
		PrincipioAttivo paa = new PrincipioAttivo("1001",20);
		PrincipioAttivo pab = new PrincipioAttivo("100a",20);
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco1 = new ArrayList<DettaglioFarmaco>();
		ArrayList<DettaglioFarmaco> ListaDettagliFarmaco2 = new ArrayList<DettaglioFarmaco>();
		
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,paa));
		ListaDettagliFarmaco1.add( new DettaglioFarmaco(10,pab));
		
		ListaDettagliFarmaco2.add( new DettaglioFarmaco(10,pab));
		
		
		gf.getListaFarmaci().add( new Farmaco("0001", 10, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0002", 10, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0003", 10, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0004", 10, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0005", 10, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0006", 10, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("0007", 10, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("0008", 10, false, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000a", 1, true, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000b", 1, false, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000c", 1, true, false, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000d", 1, false, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000e", 1, true, false, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000f", 1, false, true, ListaDettagliFarmaco2));
		gf.getListaFarmaci().add( new Farmaco("000g", 1, true, true, ListaDettagliFarmaco1));
		gf.getListaFarmaci().add( new Farmaco("000h", 1, false, false, ListaDettagliFarmaco1));
		
		mappa.put("0001", 1);
		
		
		assertNotNull(ord=gf.EffettuaOrdine(mappa, null));
	}		
	
}

