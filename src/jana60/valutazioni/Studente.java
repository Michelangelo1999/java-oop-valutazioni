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
	String calcolaEsito() {
		String esito;
		if(percAssenze > 50) {
			esito = "bocciato";
		}else if(percAssenze < 50 && percAssenze > 25 && mediaVoti > 2) {
			esito = "promosso";
		}else if(percAssenze < 50 && percAssenze > 25 && !(mediaVoti > 2)) {
			esito = "bocciato";
		}else if(percAssenze < 25 && mediaVoti >= 2) {
			esito = "promosso";
		}else {
			esito = "NC";
		}
		
		return esito;
	}
	
	String mostraPagella() {
		String pagella = String.valueOf(id);
		pagella += "\n" + String.valueOf(percAssenze);
		pagella += "\n" + String.valueOf(mediaVoti);
		
		return pagella;
	}
	
	String infoQuadriFormat(String format) {
		return String.format(format, id, percAssenze, mediaVoti, calcolaEsito());
	}

}
