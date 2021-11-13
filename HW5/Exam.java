import java.util.*;
public class Exam
{
    public int max_value;
    public Course course;
    public ArrayList<Question> questions = new ArrayList<Question>();
    public ArrayList<Student> students = new ArrayList<Student>();
    /**
     * Konstruktor für Objekte der Klasse Exam
     */
    public Exam()
    {
        
    }
    public boolean register(Student student){
        students.add(student);
        return true;
    }
    public void addQuestion(int id, String task, int val){
        questions.add(new Question(id, task, val));
    }
    public ArrayList<Student> getRegisteredStudents(){
        return students;
    }
    public void setMaxValue(int max){
        max_value = max;
    }
}
