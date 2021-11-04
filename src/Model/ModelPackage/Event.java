package ModelPackage;


public class Event {
    private String name;
    private String desc;
    private int priority;
    private ModelPackage.Date date;

    public Event(String name, String desc, int priority, Date date) {
        this.name = name;
        this.desc = desc;
        this.priority = priority;
        this.date = date;
    }

    public Event(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ModelPackage.Date getDate() {
        return date;
    }

    public void setDate(ModelPackage.Date date) {
        this.date = date;
    }







}
