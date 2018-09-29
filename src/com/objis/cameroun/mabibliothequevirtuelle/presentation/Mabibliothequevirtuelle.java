package com.objis.cameroun.mabibliothequevirtuelle.presentation;

import com.objis.cameroun.mabibliothequevirtuelle.domaine.Documentation;
import com.objis.cameroun.mabibliothequevirtuelle.service.Bibliotheque;

/**la classe prrincipale Mabibliotheque nous permet de faire appel aux methodes
 * presentes dans les pakage service et documaine
 * @author joseph etoga
 *
 */
public class Mabibliothequevirtuelle {

	public static void main(String[] args) {//class principale
		
		System.out.println("bienvenue dans ma Bibliotheque virtuelle");//Page d'accueil
		
		Documentation documentation=new Documentation();//Instanciation qui nous permet de  faire appel au savoir faireaa
		
		Bibliotheque bibliotheque=new Bibliotheque();

	bibliotheque.enregistrerdocument(documentation);
	
	System.out.println();
	
    bibliotheque.afficher(documentation);//appel de la methode afficher
	    
	

}
}
