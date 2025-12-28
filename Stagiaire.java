final class Stagiaire extends Employee
{
    public Stagiaire(String nom, int age)
    {
        super(nom, age);
    }

    @Override
    public double calculSalaire()
    {
        return 0;
    }
}