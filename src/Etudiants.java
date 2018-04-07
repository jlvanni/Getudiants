import java.util.*;

public class Etudiants {

	public  int id;
	public  String nom;
	public  String prenom;
	public  String age;
	public  String sexe;
	//public String[] notes;
	public ArrayList<String> notes;

	public Etudiants(){

		id=0;
		nom="";
		prenom="";
		age="";
		sexe="";
		//ArrayList<Etudiants> notes;
		//ArrayList<E> myArray = new ArrayList<E>();
		//notes="";
		ArrayList<String> notes = new ArrayList<String>();
	
	}





	public ArrayList<String> getNotes() {
		return notes;
	}





	public void setNotes(ArrayList<String> listNote) {
		this.notes = listNote;
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