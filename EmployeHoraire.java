final class EmployeHoraire extends Employee
{
    private int hours ;
    public EmployeHoraire(String nom, int age, int hours)
    {
        super(nom, age);
        this.hours = hours;
    }

    @Override
    public  double calculSalaire()
    {
        return this.hours * 150 ; 
    }
}