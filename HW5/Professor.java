public class Professor extends Employee
{
    public Course[] courses = new Course[256]; // you would usally work with ArrayList, but Arrays are faster and the average Prof has less 
    public Exam[] exam = new Exam[256];        //than 256 Courses/Exams per semester
    
    
    /**
     * Konstruktor für Objekte der Klasse Professor
     */
    public Professor(String name, int id)
    {
        super(name, id);
    }
    public void publish_course(){
        
    }
    public void assign_TA(){
        
    }
    public void addNewCourse(){
        
    }
}
