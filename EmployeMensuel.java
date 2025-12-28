final class EmployeMensuel extends Employee
{
    private double salaire;
    public EmployeMensuel(String nom, int age, double salaire)
    {
        super(nom, age);
        this.salaire = salaire;
    }

    @Override
    public  double calculSalaire()
    {
        return this.salaire ;
    }
}