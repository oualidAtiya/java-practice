final class Person
{
  private String name;
  private int id;
  private int  age;
  private static int count;
  
  public Person() {} ;
  
  public Person(String name, int age)
  {
    if(age < 0)
      this.age = 0 ;
    this.name = name ;
    this.id = count++ ;
  }

  public String getName()
  {
    return this.name;
  }
}