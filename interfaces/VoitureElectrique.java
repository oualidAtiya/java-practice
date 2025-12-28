class VoitureElectrique extends Transport implements Electrique
{
    @Override
    public void seDeplacer()
    {
        System.out.println("Voiture Deplacer");
    }

    @Override
    public void charger()
    {
        System.out.println("Voiture Charger");
    }
}