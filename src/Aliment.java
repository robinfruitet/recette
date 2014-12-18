/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author guillaume
 */
public class Aliment implements Serializable{
    private int idAliment;
    private String nomAliment;
    private double calories;

    public Aliment(int idAliment, String nomAliment, double calories) {
        this.idAliment = idAliment;
        this.nomAliment = nomAliment;
        this.calories = calories;
    }

    public int getIdAliment() {
        return idAliment;
    }

    public void setIdAliment(int idAliment) {
        this.idAliment = idAliment;
    }

    public String getNomAliment() {
        return nomAliment;
    }

    public void setNomAliment(String nomAliment) {
        this.nomAliment = nomAliment;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
    
    public String toString() {
        return "==>Aliment n°"+this.idAliment+"\n"
                + "Nom de l'aliment : "+this.nomAliment+"\n"
                + "Calories de l'aliment : "+this.calories+"\n\n";
    }
}
