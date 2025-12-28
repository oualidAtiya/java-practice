public class Main {
    public static void main(String[] args)
    {
        Velo velo = new Velo() ;
        VoitureElectrique voitureElectrique = new VoitureElectrique();

        velo.seDeplacer();
        velo.arreter();

        voitureElectrique.seDeplacer();
        voitureElectrique.arreter();
        voitureElectrique.charger();
    }
}