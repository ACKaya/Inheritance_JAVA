public abstract class Assistant extends Academician{

    private String officeTime;
    public Assistant(String name_Surname, String mpNo, String gmail, String department, String title,String officeTime) {
        super(name_Surname, mpNo, gmail, department, title);
        this.officeTime=officeTime;

    }

    public String getOfficeTime() {
        return officeTime;
    }

    public void setOfficeTime(String officeTime) {
        this.officeTime = officeTime;
    }

    public void makeQuiz(){
        System.out.println(getName_surName()+"DID A QUIZ");
    }
    @Override
    public void enterLecture(String time){
        System.out.println(getName_surName()+"HAS ENTERED THE LECTURE");

    }
}
