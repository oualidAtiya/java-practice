abstract class Employee
{
    private String nom ;
    private int age ;

    public Employee(String nom, int age)
    {
        this.nom = nom;
        this.age = age;
    }

    public void print()
    {
        System.out.println("Name :" + this.nom);
        System.out.println("Age :" + this.age);
    }

    public abstract double calculSalaire();
}