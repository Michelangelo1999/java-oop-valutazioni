package jana60.valutazioni;

public class Studente {
	
	//attributi
	int id;
	int percAssenze;
	double mediaVoti;
	
	//costruttori
	Studente(int id, int percAssenze, double mediaVoti){
		this.id = id;
		this.percAssenze = percAssenze;
		this.mediaVoti = mediaVoti;
	}
	
	//metodi
	boolean promosso() {
		Boolean promosso;
		if(percAssenze > 50) {
			promosso = false;
		}else if(percAssenze < 50 && percAssenze > 25 && mediaVoti > 2) {
			promosso = true;
		}else if(percAssenze < 50 && percAssenze > 25 && !(mediaVoti > 2)) {
			promosso = false;
		}else if(percAssenze < 25 && mediaVoti >= 2) {
			promosso = true;
		}else {
			promosso = false;
		}
		
		return promosso;
	}
	
	String mostraPagella() {
		String pagella = String.valueOf(id);
		pagella += "\n" + String.valueOf(percAssenze);
		pagella += "\n" + String.valueOf(mediaVoti);
		
		return pagella;
	}
	
	String mostraEsito() {
		String esito;
		if(promosso()) {
			esito = "promosso";
		}else {
			esito = "bocciato";
		}
		
		return esito;
	}
	
	String infoQuadriFormat(String format) {
		return String.format(format, id, percAssenze, mediaVoti, mostraEsito());
	}

}
