package Streamingdemusique;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PlayListeUI {

	//Lire depuis un fichier
	public static ArrayList<MusiqueImpl> storePlaylistFromFile(ArrayList<MusiqueImpl> playliste){
		System.out.println("Lire depuis un fichier.txt");
		File fileL=new File("C:/Users/Ce-Pc/eclipse-workspace/Ghada/src/Streamingdemusique//music.txt");
		
		if(!fileL.exists())
		{try {
		    fileL.createNewFile();}
		  catch (Exception e) {e.printStackTrace();}
		}
		else
	{
		try{
		FileReader fileReader = new FileReader(fileL);
		BufferedReader reader=new BufferedReader(fileReader);
		String line=reader.readLine();
		while(line!=null){
		System.out.println(line);
		line=reader.readLine();
		String[] music =line.split(",");
	    playliste.add(new MusiqueImpl(music[0],music[1], music[2], music[3]));
		}
		reader.close();
		}catch(IOException e){
		e.printStackTrace();
		}
	}
		return playliste;  	
		
	}
			
	 //Enregitrer dans un autre fichier
		public static void storePlaylistToFile(ArrayList<MusiqueImpl> playliste) throws IOException  {	
		System.out.println("Enregistrer la playliste dans FileE");
		
		File fileE=new File ("C://Users//Ce-Pc//Desktop//Talan-Academy/Enreg.txt");
		if(!fileE.exists())
		{try {
		    fileE.createNewFile();}
		    catch (Exception e) {e.printStackTrace();}}
		else {		 
		FileWriter fileWriter = new FileWriter(fileE);
		BufferedWriter writer = new BufferedWriter (fileWriter);			 		      
		      
		        for(MusiqueImpl music : playliste) {
		    	  
		    	  writer.write(music.getTitre() + ",");
		    	  writer.write(music.getAuteur() + ",");
		    	  writer.write(music.getGenre() + ",");
		    	  writer.write(music.getInterprete());
		    	  writer.newLine();
		                                            }
		      writer.close();
		      }
		     		     }		
		//----------------------------------------
		public static void main(String[] args) throws IOException {	
		MusiqueImpl music1=new MusiqueImpl("Hero", "Celine", "romance", "interprete1");
		MusiqueImpl music2=new MusiqueImpl("Je veux", "Zaz","amour", "interprete2");
		
		MusiqueImpl music3=new MusiqueImpl("Yourself", "Eminem", "Populaire", "interprete3");
		MusiqueImpl music4=new MusiqueImpl("Rabbit", "Jefferson ","Rock", "interprete4");
		
		MusiqueImpl music5=new MusiqueImpl("Happy", "Williams", "Pop", "interprete5");
		/*MusiqueImpl music6=new MusiqueImpl("music6", "auteur6", "genre6", "interprete6");*/
				
		
		ArrayList<MusiqueImpl> playliste1 = new ArrayList<>();
		ArrayList<MusiqueImpl> playliste2 = new ArrayList<>() ;
		ArrayList<MusiqueImpl> playliste3 = new ArrayList<>() ;
		
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
					
					storePlaylistFromFile(playliste1);
				    storePlaylistToFile(playliste2);
				 	
					System.out.println(streaming.toString());
				
}}

