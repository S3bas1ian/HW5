import java.util.*;
public class TeachingAssistent
{
    public Course[] courses= new Course[256];
    private String name;

    /**
     * Konstruktor für Objekte der Klasse TeachingAssistent
     */
    public TeachingAssistent(String name, Course initCourse)
    {
        courses[0] = initCourse; 
        this.name = name;
    }

    public Course[] getCourses(){
        return courses;   
    }

    public String getName(){
        return name;
    }
    
    public void extendContract(Course course){
        int i = Arrays.asList(courses).indexOf(null);
        courses[i] = course;
    }
    
    public void setName(String name){   //in case the assistent changes midsemester his name
        this.name = name;
    }
}