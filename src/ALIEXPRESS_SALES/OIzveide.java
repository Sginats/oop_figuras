package ALIEXPRESS_SALES;

import javax.swing.JOptionPane;

import uzd1.MinkuTante;
public class OIzveide {

	static int cPIzvele() {
		if (Figuras.centraObjekts.size() < 1)
			return -1;
		return Integer.parseInt(JOptionPane.showInputDialog(null, 
				IzveidotieObjekti.izvadit(Figuras.centraObjekts)));
	}
public static void izveidotObjektu() {
	int x, y, cPNr;
	double p, a;
	
	int izvele = JOptionPane.showOptionDialog(null, 
			"Kuru objektu veidot?", "Objektu izveide",
			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
			null, Figuras.objektuPogas, Figuras.objektuPogas[4]);
	if(izvele==-1)
		izvele = 0;
switch(izvele) {
case 0:
	x = MinkuTante.skaitlaParbaude("Ievadi centra X koordinātas", -100, 100);
	y = MinkuTante.skaitlaParbaude("Ievadi centra Y koordinātas", -100, 100);
	
	Figuras.centraObjekts.add(new Centrs(x, y));
	JOptionPane.showMessageDialog(null,
	"Centra punkts izveidots!", "Paziņojums",
	JOptionPane.INFORMATION_MESSAGE);
	break;
case 1:
	String[] ceIzvelesVeids = {"Noklusējuma", "Centra punkts un malas"};
	String veids = (String) JOptionPane.showInputDialog(null, 
			"Izvēlies, kuru konstruktoru izsaukt", "Četrstūra izveide",
			JOptionPane.QUESTION_MESSAGE, null, ceIzvelesVeids, 
			ceIzvelesVeids[0]);
	if(veids == null)
		veids = ceIzvelesVeids[0];
	switch(veids) {
	case "Noklusējuma":
		Figuras.cetrsturaObjekti.add(new Cetrsturis());
		JOptionPane.showMessageDialog(null,
		"Noklusejuma cetrsturis izveidots!", "Paziņojums",
		JOptionPane.INFORMATION_MESSAGE);
		break;
		case "Centra punkts un malas":
			cPNr = cPIzvele();
			if (cPNr == -1) {
				JOptionPane.showMessageDialog(null,
				"Nav centra punkts ko izvēlēties!",
				"Kļūda", JOptionPane.ERROR_MESSAGE);
			break;
			}
			cPNr = 0;
			p = MinkuTante.skaitlaParbaude("Ievadi četrstūra platumu", 1, 100);
			a = MinkuTante.skaitlaParbaude("Ievadi četrstūra augstumu", 1, 100);
			Figuras.cetrsturaObjekti.add(new Cetrsturis(
			Figuras.centraObjekts.get(cPNr), p, a));
			JOptionPane.showMessageDialog(null,
			"Cetrsturis izveidots!", "Paziņojums",
			JOptionPane.INFORMATION_MESSAGE);
			break;
			
	}
case 2:
	cPNr = cPIzvele();
	if (cPNr == -1) {
		JOptionPane.showMessageDialog(null,
		"Nav centra punkts ko izvēlēties!",
		"Kļūda", JOptionPane.ERROR_MESSAGE);
	break;
	}
	int r = MinkuTante.skaitlaParbaude("Ievadi apļa rādiusu", 1, 100);
	Figuras.aplaObjekti.add(new Aplis(Figuras.centraObjekts.get(cPNr),r));
	JOptionPane.showMessageDialog(null,
	"Aplis izveidots!", "Paziņojums",
	JOptionPane.INFORMATION_MESSAGE);
	break;
case 3:
	cPNr = cPIzvele();
	if (cPNr == -1) {
		JOptionPane.showMessageDialog(null,
		"Nav centra punkts ko izvēlēties!",
		"Kļūda", JOptionPane.ERROR_MESSAGE);
	break;
	}
	int m1 = MinkuTante.skaitlaParbaude("Ievadi trijstūra malu garumu (1)", 1, 100);
	int m2 = MinkuTante.skaitlaParbaude("Ievadi trijstūra malu garumu (2)", 1, 100);
	int m3 = MinkuTante.skaitlaParbaude("Ievadi trijstūra malu garumu (3)", 1, 100);
	if(m1 == -1 || m2 == -1 || m3 == -3)
	break;
	Figuras.trijsturaObjekti.add(new Trijsturis(Figuras.centraObjekts.get(cPNr), m1, m2, m3));
	JOptionPane.showMessageDialog(null,
	"Trijsturis izveidots!", "Paziņojums",
	JOptionPane.INFORMATION_MESSAGE);
	break;
case 4:
	JOptionPane.showMessageDialog(null, "Atgriežas uz galveno izvēlni!", "Paziņojums",
	JOptionPane.INFORMATION_MESSAGE);
	break;

}
	}
}
