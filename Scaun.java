package scaun;

import java.util.ArrayList;
import java.util.Objects;

public class Scaun {
	private int IDFabrica;
	private double pret;
	private int nrPicioare;
	private int anFabricatie;

	public Scaun(int iDFabrica, double pret, int nrPicioare, int anFabricatie) {
		super();
		IDFabrica = iDFabrica;
		this.pret = pret;
		this.nrPicioare = nrPicioare;
		this.anFabricatie = anFabricatie;
	}

	public int getIDFabrica() {
		return IDFabrica;
	}

	public void setIDFabrica(int iDFabrica) {
		IDFabrica = iDFabrica;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public int getNrPicioare() {
		return nrPicioare;
	}

	public void setNrPicioare(int nrPicioare) {
		this.nrPicioare = nrPicioare;
	}

	public int getAnFabricatie() {
		return anFabricatie;
	}

	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}

	@Override
	public String toString() {
		return "ID-ul " + IDFabrica + ", pretul " + pret + ", cu nr picioare " + nrPicioare + ", fabricat in "
				+ anFabricatie;
	}

	public String doarId() {
		return "ID:" + IDFabrica;
	}

	public void testAnFabricatie() {
		if (getAnFabricatie() < 2000)
			System.out.println("Scaunul " + doarId() + " este fabricat inainte de anul 2000.");
		else if (getAnFabricatie() > 2000)
			System.out.println("Scaunul " + doarId() + " este fabricat dupa anul 2000.");
		else
			System.out.println("Scaunul " + doarId() + " este fabricat in 2000.");
	}

	public void nrPicioareScaun() {
		System.out.println("Scaunul " + doarId() + " are " + getNrPicioare() + " picioare.");
	}

	public void comparareDupaPret(Scaun obj) {
		if (getPret() > obj.getPret())
			System.out.println("Scaunul cu " + doarId() + " este mai scump decat scaunul cu " + obj.doarId() + ".");
		else if (getPret() < obj.getPret())
			System.out.println("Scaunul cu " + obj.doarId() + " este mai scump decat scaunul cu " + doarId() + ".");
		else
			System.out.println("Scaunele " + obj.doarId() + " si " + doarId() + " au acelasi pret.");
	}

	public boolean equalsScaun(Scaun obj) {
		if (getIDFabrica() == obj.getIDFabrica() && getPret() == obj.getPret()
				&& getNrPicioare() == obj.getNrPicioare() && getAnFabricatie() == obj.getAnFabricatie())
			return true;
		return false;
	}

	public boolean apartineLista(ArrayList<Scaun> scaun, Scaun a) {
		for (int i = 0; i < scaun.size(); i++) {
			if (scaun.get(i).equalsScaun(a)) {
				return true;
			}
		}
		return false;
	}

}
