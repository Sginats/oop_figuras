package ALIEXPRESS_SALES;

import java.util.ArrayList;

public class IzveidotieObjekti {
static String izvadit(ArrayList<Centrs> centruSaraksts) {
	String str = "";
	for(int i=0; i<centruSaraksts.size(); i++) {
		str += i+". "+centruSaraksts.get(i).izvaditKoordinatas()+"\n";
	}
	return str;
}
}
