import java.util.*;
import java.io.*;


//private static Scanner scan;

//public Scanner sc = new Scanner(System.in);



public class Getudiants {





	public static void gestion() {
		int indxe=0;
		int sortie=1;
		int e;
		ArrayList<Etudiants> malistetud = new ArrayList<Etudiants>();
		Scanner scan = new Scanner(System.in);

		
		//ettdt[] = null;
		
		while (sortie==1) {
			
		System.out.println("###############################");
		System.out.println("Menu General");
		System.out.println("###############################");

	    
		System.out.println("1/Ajouter un etudiant ");
		System.out.println("2/Supprimer un etudiant ");
		System.out.println("3/Modifier un etudiant ");
		System.out.println("4/Afficher un etudiant ");
		System.out.println("5/Afficher tous les etudiants ");
		System.out.println("6/Enregistrer tous les etudiants ");
		System.out.println("7/Charger tous les etudiants ");
		System.out.println("8/Quit ");
		System.out.println("--------------------------------");
		Scanner scanmenu = new Scanner(System.in);
		Etudiants ettd=new Etudiants();
		//i=scanmenu.next();
		switch(scanmenu.next())
        	{
            case ("1"):
                //ajoutedun();
            	System.out.println("################");
            	System.out.println("#Ajout#");
            	System.out.println("################");
            
            	
    			//Etudiants ettd=new Etudiants();
            	//ettd[indxe]=new Etudiants();
            	//malistetud.add(Etudiants);
    			ettd.setId(indxe);
    			System.out.println("Le Nom:");
    			ettd.setNom(scan.next());
    			
    			System.out.println("Les Notes:");
    			
    			ArrayList<String> listNote = new ArrayList<>();
    			listNote.addAll(Arrays.asList(scan.next().split(",")));
    			ettd.setNotes(listNote);
    			//ettd.setNotes(scan.next());
    			
    			
    			malistetud.add(ettd);
    			indxe++;
            	break;
            	
            case ("2"):
                //supprimedun();
            	
            	System.out.println("################");
            	System.out.println("#Suppression#");
            	System.out.println("################");
            
            	
    			e=Integer.parseInt(scan.next()); 
            	
    			System.out.println("ID:");
            	malistetud.remove(e);
    			
    			//indxe++;
            	break;
            	
            case ("3"):
                //Modifdun();
            	
            	System.out.println("################");
            	System.out.println("#Modification#");
            	System.out.println("################");
            	System.out.println("ID:");
            	
    			e=Integer.parseInt(scan.next()); 
            	
    			
            	malistetud.remove(e);
            	
            	
    			
            	//ettd[indxe]=new Etudiants();
            	//malistetud.add(Etudiants);
    			ettd.setId(indxe);
    			System.out.println("Le Nom:");
    			ettd.setNom(scan.next());
    			
    			malistetud.add(ettd);
    			indxe++;
    			
    			//indxe++;
            	break;
            	
            	
            case ("4"):
            	// afficher un
            	
           	System.out.println("################");
        	System.out.println("#Afficher un#");
        	System.out.println("################");
            	//malistaffich();
            	//System.out.println(malistetud);
        	System.out.println("ID:");
        	
			e=Integer.parseInt(scan.next()); 
        	
        	
            
            	
            	//System.out.println(e+"#"+malistetud.get(e-1).getNom());
            	System.out.println(e+"#"+malistetud.get(e-1));
            	
            
            //System.out.println("------------------------");
            	break;
            	
            	
            case ("5"):
            	// afficher tous
            	int i;
           	System.out.println("################");
        	System.out.println("#Afficher tous#");
        	System.out.println("################");
            	//malistaffich();
            	//System.out.println(malistetud);
        	System.out.println(malistetud.size()+" Etudiants");
        	System.out.println("------------------------");
            
        	for(i=0;i<malistetud.size();i++) {
            	System.out.println(i+"#"+malistetud.get(i).getNom());
            	System.out.println(i+"#"+malistetud.get(i).getNotes());
            	//System.out.println(i+"#"+malistetud.get(i));
        	}
            
            //System.out.println("------------------------");
            	break;
            	
            	
            case ("6"):
            	// Enreistrer dans un fichier tous
            	//int i;
           	System.out.println("################");
        	System.out.println("#Enregistrer tous#");
        	System.out.println("################");
            	//malistaffich();
            	//System.out.println(malistetud);
        	System.out.println(malistetud.size()+" Etudiants");
        	System.out.println("------------------------");
        	try
        	{
        	ObjectOutputStream sortieout = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir") + "/recup.txt"));
        	//on enregistre l'objet dans le fichier => dans ce cas ta collection
        	//sortieout.writeObject(malistetud);
        	//System.out.println(malistetud);
        	for(i=0;i<malistetud.size();i++) {
            	//System.out.println(i+"#"+malistetud.get(i).getNom());
            	//System.out.println(i+"#"+malistetud.get(i).getNotes());
            	System.out.println(i+"#"+malistetud.get(i));
        		sortieout.writeObject(malistetud.get(i));
        	}
            
        	}
        	catch(Exception eee){
        	System.out.println(eee.getMessage()+" probleme sur le fichier :(");
        	} 
        	           
            //System.out.println("------------------------");
            	break;
            	
            case("7"):
            	//Charger un fichier tous
            	//int i;
           	System.out.println("################");
        	System.out.println("#Charger tous#");
        	System.out.println("################");
            	//malistaffich();
            	//System.out.println(malistetud);
        	//System.out.println(malistetud.size()+" Etudiants");
        	//malistetud=null;
        	malistetud.removeAll(malistetud);
        	System.out.println("------------------------");

            	try { //on ouvre le fichier
            		ObjectInputStream entree = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir") + "/recup.txt"));
            		//Collection malistetud2 = (Collection)entree.readObject();
            		//malistetud(entree.readObject());	
            		
            		while(true)
            		{
            			//ettd o=entree.readObject();
            			malistetud.add((Etudiants) entree.readObject());
            			
            		}
            		
            	}
            	catch(Exception ee){
                	System.out.println(ee.getMessage()+" probleme sur le fichier :(");
                	}
            	finally {
         
            	System.out.println(malistetud.size()+" Etudiants");
            	System.out.println(malistetud.get(0).getNom());
            	break;
            	}
            case ("8"):
            	sortie=0;
            	break;
            /*case 'valeur2':
                action2;
            break;
            case 'valeur3':'valeur4':
                action3;
            break;
            default:
                action4;
            break;*/
        	}
		//return scanmenu.next();
		}
		
	}










public static void main(String[] args) {
		
		
		

		
		gestion();
	
		
		
	}






}