public abstract class Employee {
    private String name_surName;
    private String mpNo;
    private String gmail;

    public Employee(String name_surName, String mpNo, String gmail) {
        this.name_surName = name_surName;
        this.mpNo = mpNo;
        this.gmail = gmail;
    }

    public String getName_surName() {
        return name_surName;
    }

    public void setName_surName(String name_surName) {
        this.name_surName = name_surName;
    }

    public String getMpNo() {
        return mpNo;
    }

    public void setMpNo(String mpNo) {
        this.mpNo = mpNo;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public void logIn(){
        System.out.println(getName_surName()+" Successfully Logged In");
    }
    public void logOut(){
        System.out.println(getName_surName()+" Successfully Logged Out");
    }
    public void refactory(){
        System.out.println(getName_surName()+"Entered the refactory");
    }
    public static void loginUsers(Employee[]users){
        for(Employee user:users){
            user.logOut();
        }
    }
}
