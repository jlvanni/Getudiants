/*JL Vanni Mars2018

 * TD Java Triangle

 * Objet class Atrig

 */



public class Atrig {

	public String nom;

	public int ligne;

	public int colonne;



	public Atrig(){

		this("");

	}



public Atrig(String nom){

	

	this.setNom(nom);

	

}



public Atrig(int ligne,int colonne){

	

	this.setLigne(ligne);

	this.setColonne(colonne);

}







public void Travailler(){

	

	System.out.println("Doit Travailler");

	

}



public void Afficher(){
	int e;

	int f;

	for (f=0;f<ligne+1;f++) {

		for (e=colonne-f;e>0;e--) {

			System.out.print("*");

		}

		System.out.println("\n");

	}

	

	

	

	//System.out.println("Doit Travailler");

	

}





public void Sereposer(){

	

	System.out.println(" Doit se Reposer");

	

}







public String getNom() {

	return nom;

}





public void setNom(String nom) {

	this.nom = nom;

}



public void setLigne(int ligne) {

	this.ligne = ligne;

}



public void setColonne(int colonne) {

	this.colonne = colonne;

}



public int getLigne() {

	return ligne;

}



public int getColonne() {

	return colonne;

}



}