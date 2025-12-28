package miniProjet ;

public class PaiementCash extends Paiement
{
    @Override
    public void effectuerPaiement(double montant)
    {
        System.out.println("Paiement de "+ montant +" en espèces");
    }
}