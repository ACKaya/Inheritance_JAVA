public abstract class Instructor extends Academician{
    private String doorNo;
    private int note1;
    private int note2;
    private int note3;
    public Instructor(String name_Surname,String mpNo,String gmail,String department,String title,String doorNo,int note1,int note2,int note3){
    super(name_Surname,mpNo,gmail,department,title);
    this.doorNo=doorNo;
    this.note1=note1;
    this.note2=note2;
    this.note3=note3;

    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
    public void senateMeeting(){
        System.out.println("The senate has convened");

    }
    public void makeExam(){
        System.out.println("Exam has started!");
    }
    public boolean isPass(){
        if(avarageQuiz()>=50){
            System.out.println(getName_surName()+" passed the exam successfully");
            return true;
        }
        System.out.println(getName_surName()+" could not pass the exam ");
        return false;
    }
    public double avarageQuiz(){
        double result =(this.note1+this.note2+this.note3)/3;
        return result;
    }
   @Override
    public void enterLecture(String time){
        System.out.println(getName_surName()+"HAS ENTERED THE LECTURE");

    }

}

