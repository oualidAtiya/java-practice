package miniProjet ;

public class PaiementCrypto extends Paiement
{
    @Override
    public void effectuerPaiement(double montant)
    {
        System.out.println("Paiement de "+ montant +" en crypto ₿");
    }
}