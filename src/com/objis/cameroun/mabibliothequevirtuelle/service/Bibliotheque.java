package com.objis.cameroun.mabibliothequevirtuelle.service;

import java.util.Scanner;

import com.objis.cameroun.mabibliothequevirtuelle.domaine.Documentation;

/**class qui permet le traitement 
 * ou les savoir faires
 * @author joseph etoga
 */
public class Bibliotheque {
	
	public void enregistrerdocument(Documentation documentation) {//METHODE QUI PERMET D'ENREGISTRER  LES DOCUMENT
		
		Scanner sc=new Scanner(System.in);
		System.out.println("veillez saisir votre domaine de recherche");	
		documentation.setDomainederecherche(sc.nextLine());
	    System.out.println("veillez saisir le nom de l'Editeur");
		documentation.setNomediteur(sc.nextLine());
		System.out.println("veillez saisir le titre de l'ouvrage");
		documentation.setTitreouvrage(sc.nextLine());
	}	
	public void afficher(Documentation documentation) {//METHODE QUI PERMET DE D'AFFICHER LES DONNEES ENREGISTREES
		
		System.out.println(documentation.getDomainederecherche());
		System.out.println(documentation.getNomediteur());
		System.out.println(documentation.getTitreouvrage());
		
	}
	}