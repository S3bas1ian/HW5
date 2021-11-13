public class Question
{
    public String task;
    public int max_value;
    public int q_id;

    /**
     * Konstruktor für Objekte der Klasse Question
     */
    public Question(int id, String task, int val)
    {
        this.q_id = id;
        this.task = task;
        this.max_value = val;
    }
}
