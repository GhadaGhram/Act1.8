package Streaming.copy;

public class MusiqueImpl implements Musique{
	private String titre;
	private String auteur;
	private String genre;
	private String interprete;
	
	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getGenre() {
		return genre;
	}

	
		public MusiqueImpl(String titre, String auteur, String genre, String interprete) {
		this.titre = titre;
		this.auteur = auteur;
		this.genre = genre;
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
	public void rechercherAuteur(MusiqueImpl music1,String auteur) {
		if(music1.getTitre().equals(auteur)){
		    System.out.println("Existe ");}
        else{
		    
		    System.out.println("N'existe pas");}
						
	
		}

	}