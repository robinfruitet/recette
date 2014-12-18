/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guillaume
 */
public class TpRecettes {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Recette> lesRecettes = new ArrayList<Recette>();
    static ArrayList<Aliment> lesAliments = new ArrayList<Aliment>();
    static ArrayList<Type> lesTypes = new ArrayList<Type>();

    public static void main(String[] args) {
        TpRecettes.initialiserTypes();
        TpRecettes.restaurerSerializer();
        int choix = 0;
        do {
            System.out.println("<==========> Menu de gestion des menus de restaurants <==========>");
            System.out.println("==> Choix n°1 : Créer des aliments");
            System.out.println("==> Choix n°2 : Créer des recettes");
            System.out.println("==> Choix n°3 : Afficher les recettes existantes avec les aliments");
            System.out.println("");
            System.out.println("==> Choix n°0 : Quitter le menu");
            System.out.println("");
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 0:
                    System.out.println("==> Sauvegarde des données...");
                    TpRecettes.serialization();
                    System.out.println("==> Fin du menu. Au revoir.");
                    break;
                case 1:
                    int choix2;
                    boolean continuable = true;
                    int idAliment = 0;
                    String nomAliment = "";
                    double caloriesAliment = 0;

                    System.out.println("<===> Création d'aliments <===>");
                    System.out.println("==> Quel type d'aliment souhaitez-vous créer : ");
                    System.out.println("1) Aliment de base");
                    System.out.println("2) Fruit");
                    System.out.println("3) Légume");
                    System.out.println("4) Poisson");
                    System.out.println("5) Viande");
                    System.out.println("");
                    System.out.println("0) Retour au menu");
                    do {
                        System.out.println("==> Veuillez saisir votre choix : ");
                        choix2 = sc.nextInt();
                        sc.nextLine();
                    } while (choix2 < 0 || choix2 > 5);
                    switch (choix2) {
                        case 0:
                            break;
                        case 1:
                            continuable = true;
                            if (TpRecettes.lesAliments.isEmpty()) {
                                idAliment = 0;
                            } else {
                                idAliment = TpRecettes.lesAliments.size() + 1;
                            }
                            nomAliment = "";
                            caloriesAliment = 0;

                            System.out.println("==> Nom de l'aliment : ");
                            nomAliment = sc.nextLine();
                            System.out.println("==> Calories de l'aliment : ");
                            do {
                                try {
                                    continuable = true;
                                    caloriesAliment = sc.nextDouble();
                                } catch (Exception e) {
                                    continuable = false;
                                    System.out.println("=> Veuillez saisir un nombre !");
                                    sc.nextLine();
                                }
                            } while (!continuable);
                            Aliment alimTemp = new Aliment(idAliment, nomAliment, caloriesAliment);
                            lesAliments.add(alimTemp);
                            System.out.println("Aliment de base créée avec succès !");
                            break;

                        case 2:
                            continuable = true;
                            if (TpRecettes.lesAliments.isEmpty()) {
                                idAliment = 0;
                            } else {
                                idAliment = TpRecettes.lesAliments.size() + 1;
                            }
                            nomAliment = "";
                            caloriesAliment = 0;

                            System.out.println("==> Nom du fruit : ");
                            nomAliment = sc.nextLine();
                            System.out.println("==> Calories du fruit : ");
                            do {
                                try {
                                    continuable = true;
                                    caloriesAliment = sc.nextDouble();
                                } catch (Exception e) {
                                    continuable = false;
                                    System.out.println("=> Veuillez saisir un nombre !");
                                    sc.nextLine();
                                }
                            } while (!continuable);
                            Fruit fruitTemp = new Fruit(idAliment, nomAliment, caloriesAliment);
                            lesAliments.add(fruitTemp);
                            System.out.println("Fruit créée avec succès !");
                            break;
                        case 3:
                            continuable = true;
                            if (TpRecettes.lesAliments.isEmpty()) {
                                idAliment = 0;
                            } else {
                                idAliment = TpRecettes.lesAliments.size() + 1;
                            }
                            nomAliment = "";
                            caloriesAliment = 0;

                            System.out.println("==> Nom du légume : ");
                            nomAliment = sc.nextLine();
                            System.out.println("==> Calories du légume : ");
                            do {
                                try {
                                    continuable = true;
                                    caloriesAliment = sc.nextDouble();
                                } catch (Exception e) {
                                    continuable = false;
                                    System.out.println("=> Veuillez saisir un nombre !");
                                    sc.nextLine();
                                }
                            } while (!continuable);
                            Legume legumeTemp = new Legume(idAliment, nomAliment, caloriesAliment);
                            lesAliments.add(legumeTemp);
                            System.out.println("Légume créée avec succès !");
                            break;
                        case 4:
                            continuable = true;
                            if (TpRecettes.lesAliments.isEmpty()) {
                                idAliment = 0;
                            } else {
                                idAliment = TpRecettes.lesAliments.size() + 1;
                            }
                            nomAliment = "";
                            caloriesAliment = 0;

                            System.out.println("==> Nom du poisson : ");
                            nomAliment = sc.nextLine();
                            System.out.println("==> Calories du poisson : ");
                            do {
                                try {
                                    continuable = true;
                                    caloriesAliment = sc.nextDouble();
                                } catch (Exception e) {
                                    continuable = false;
                                    System.out.println("=> Veuillez saisir un nombre !");
                                    sc.nextLine();
                                }
                            } while (!continuable);
                            Poisson poissonTemp = new Poisson(idAliment, nomAliment, caloriesAliment);
                            lesAliments.add(poissonTemp);
                            System.out.println("Poisson créée avec succès !");
                            break;
                        case 5:
                            continuable = true;
                            if (TpRecettes.lesAliments.isEmpty()) {
                                idAliment = 0;
                            } else {
                                idAliment = TpRecettes.lesAliments.size() + 1;
                            }
                            nomAliment = "";
                            caloriesAliment = 0;

                            System.out.println("==> Nom de la viande : ");
                            nomAliment = sc.nextLine();
                            System.out.println("==> Calories de la viande : ");
                            do {
                                try {
                                    continuable = true;
                                    caloriesAliment = sc.nextDouble();
                                } catch (Exception e) {
                                    continuable = false;
                                    System.out.println("=> Veuillez saisir un nombre !");
                                    sc.nextLine();

                                }
                            } while (!continuable);
                            Viande viandeTemp = new Viande(idAliment, nomAliment, caloriesAliment);
                            lesAliments.add(viandeTemp);
                            System.out.println("Viande créée avec succès !");
                            break;

                    }
                    break;
                case 2:
                    boolean continuable2 = true;
                    System.out.println("<===> Création de recettes <===>");
                    int idRecette;
                    if (TpRecettes.lesRecettes.isEmpty()) {
                        idRecette = 0;
                    } else {
                        idRecette = TpRecettes.lesRecettes.size() + 1;
                    }
                    String nomRecette = "";
                    int tempsPrepa = 0;
                    int tempsCuisson = 0;
                    int niveauDiff = 0;
                    ArrayList<Aliment> alimentsNécessaires = new ArrayList<Aliment>();
                    Type typeRecette = null;

                    System.out.println("==> Nom de la recette :");
                    nomRecette = sc.nextLine();

                    //tempsCuisson
                    do {
                        try {
                            continuable2 = true;
                            System.out.println("==> Temps de cuisson (en minutes) : ");
                            tempsCuisson = sc.nextInt();
                            sc.nextLine();
                        } catch (Exception e) {
                            System.out.println("=> Veuillez saisir un nombre !");
                            sc.nextLine();
                            continuable2 = false;
                        }
                    } while (!continuable2 || tempsCuisson <= 0);

                    //tempsPrepa
                    do {
                        try {
                            continuable2 = true;
                            System.out.println("==> Temps de préparation (en minutes) : ");
                            tempsPrepa = sc.nextInt();
                            sc.nextLine();
                        } catch (Exception e) {
                            System.out.println("=> Veuillez saisir un nombre !");
                            sc.nextLine();
                            continuable2 = false;
                        }
                    } while (!continuable2 || tempsPrepa <= 0);

                    //niveauDiff
                    do {
                        try {
                            continuable2 = true;
                            System.out.println("==> Niveau de difficulté (entre 1 et 10): ");
                            niveauDiff = sc.nextInt();
                            sc.nextLine();
                        } catch (Exception e) {
                            System.out.println("=> Veuillez saisir un nombre !");
                            sc.nextLine();
                            continuable2 = false;
                        }
                    } while (!continuable2 || niveauDiff < 0 || niveauDiff > 10);

                    System.out.println("==> Type de la recette");
                    System.out.println("=> 1 = Entrée");
                    System.out.println("=> 2 = Plat");
                    System.out.println("=> 3 = Dessert");
                    continuable2 = true;
                    int choixType = 0;
                    do {
                        try {
                            System.out.println("=> Saisissez votre choix du type de la recette : ");
                            choixType = sc.nextInt();
                            sc.nextLine();
                        } catch (Exception e) {
                            System.out.println("=> Veuillez saisir un nombre !");
                            sc.nextLine();
                            continuable2 = false;
                        }
                    } while (choixType < 1 || choixType > 3 || !continuable2);
                    typeRecette = lesTypes.get(choixType);

                    System.out.println("==> Choix des aliments contenus dans la recette :");
                    char choixAlim;
                    boolean firstTry = true;
                    for (Aliment alim : lesAliments) {
                        firstTry = true;
                        do {
                            if (!firstTry) {
                                System.out.println("Caractère saisie non reconnu. Saisissez la lettre O pour Oui ou la lettre N pour Non");
                            }
                            System.out.println("=> " + alim.getNomAliment());
                            System.out.println("Contenu ? [O=Oui/N=Non]");
                            choixAlim = sc.nextLine().charAt(0);
                            firstTry = false;
                        } while (choixAlim != 'N' || choixAlim != 'O');
                        if (choixAlim == 'O') {
                            alimentsNécessaires.add(alim);
                            System.out.println("Aliment ajouté dans la recette.\n");
                        }
                    }
                    lesRecettes.add(new Recette(idRecette, nomRecette, tempsPrepa, tempsCuisson, niveauDiff, typeRecette, alimentsNécessaires));
                    System.out.println("Recette créée !\n");
                    break;

                case 3:
                    System.out.println("<===> Affichage des recettes <===>");
                    if (lesRecettes.isEmpty()) {
                        System.out.println("Aucune recette créées.\n");
                    } else {
                        for (Recette uneRecette : lesRecettes) {
                            System.out.println(uneRecette);
                            System.out.println("==> Aliments contenus dans la recette :");
                            for (Aliment unAliment : uneRecette.getLesAliments()) {
                                System.out.println(unAliment);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("==> Veuillez choisir un choix valable dans le menu !");
                    break;
            }
        } while (choix != 0);
    }

    private static void initialiserTypes() {
        Type entree = new Type(1, "Entrée");
        Type plat = new Type(2, "Plat");
        Type dessert = new Type(3, "Dessert");
        TpRecettes.lesTypes.add(entree);
        TpRecettes.lesTypes.add(plat);
        TpRecettes.lesTypes.add(dessert);
    }

    private static void serialization() {
        String pathDossier = "./serialization/";
        File fDossier = new File(pathDossier);
        if (!fDossier.exists()) {
            fDossier.mkdir();
        }
        try {
            File fTypes = new File(pathDossier + "/types");
            File fAliments = new File(pathDossier + "/aliments");
            File fRecettes = new File(pathDossier + "/recettes");

            FileOutputStream fosTypes = new FileOutputStream(fTypes);
            FileOutputStream fosAliments = new FileOutputStream(fAliments);
            FileOutputStream fosRecettes = new FileOutputStream(fRecettes);

            ObjectOutputStream oosTypes = new ObjectOutputStream(fosTypes);
            ObjectOutputStream oosAliments = new ObjectOutputStream(fosAliments);
            ObjectOutputStream oosRecettes = new ObjectOutputStream(fosRecettes);

            oosTypes.writeObject(lesTypes);
            oosAliments.writeObject(lesAliments);
            oosRecettes.writeObject(lesRecettes);

            oosTypes.close();
            oosAliments.close();
            oosRecettes.close();
            System.out.println("==> Données sauvegardées avec succès !");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TpRecettes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(TpRecettes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void restaurerSerializer() {
        String pathDossier = "./serialization/";
        File fDossier = new File(pathDossier);
        if (fDossier.exists()) {
            try {
                File fTypes = new File(pathDossier + "/types");
                File fAliments = new File(pathDossier + "/aliments");
                File fRecettes = new File(pathDossier + "/recettes");

                FileInputStream fisTypes = new FileInputStream(fTypes);
                FileInputStream fisAliments = new FileInputStream(fAliments);
                FileInputStream fisRecettes = new FileInputStream(fRecettes);

                ObjectInputStream oisTypes = new ObjectInputStream(fisTypes);
                ObjectInputStream oisAliments = new ObjectInputStream(fisAliments);
                ObjectInputStream oisRecettes = new ObjectInputStream(fisRecettes);

                if (fTypes.exists()) {
                    lesTypes = (ArrayList<Type>) oisTypes.readObject();
                    System.out.println("Types restaurés avec succès !");
                }
                if (fAliments.exists()) {
                    lesAliments = (ArrayList<Aliment>) oisAliments.readObject();
                    System.out.println("Aliments restaurés avec succès !");
                }
                if (fRecettes.exists()) {
                    lesRecettes = (ArrayList<Recette>) oisRecettes.readObject();
                    System.out.println("Recettes restaurées avec succès !");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TpRecettes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TpRecettes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TpRecettes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("==> Aucune données restaurées");
        }
    }
}
