package miniProjet ;

public class PaiementCarte extends Paiement
{
    @Override
    public void effectuerPaiement(double montant)
    {
        System.out.println("Paiement de "+ montant +" Par Carte");
    }
}