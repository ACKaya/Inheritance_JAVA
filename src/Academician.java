public abstract class Academician extends Employee{
    private String department;
    private String title;

    public Academician(String name_Surname,String mpNo,String gmail,String department,String title){
        super(name_Surname, mpNo,gmail);
        this.department=department;
        this.title=title;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public abstract void enterLecture(String time);





}
