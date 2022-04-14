package Streamingdemusique;
import java.util.ArrayList;

public interface PlayListe {
	public void afficherPlayListe();
   	public void ajouterPlayListe(ArrayList<MusiqueImpl> playliste,MusiqueImpl music);
	
}
