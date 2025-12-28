import java.util.ArrayList; 

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Emprunt> list = new ArrayList<Emprunt>();

        list.add(
            new Emprunt(new Livre(1, "titre1", "auteur1", false),
            new Utilisateur(1, "oualid"),
            "2025-12-28")
        );
        list.add(
            new Emprunt(new Livre(1, "titre2", "auteur2", true),
            new Utilisateur(1, "oualid"),
            "2025-5-06")
        );
        list.add(
            new Emprunt(new Livre(1, "titre3", "auteur3", true),
            new Utilisateur(1, "oualid"),
            "2025-9-11")
        );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (Emprunt e: list)
        {
            e.afficherEmprunt();
            e.getLivre().emprunter();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
}