package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("quanti studenti esamineremo?");
		int numeroStudenti = Integer.parseInt(scan.nextLine());
		
		int numeroPromossi = 0;
		
		Studente[] listaPagelle = new Studente[numeroStudenti];
		
		for(int i = 0; i < listaPagelle.length; i++) {
			int id = i+1;
			System.out.println("Studente " + id + " - percentuale assenze: ");
			int percAssenze = Integer.parseInt(scan.nextLine());
			System.out.println("Studente " + id + " - media voti: ");
			double mediaVoti = Double.parseDouble(scan.nextLine());
			
			Studente newStudent = new Studente(id, percAssenze, mediaVoti);
			
			listaPagelle[i] = newStudent;
			
			if(newStudent.calcolaEsito().equalsIgnoreCase("promosso")) {
				numeroPromossi ++;
			}
		}
		
		String intestazione = String.format("%15s %15s %15s", "ID", "Percentuale Assenze", "Media Voti", "Esito"); //voglio che mi stamnpi una stringa che occupi 15 caratteri, dopo quello metti l'intestazione della stringa
		System.out.println(intestazione);
		
		for(int i=0; i < listaPagelle.length; i++) {
			
			String infoStudente = listaPagelle[i].infoQuadriFormat("%15s %15s %15s %15s");
			System.out.println(infoStudente);
			
		}
		
		System.out.println();
		System.out.println("In tutto sono stati promossi " + numeroPromossi + " studenti su " + numeroStudenti + " esaminati.");
		
		scan.close();

	}

}
