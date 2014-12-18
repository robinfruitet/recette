import java.util.ArrayList;

public class Recette {
    
    private int idRecette;
    private String nomRecette;
    private int tempsPreparation;
    private int tenpsCuisson;
    private int niveauDifficulte;
    private Type leType;
    private ArrayList<Aliment> lesAliments = new ArrayList<Aliment>();

    public Recette(int idRecette, String nomRecette, int tempsPreparation, int tenpsCuisson, int niveauDifficulte, Type leType) {
        this.idRecette = idRecette;
        this.nomRecette = nomRecette;
        this.tempsPreparation = tempsPreparation;
        this.tenpsCuisson = tenpsCuisson;
        this.niveauDifficulte = niveauDifficulte;
        this.leType = leType;
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

    public int getTenpsCuisson() {
        return tenpsCuisson;
    }

    public void setTenpsCuisson(int tenpsCuisson) {
        this.tenpsCuisson = tenpsCuisson;
    }

    public int getNiveauDifficulte() {
        return niveauDifficulte;
    }

    public void setNiveauDifficulte(int niveauDifficulte) {
        this.niveauDifficulte = niveauDifficulte;
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

    @Override
    public String toString() {
        return "Recette{" + "idRecette=" + idRecette + ", nomRecette=" + nomRecette + ", tempsPreparation=" + tempsPreparation + ", tenpsCuisson=" + tenpsCuisson + ", niveauDifficulte=" + niveauDifficulte + ", leType=" + leType + ", lesAliments=" + lesAliments + '}';
    }

    
    
}