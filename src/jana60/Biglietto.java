package jana60;

public class Biglietto {

	int etaPasseggero;
	double km;
	private double prezzokm;
	private double scontou18 = 0.8;
	private double scontoo65 = 0.6;
	
	
	public Biglietto(int etaPasseggero, double km) {
		super();
		this.etaPasseggero = etaPasseggero;
		this.km = km;
	}
	
	public double prezzokm() {
		double prezzokm = km * 0.21;
		return prezzokm;
	}
	
	public double calcolo() {
		double prezzofinale;
		if (etaPasseggero < 18) {
			prezzofinale = prezzokm() * scontou18;
		}else if (etaPasseggero > 65) {
			prezzofinale = prezzokm() * scontoo65;
		}else {
			prezzofinale = prezzokm();
		}return prezzofinale;
		
	}
	
	
}
