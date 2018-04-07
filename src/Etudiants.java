public class Etudiants {

	public  int id;
	public  String nom;
	public  String prenom;
	public  String age;
	public  String sexe;

	public Etudiants(){

		id=0;
		nom="";
		prenom="";
		age="";
		sexe="";

	}


	public  int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public  String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public  String getAge() {
		return age;
	}
	public  void setAge(String age) {
		this.age = age;
	}
	public  String getSexe() {
		return sexe;
	}
	public  void setSexe(String sexe) {
		this.sexe = sexe;
	}







}