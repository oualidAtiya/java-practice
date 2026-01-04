import java.util.ArrayList ;

public class Main {
    public static void main(String[] args)
    {
        Film f = new Film("titre1", "realisateur1", 120);
        Film.addFilmToList(f);
        Film.addFilmToList(new Film("titre2", "realisateur1", 130));
        Film.addFilmToList(new Film("titre3", "realisateur1", 140));
        Film.addFilmToList(new Film("titre4", "realisateur4", 60));
        
        Film.afficherFilms();
        f.setTitre("set titre");
        System.out.println("================================");
        Film.chercherFilmParTitre("titre4");
        System.out.println("================================");
        Film.chercherFilmParTitre("titre5");

        Film.filmsParRealisateur("realisateur1");
        Film.filmsParRealisateur("realisateur5");
    }
}

final class Film {
    private int id;
    private String titre;
    private String realisateur;
    private int duree;
    private static int count;

    static ArrayList<Film> list = new ArrayList<>() ;

    public Film() {} ;

    public Film(String titre, String realisateur, int duree)
    {
        this.id = count++;
        this.titre = titre;
        this.realisateur = realisateur;
        this.duree = duree;
    }

    static public void addFilmToList(Film film)
    {
        Film.list.add(film);
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        System.out.println("le titre du film a ete mis a jour");
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void afficherInfos()
    {
        System.out.println("ID: " + this.id);
        System.out.println("Titre: " + this.titre);
        System.out.println("Realisateur: " + this.realisateur);
        System.out.println("Duree: " + this.duree);
    }

    static public void chercherFilmParTitre(String titre)
    {
        for (Film f: list)
        {
            if(f.titre == titre)
            {
                f.afficherInfos();
                return;
            }
        }
        System.out.println("Film introuvable");
    }

    static public void filmsParRealisateur(String realisateur)
    {
        int is_found = 0;
        for (Film f: list)
        {
            if(f.realisateur == realisateur)
            {
                is_found = 1 ;
                f.afficherInfos();
                System.out.println("================================");
            }
        }
        if(is_found == 0)
            System.out.println("Aucun film trouve pour ce realisateur"); 
    }

    static public void afficherFilms()
    {
        for (Film f: list)
        {
            f.afficherInfos();
            System.out.println("===========================");
        }
    } 
}