final class Bike
{
    private long registration;
    private float currentSpeed;
    private float positionX;
    private Person owner;
    static int count;

  public Bike() {};

  public Bike(long registration, float currentSpeed, float positionX, Person owner)
  {
    count++;
    this.registration = registration ;
    this.currentSpeed = currentSpeed ;
    this.positionX = positionX ;
    this.owner = owner ;
  }

  public Person getOwner()
  {
    return this.owner ;
  }

  static void infos()
  {
    System.out.println("They Are "+ count + " Bike");
  }
  
  public void move(float distance)
  {
    this.positionX += distance;
  }
  
  public void accelerate(float increment)
  {
    this.currentSpeed += increment;
  }
  
  public void display()
  {
    System.out.println("Registration: " + this.registration);
    System.out.println("Current Speed: " + this.currentSpeed);
    System.out.println("Position X: " + this.positionX);
    System.out.println("Owner: " + this.owner.getName() + "\n\n");
  }
}