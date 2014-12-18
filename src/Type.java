/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fruitet
 */
public class Type {
    
    private int idType;
    private String idLibelle;

    public Type(int idType, String idLibelle) {
        this.idType = idType;
        this.idLibelle = idLibelle;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getIdLibelle() {
        return idLibelle;
    }

    public void setIdLibelle(String idLibelle) {
        this.idLibelle = idLibelle;
    }
    
    
    
}
