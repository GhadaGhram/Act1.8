package Streamingdemusique;
import java.util.ArrayList;

public  class PlayListeImpl implements PlayListe {

final int MAX_MUSIQUES=100;
private String nomMusique;
private int nombreTitresMusique;
ArrayList<MusiqueImpl> playliste=new ArrayList<>();

public PlayListeImpl(String nomMusique, int nombreTitresMusique,
		ArrayList<MusiqueImpl> playliste) {
	this.nomMusique = nomMusique;
	this.nombreTitresMusique = nombreTitresMusique;
	this.playliste = playliste;
}
public String getNomMusique() {
	return nomMusique;
}

public void setNomMusique(String nomMusique) {
	this.nomMusique = nomMusique;
}


public int getNombreTitresMusique() {
	return nombreTitresMusique;
}

public void setNombreTitresMusique(int nombreTitresMusique) {
	this.nombreTitresMusique = nombreTitresMusique;
}


public ArrayList<MusiqueImpl> getPlayliste() {
	return playliste;
}


public void setPlayliste(ArrayList<MusiqueImpl> playliste) {
	this.playliste = playliste;
}

@Override
public String toString() {
	return "PlayListeImpl [playliste=" + playliste + "]";
}

@Override
public void afficherPlayListe() {
		System.out.println(toString());
}
	
@Override
public void ajouterPlayListe(ArrayList<MusiqueImpl> playliste,MusiqueImpl music) {
		if (playliste.size()<=MAX_MUSIQUES) {
		    playliste.add(music);
	}
    	else { System.out.println("Oups! Espace dans la liste  insuffisant");}}
}





