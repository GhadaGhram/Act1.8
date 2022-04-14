package Streamingdemusique;

public class MusiqueImpl implements Musique{
	private String titre;
	private String auteur;
	private String genre;
	private String interprete;
	
		
public MusiqueImpl(String titre, String auteur, String genre, String interprete) {
		this.titre = titre;
		this.auteur = auteur;
		this.genre = genre;
		this.interprete = interprete;
	}

	public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public String getAuteur() {
	return auteur;
}

public void setAuteur(String auteur) {
	this.auteur = auteur;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public String getInterprete() {
	return interprete;
}


public void setInterprete(String interprete) {
	this.interprete = interprete;
}

	@Override
public String toString() {
	return "MusiqueImpl [titre=" + titre + ", auteur=" + auteur + ", genre=" + genre + ", interprete="
					+ interprete + "]";
		}

	@Override
public void afficher() {
		System.out.println(toString());
	}
	
	@Override
	public void verifEgale(Streaming.MusiqueImpl music1, Streaming.MusiqueImpl music2) {
		if((music1.getTitre()).equals(music2.getTitre())
				& (music1.getAuteur()).equals(music2.getAuteur())
				& (music1.getGenre()).equals(music2.getGenre()))
					{
				    System.out.println("les deux morceaux sont identiques");}
	            else{
				    
				    System.out.println("les deux morceaux ne sont pas identiques");}
		
			}

		}
