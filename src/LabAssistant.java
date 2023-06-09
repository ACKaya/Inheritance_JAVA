public class LabAssistant extends Assistant{
    public LabAssistant(String name_Surname, String mpNo, String gmail, String department, String title, String officeTime) {
        super(name_Surname, mpNo, gmail, department, title, officeTime);
    }
    public void enterLabs(){
        System.out.println(getName_surName()+" Has joined the lab");
    }
    @Override
    public void enterLecture(String time){
        System.out.println(getName_surName()+"HAS ENTERED THE LECTURE AT"+time);

    }

}
