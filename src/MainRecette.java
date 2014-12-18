import java.io.*;
import java.util.*;



public class MainRecette {


	public static void main(String[] args) {
            
            ArrayList<Recette> lesRecettes = new ArrayList<Recette>();
            ArrayList<Aliment> lesAliments = new ArrayList<Aliment>();
            ArrayList<Type> lesTypes = new ArrayList<Type>();
            
            Scanner sc = new Scanner(System.in);

		try{
                    int choix1 = 1;
                    int choix2 = 1;
                    
                    while(choix1!=0){
                        System.out.println("----------------------------------------------------");
                        System.out.println("|                       MENU                       |");
                        System.out.println("----------------------------------------------------");
                        System.out.println("|                                                  |");
                        System.out.println("|  Taper 1 : Pour crée un nouvel aliment           |");
                        System.out.println("|  Taper 2 : Pour crée une nouvelle recette        |");
                        System.out.println("|  Taper 3 : Pour afficher les recettes            |");
                        System.out.println("|                                                  |");
                        System.out.println("|  Taper 0 : pour quitter le programme             |");
                        System.out.println("|                                                  |");
                        System.out.println("----------------------------------------------------");
                        choix1 = sc.nextInt();
                        sc.nextLine();
                        switch (choix1) {
                        
                            case 0:
                                System.out.println("Fin du programme");
                                break;
                        
                            case 1:
                                while(choix2!=0){
                                    System.out.println("----------------------------------------------------");
                                    System.out.println("|                       MENU                       |");
                                    System.out.println("----------------------------------------------------");
                                    System.out.println("|                                                  |");
                                    System.out.println("|  Taper 1 : Pour crée un legume                   |");
                                    System.out.println("|  Taper 2 : Pour crée un fruit                    |");
                                    System.out.println("|  Taper 3 : Pour crée une viande                  |");
                                    System.out.println("|  Taper 4 : Pour crée un poisson                  |");
                                    System.out.println("|                                                  |");
                                    System.out.println("|  Taper 0 : Pour annuler                          |");
                                    System.out.println("|                                                  |");
                                    System.out.println("----------------------------------------------------");
                                    choix2 = sc.nextInt();
                                    sc.nextLine();
                                    switch (choix2) {
                                        case 0:
                                            break;
                                            
                                        case 1:
                                            System.out.println("Entrer l'id de l'aliment");
                                            int idL = sc.nextInt();
                                            System.out.println("Entrer le nom de l'aliment");
                                            String nomL = sc.next();
                                            System.out.println("Entrer le nombre de calorie de l'aliment");
                                            int calL = sc.nextInt();
                                            Legume leLegumeTemp = new Legume(idL,nomL,calL);
                                            lesAliments.add(leLegumeTemp);
                                            break;
                                            
                                        case 2:
                                            System.out.println("Entrer l'id de l'aliment");
                                            int idF = sc.nextInt();
                                            System.out.println("Entrer le nom de l'aliment");
                                            String nomF = sc.next();
                                            System.out.println("Entrer le nombre de calorie de l'aliment");
                                            int calF = sc.nextInt();
                                            Fruit leFruitTemp = new Fruit(idF,nomF,calF);
                                            lesAliments.add(leFruitTemp);
                                            break;
                                            
                                        case 3:
                                            System.out.println("Entrer l'id de l'aliment");
                                            int idV = sc.nextInt();
                                            System.out.println("Entrer le nom de l'aliment");
                                            String nomV = sc.nextLine();
                                            System.out.println("Entrer le nombre de calorie de l'aliment");
                                            int calV = sc.nextInt();
                                            Viande laViandeTemp = new Viande(idV,nomV,calV);
                                            lesAliments.add(laViandeTemp);
                                            break;
                                            
                                        case 4:
                                            System.out.println("Entrer l'id de l'aliment");
                                            int idP = sc.nextInt();
                                            System.out.println("Entrer le nom de l'aliment");
                                            String nomP = sc.next();
                                            System.out.println("Entrer le nombre de calorie de l'aliment");
                                            int calP = sc.nextInt();
                                            Poisson lePoissonTemp = new Poisson(idP,nomP,calP);
                                            lesAliments.add(lePoissonTemp);
                                            break;
                                    }
                                }
                                
                                break;
                        
                            case 2:
                                System.out.println("Entrer l'id de la recette");
                                int idR = sc.nextInt();
                                System.out.println("Entrer le nom de la recette");
                                String nomR = sc.next();
                                System.out.println("Entrer le temps de préparation");
                                int tpR = sc.nextInt();
                                System.out.println("Entrer le temps de cuisson");
                                int tcR = sc.nextInt();
                                System.out.println("Entrer le niveau de difficulté ( de 1 à 10)");
                                int ndR = sc.nextInt();
                                System.out.println("Entrer le nom de la recette");
                                String typeR = sc.next();
                                System.out.println("Entrer le nom de la recette");
                                String alimentsR = sc.next();
                                Recette laRecetteTemp = new Recette(idR,nomR,tpR,tcR,ndR,typeR,alimentsR);
                                lesRecettes.add(laRecetteTemp);
                                break;
                            
                            case 3:
                                for(Recette laRecette : lesRecettes){
                                    System.out.println(laRecette.toString());
                                }
                                break;
                    
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("ERROR !");                  
		}
        }
    
}