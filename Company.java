import java.util.ArrayList ;

final class Company
{
    private  ArrayList<Employee> employees = new ArrayList<>();
    private  String name ;

    public Company(String name)
    {
        this.name = name ;
    }

    public void displayEmployees()
    {
        for(Employee emp : this.employees)
        {
            emp.print();
            System.out.println("Salaire : " + emp.calculSalaire());
            System.out.println("-----------------------------------");
        }
    }

    public Company addEmployee(Employee emp)
    {
        this.employees.add(emp);
        return this ;
    } 
}

//     Company ibm = new Company("IBM");
//     ibm.addEmployee(new EmployeHoraire("oualid", 20, 120))
//     .addEmployee(new EmployeMensuel("foulan", 50, 10000))
//     .addEmployee(new Stagiaire("foulana", 30));

    
    
//     Company oracle = new Company("Oracle");
//     oracle.addEmployee(new EmployeHoraire("youssef", 60, 300))
//     .addEmployee(new EmployeMensuel("abdo", 120, 10000))
//     .addEmployee(new Stagiaire("ahmed", 24));
    
//     System.out.println("+++++++++++++++++++++++++++++++++");
//     ibm.displayEmployees();
//     System.out.println("+++++++++++++++++++++++++++++++++");
//     oracle.displayEmployees();
//     System.out.println("+++++++++++++++++++++++++++++++++");
//     oracle.displayEmployees();
//     System.out.println("+++++++++++++++++++++++++++++++++");
//     ibm.displayEmployees();
//     System.out.println("+++++++++++++++++++++++++++++++++");
//   }