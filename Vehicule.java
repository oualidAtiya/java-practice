abstract class Vehicule
{
    public abstract void start();
    
    public void stop()
    {
        System.out.println("Le Vehicule s'arrete.");
    }
}

// public static void main(String[] args)
// {
// Vehicule voiture = new Voiture() ;
// Vehicule moto = new Moto() ;

// voiture.start();
// moto.start();
// voiture.stop();
// moto.stop();
// }