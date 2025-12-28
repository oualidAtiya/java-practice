class Livre {

    private int id;
    private String titre;
    private String auteur;
    private boolean disponible;

    public Livre() {} ;

    public Livre(int id, String titre, String auteur, boolean disponible)
    {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
    }

    // Getters && Setters
    public int getId() {return this.id ;}

    public void setId(int id) {this.id = id ;}

    public String getTitre() {return this.titre;}

    public void setTitre(String titre) {this.titre = titre;}

    public String getAuteur() {return this.auteur;}

    public void setAuteur(String auteur) {this.auteur = auteur;}

    public boolean getDisponible() {return this.disponible;}

    public void setDisponible(boolean disponible) {this.disponible = disponible;}

    public void afficherDetails()
    {
        System.out.println(
            "ID: " + this.id + 
            ", Titre: " + this.titre + 
            ", Auteur: " + this.auteur +
            ", Disponible: " + this.disponible
        );
    }

    public void emprunter()
    {
        if(this.disponible)
        {
            this.disponible = false;
        }
        else
        {
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Le livre n'est Pas Disponible");
        }
    }
}