class Utilisateur {
    
    private int id;
    private String nom;

    public Utilisateur() {} ;

    public Utilisateur(int id, String nom)
    {
        this.id = id;
        this.nom = nom;
    }
    public void afficherInfos()
    {
        System.out.println("ID: " + this.id + ", Nom: " + this.nom);
    }
}