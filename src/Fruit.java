/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
//commentaire
/**
 *
 * @author guillaume
 */
public class Fruit extends Aliment implements Serializable{

    public Fruit(int idAliment, String nomAliment, double calories) {
        super(idAliment, nomAliment, calories);
    }
    
}
