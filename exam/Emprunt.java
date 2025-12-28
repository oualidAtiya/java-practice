import java.util.ArrayList ;

class Emprunt {

    private Livre livre;
    private Utilisateur utilisateur;
    private String dateEmprunt;

    public Emprunt(Livre livre, Utilisateur utilisateur, String dateEmprunt)
    {
        this.livre = livre ;
        this.utilisateur = utilisateur;
        this.dateEmprunt = dateEmprunt;
    }

    public Livre getLivre()
    {
        return this.livre ;
    }

    public void afficherEmprunt()
    {
        System.out.print("Utilisateur => ");
        this.utilisateur.afficherInfos();
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Livre => ");
        this.livre.afficherDetails();
    }
}