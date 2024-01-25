/**
 * App
 */
public class App {
int className;
String studentName;
int rollNo;
String remarks;
 



public App (int cname,String stu_name, int rollno, String remark){
     className = cname;
    studentName  = stu_name;
rollNo = rollno;
 remarks = remark;

} 

public void getdetails() {
    System.out.println("\n \n \n Class Of Student:"+className);
    System.out.println("Name of Student:"+studentName);
    System.out.println("Roll No of Student:"+rollNo);
    System.out.println("Remarks"+remarks);
}



public static void main(String[] args) {
    App student1 = new App(8,"Hamiz Muzaffer",23,"Very Good");
    student1.getdetails();


    App student2 = new App(8,"Syed Husban Ali",28,"Bad");
    student2.getdetails();
}


}