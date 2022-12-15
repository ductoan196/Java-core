package encapsulation_demo.practice;

public class Student {
    private String id;
    private double AvgScore;
    private int age;
    private String className;

    public Student() {
    }

    public Student(String id, double avgScore, int age, String className) {
        setId(id);
        setAvgScore(avgScore);
        setAge(age);
        setClassName(className);
    }

    //getter setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length()!=8)
            System.out.println("Độ dài id phải bằng 8");
        this.id = id;
    }

    public double getAvgScore() {
        return AvgScore;
    }

    public void setAvgScore(double avgScore) {
        if(avgScore<0)
        AvgScore = avgScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        if (!className.startsWith("A") & !className.startsWith("C"))
        this.className = className;
    }

    //
    public void showInfo(Student std){
        System.out.println("id: " + id);
        System.out.println("AvgScore: " + AvgScore);
        System.out.println("Tuổi " + age);
        System.out.println("Lớp: " + className);

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", AvgScore=" + AvgScore +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }
    public void showInfo(){
        System.out.println(this);
    }
    public void calculateScholarship(){
        if(AvgScore >=8){
            System.out.println("Được học bổng");
        }
        else{
            System.out.println("Không được học bổng");
        }
    }
}
