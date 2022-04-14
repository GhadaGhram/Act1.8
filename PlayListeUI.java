package Streaming.copy;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
public class PlayListeUI {

	public static void main(String[] args) {
		
		MusiqueImpl music1=new MusiqueImpl("music1", "auteur1", "genre1", "interprete1");
		MusiqueImpl music2=new MusiqueImpl("music2", "auteur2","genre2", "interprete2");
		
		MusiqueImpl music3=new MusiqueImpl("music3", "auteur3", "genre3", "interprete3");
		MusiqueImpl music4=new MusiqueImpl("music4", "auteur4 ","genre4", "interprete4");
		
		MusiqueImpl music5=new MusiqueImpl("music5", "auteur5", "genre5", "interprete5");
		/*MusiqueImpl music6=new MusiqueImpl("music6", "auteur6", "genre6", "interprete6");*/
				
		
		ArrayList<MusiqueImpl> playliste1 = new ArrayList<>();
		ArrayList<MusiqueImpl> playliste2 = new ArrayList<>() ;
		
		PlayListeImpl pl1=new PlayListeImpl("Play 1", 4, playliste1);
		PlayListeImpl pl2 =new PlayListeImpl("Play 2", 4, playliste2);
		
		
//Ajouter une musique à une palyliste:
		
		pl1.ajouterPlayListe(playliste1,music1);
		pl1.ajouterPlayListe(playliste1,music2);
		pl1.ajouterPlayListe(playliste1,music3);
		
//Affichage de la Play 1:	  
		System.out.println("Play 1:");
		pl1.afficherPlayListe();
		System.out.println("  ");	

//Affichage de la Play 2:
		System.out.println("Play 2:");		
		pl2.ajouterPlayListe(playliste2,music4);
		pl2.ajouterPlayListe(playliste2,music5);
		pl2.afficherPlayListe();
		System.out.println("  ");		

		
		
//Affichage de toutes les playlistes de l'utilisateur:		
		System.out.println("les playlistes de l'utilisateur:");
		ArrayList<PlayListeImpl> streaming = new ArrayList<>();
		streaming.add((PlayListeImpl) pl1);
		streaming.add((PlayListeImpl) pl2);
		
		User user1=new User("Ghada","Ghram", "GH", streaming);
		user1.uSer();	
		
		System.out.println("Affichage de la play liste");
		for (PlayListeImpl playListeImpl : streaming ) {
			System.out.println(playListeImpl.getStreaming() + " ");
		System.out.println();
		}
	    	    
	    //user1.affichertoutListes(streaming);
	    
		
		
	    
	    System.out.println("Si vous voulez effectuer un tri croissant taper Croissant");
		System.out.println("Si vous voulez effectuer un tri decroissant taper Decroissant");			
		Collections.sort(streaming, User.ComparatorNomCroissant);
		System.out.println("Afficage de la play liste par nom dans l'ordre croissant \n");
		for (PlayListeImpl playlisteImpl : streaming) {
			System.out.println(playlisteImpl.getNomMusique() + " ");
		}
			Collections.sort(streaming, User.ComparatorNomDecroissant);
			System.out.println("Afficage de la play liste par nom dans l'ordre décroissant \n");
				for (PlayListeImpl playlisteImpl1 : streaming) {
					System.out.println(playlisteImpl1.getNomMusique() + " ");
				}
		

		
		
		
		
}}
