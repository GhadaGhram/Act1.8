package Streamingdemusique;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PlayListeUI {

	public static void main(String[] args) {
		
		MusiqueImpl music1=new MusiqueImpl("Hero", "Celine", "romance", "interprete1");
		MusiqueImpl music2=new MusiqueImpl("Je veux", "Zaz","amour", "interprete2");
		
		MusiqueImpl music3=new MusiqueImpl("Yourself", "Eminem", "Populaire", "interprete3");
		MusiqueImpl music4=new MusiqueImpl("Rabbit", "Jefferson ","Rock", "interprete4");
		
		MusiqueImpl music5=new MusiqueImpl("Happy", "Williams", "Pop", "interprete5");
		/*MusiqueImpl music6=new MusiqueImpl("music6", "auteur6", "genre6", "interprete6");*/
				
		
		ArrayList<MusiqueImpl> playliste1 = new ArrayList<>();
		ArrayList<MusiqueImpl> playliste2 = new ArrayList<>() ;
		
		PlayListeImpl pl1=new PlayListeImpl("Popular music", 3, playliste1);
		PlayListeImpl pl2 =new PlayListeImpl("Rock style", 2, playliste2);
		
		
//Ajouter une musique à une palyliste:
		
		pl1.ajouterPlayListe(playliste1,music1);
		pl1.ajouterPlayListe(playliste1,music2);
		pl1.ajouterPlayListe(playliste1,music3);
		
		pl2.ajouterPlayListe(playliste2,music4);
		pl2.ajouterPlayListe(playliste2,music5);
		Scanner sc = new Scanner(System.in);	
		
//Affichage de toutes les playlistes de l'utilisateur:		
		
		ArrayList<PlayListeImpl> streaming = new ArrayList<>();
		streaming.add((PlayListeImpl) pl1);
		streaming.add((PlayListeImpl) pl2);
	
		User user1=new User("Ghada","Ghram", "GH", streaming);
		user1.uSer();
		
		System.out.println("Affichage de playliste");
		for (PlayListeImpl playListeImpl : streaming ) {
			System.out.println(playListeImpl.getPlayliste()+" ");
			System.out.println();
		}		
				
//Rechercher dans la playliste 1:
	    System.out.println("Le titre à chercher:");
	    String titre = sc.nextLine();
	    MusiqueImpl resultattitre=user1.rechercherTitre(playliste1,titre);
	    System.out.println(resultattitre);
	    
	
		String auteur;
		System.out.println("l'auteur à chercher:");
	    auteur = sc.nextLine();
		MusiqueImpl resultatauteur=user1.rechercherAuteur(playliste1,auteur);
		System.out.println(resultatauteur);
		
//Supprimer dans la playliste 1:	
		System.out.println("Musique à supprimer : ");
		titre = sc.nextLine();
		user1.supprimerMusique(playliste1,titre);
		pl1.afficherPlayListe();
		
//Trier  la playliste 1:		
	    System.out.println("Trier la playliste dans l'ordre croissant");			
		Collections.sort(streaming, User.ComparatorNomCroissant);
		for (PlayListeImpl playlisteImpl : streaming) {
			System.out.println(playlisteImpl.getNomMusique() + " ");
		}
		
		System.out.println("Trier la playliste dans l'ordre décroissant");
		Collections.sort(streaming, User.ComparatorNomDecroissant);
					for (PlayListeImpl playlisteImpl1 : streaming) {
					System.out.println(playlisteImpl1.getNomMusique() + " ");
				}
				
}}
