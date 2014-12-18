/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author guillaume
 */
public class Recette implements Serializable{
    private int idRecette;
    private String nomRecette;
    private int tempsPreparation;
    private int tempsCuisson;
    private int niveauDifficulté;
    private Type leType;
    private ArrayList<Aliment> lesAliments;

    public Recette(int idRecette, String nomRecette, int tempsPreparation, int tempsCuisson, int niveauDifficulté, Type leType, ArrayList<Aliment> lesAliments) {
        this.idRecette = idRecette;
        this.nomRecette = nomRecette;
        this.tempsPreparation = tempsPreparation;
        this.tempsCuisson = tempsCuisson;
        this.niveauDifficulté = niveauDifficulté;
        this.leType = leType;
        this.lesAliments = lesAliments;
    }

    public int getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(int idRecette) {
        this.idRecette = idRecette;
    }

    public String getNomRecette() {
        return nomRecette;
    }

    public void setNomRecette(String nomRecette) {
        this.nomRecette = nomRecette;
    }

    public int getTempsPreparation() {
        return tempsPreparation;
    }

    public void setTempsPreparation(int tempsPreparation) {
        this.tempsPreparation = tempsPreparation;
    }

    public int getTempsCuisson() {
        return tempsCuisson;
    }

    public void setTempsCuisson(int tempsCuisson) {
        this.tempsCuisson = tempsCuisson;
    }

    public int getNiveauDifficulté() {
        return niveauDifficulté;
    }

    public void setNiveauDifficulté(int niveauDifficulté) {
        this.niveauDifficulté = niveauDifficulté;
    }

    public Type getLeType() {
        return leType;
    }

    public void setLeType(Type leType) {
        this.leType = leType;
    }

    public ArrayList<Aliment> getLesAliments() {
        return lesAliments;
    }

    public void setLesAliments(ArrayList<Aliment> lesAliments) {
        this.lesAliments = lesAliments;
    }
    
    public String toString() {
        return "==> Recette n°"+this.idRecette+"\n"
                + "Nom de la recette : "+this.nomRecette+"\n"
                + "Temps de préparation : "+this.tempsPreparation+"min\n"
                + "Temps de cuisson : "+this.tempsCuisson+"min\n"
                + "Niveau de difficulté : "+this.niveauDifficulté+"/10\n\n";
    }
    
    
}
