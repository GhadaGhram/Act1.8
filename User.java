package Streamingdemusique;
import java.util.ArrayList;
import java.util.Comparator;

public class User {
	public String nom;
	public String prenom;
	public String pseudo;
	ArrayList<PlayListeImpl> streaming=new ArrayList<>();
	
public User(String nom, String prenom, String pseudo, ArrayList<PlayListeImpl> streaming) {
		
	this.nom = nom;
	this.prenom = prenom;
	this.pseudo = pseudo;
	this.streaming = streaming;
	}
public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getPseudo() {
	return pseudo;
}

public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}

public ArrayList<PlayListeImpl> getStreaming() {
	return streaming;
}

public void setStreaming(ArrayList<PlayListeImpl> streaming) {
	this.streaming = streaming;
}

@Override
public String toString() {
	return "User [nom=" + nom + ", prenom=" + prenom + ", pseudo=" + pseudo + "]";
}

public void uSer() {
	System.out.println(toString());
}
         
	//Recherche par Titre
public MusiqueImpl rechercherTitre(ArrayList<MusiqueImpl> playliste, String titre) {
		for(MusiqueImpl musiqueImpl:playliste){
		   if(musiqueImpl.getTitre().equals(titre)) {
				return musiqueImpl; }
				}
				 
		return null;}

	//Recherche par auteur	
public MusiqueImpl rechercherAuteur(ArrayList<MusiqueImpl> playliste, String auteur) {
		for(MusiqueImpl musiqueImpl:playliste){
			if(musiqueImpl.getAuteur().equals(auteur)) {
				return musiqueImpl; }
			} 
		return null;}

	//Supprimer une musique d'une playliste
public void supprimerMusique(ArrayList<MusiqueImpl> playliste, String titre) {
	    for(MusiqueImpl music: playliste) {
	         if(music.getTitre().equals(titre)) {
	            playliste.remove(music);
	            break;}
	}}
	
	//Trier dans le sens croissant
public static Comparator <PlayListeImpl> ComparatorNomCroissant = new Comparator <PlayListeImpl> () {
		public int compare( PlayListeImpl e1, PlayListeImpl e2) {
			return e1.getNomMusique().compareTo(e2.getNomMusique());
		}
	};

	//Trier dans le sens déccroissant
public static Comparator<PlayListeImpl> ComparatorNomDecroissant = new Comparator<PlayListeImpl>() {
		@Override
		public int compare(PlayListeImpl e1, PlayListeImpl e2) {
			return e2.getNomMusique().compareTo(e1.getNomMusique());
		}
	};
}
