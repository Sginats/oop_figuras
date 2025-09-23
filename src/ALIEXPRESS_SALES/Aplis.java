package ALIEXPRESS_SALES;

public class Aplis {
	public Centrs punkts;
	public double radiuss;
	
	public Aplis(Centrs p, double r) {
		punkts = p;
		radiuss = r;
	}
	
	public String izvaditAplaInfo() {
		return "Rādiuss: "+radiuss;
	}
	// Izveidot metodi riņķa līnijas aprēķināšanai
	public double rLGarums() {
		double c = 2 * Math.PI * radiuss;
		return Math.round(c*100.0)/100.0;
	}	
	// riņķa laukuma aprēķināšanai
	public double rLaukums() {
		double s = Math.PI * Math.pow(radiuss, 2);
		return Math.round(s*100.0)/100.0;
	}

}
