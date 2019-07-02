package rs.itbootcamp.gen4.nedelja8.sluzba;


class Element{
	Klijent klijent;
	Element sledeci = null;
	public Element(Klijent klijent) {
		this.klijent = klijent;
	}
}

public class Lista {
	private Element pocetak = null;
	private Element kraj = null;
	
	public void stavi(Klijent klijent) {
		if(kraj != null)
			kraj = kraj.sledeci = new Element(klijent);
		else
			pocetak = kraj = new Element(klijent);
	}
	
	public boolean prazna() {
		if(pocetak == null)
			return true;
		return false;
	}
	
	public Klijent uzmi() throws NullPointerException {
		if(pocetak == null)
			throw new NullPointerException("Lista je prazna!");
		
		
		Klijent klijent = pocetak.klijent;
		
		pocetak = pocetak.sledeci;
		
		if(pocetak == null)
			kraj = null;
		
		return klijent;
	}
	
}
