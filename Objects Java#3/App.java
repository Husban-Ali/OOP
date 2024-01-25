/**
 * App
 */
public class App {

    String name;
  int classname;
 int marks;
 String remarks;

public  void getRemarks() {
    System.out.println("Name of student is: "+name);
    System.out.println("Class of Student: "+classname);
    System.out.println("Total marks of student are: "+marks);
    System.out.println("Remarks for Student: "+remarks);
}
public static void main(String[]args) {

    App firstStudent = new App();
    firstStudent.name = "Hamiz Muzaffer";
    firstStudent.classname = 9;
    firstStudent.marks = 29;
    firstStudent.remarks = "Excellent";

    firstStudent.getRemarks();





    App secondStudent = new App();
    secondStudent.name = " \n\n\nSyed Husban Ali";
    secondStudent.classname = 9;
    secondStudent.marks = 22;
    secondStudent.remarks = "Good";

    secondStudent.getRemarks();



    App thirdStudent = new App();
 thirdStudent.name = "\n\n\n\nAlishba Khan";
 thirdStudent.classname = 9;
 thirdStudent.marks = 25;
 thirdStudent.remarks = "Very Good";

 thirdStudent.getRemarks();

}




    


}
