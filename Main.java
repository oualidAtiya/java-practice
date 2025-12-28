import java.util.ArrayList ;
import miniProjet.Paiement;
import miniProjet.PaiementCarte; 
import miniProjet.PaiementCash; 
import miniProjet.PaiementCrypto;


class Test
{
  public void infos(int i)
  {
    System.out.println("with int value");
  }
}

public class Main
{
  public static void main(String[] args)
  {

    // ArrayList<Paiement> list = new ArrayList<Paiement>();

    // list.add(new PaiementCarte()) ;
    // list.add(new PaiementCash());
    // list.add(new PaiementCrypto());
    // for (Paiement l : list)
    // {
    //     l.effectuerPaiement((int)(Math.random() * 200));
    // }

    Test t1 = new Test();
    t1.infos(1.0);
  }
}