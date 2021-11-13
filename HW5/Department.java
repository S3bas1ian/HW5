public class Department
{
    public String name;
    public Employee[] employee = new Employee[256];
    public Professor[] chair = new Professor[1];
    public Course[] courses;
    /**
     * Konstruktor für Objekte der Klasse Department
     */
    public Department()
    {
        System.out.println(chair[0]);
    }
}
