public class App {
  public String student_name;
  public int sid;
  private String studentPass; 
  public void setPass (String p ){
    studentPass = p;
  }

public String getPass (){
    return studentPass;
  }






    public static void main(String[] args) throws Exception {
        App hamiz = new App();
        hamiz.student_name = "Hamiz Muzaffer";
        hamiz.sid = 2350;
        hamiz.setPass("Najma");
        System.out.println(hamiz.student_name);
        System.out.println(hamiz.sid);
        System.out.println(hamiz.getPass());
    }
}
