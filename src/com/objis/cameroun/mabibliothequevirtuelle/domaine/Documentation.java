package com.objis.cameroun.mabibliothequevirtuelle.domaine;

public class Documentation {// DECLARATION DES PROPRIETES ou paramettres

	private String domainederecherche;
	private String nomediteur;
	private String titreouvrage;
	
//CONSTRUCTEURS	
	
	public Documentation() {
		super();
	}



	public Documentation(String domainederecherche, String nomediteur, String titreouvrage) {
		super();
		this.domainederecherche = domainederecherche;
		this.nomediteur = nomediteur;
		this.titreouvrage = titreouvrage;
	}

//ACESSEURS

	public String getDomainederecherche() {
		return domainederecherche;
	}



	public void setDomainederecherche(String domainederecherche) {
		this.domainederecherche = domainederecherche;
	}



	public String getNomediteur() {
		return nomediteur;
	}



	public void setNomediteur(String nomediteur) {
		this.nomediteur = nomediteur;
	}



	public String getTitreouvrage() {
		return titreouvrage;
	}



	public void setTitreouvrage(String titreouvrage) {
		this.titreouvrage = titreouvrage;
		
	}
	
	




}
