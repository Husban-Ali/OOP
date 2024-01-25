

    class Main {
    int student_marks;
    int student_id;
    int student_rollno;

    public void getInfo() {
        System.out.println("Total Marks:" + student_marks);
        System.out.println("Student ID:" + student_id);
        System.out.println("Roll no of student:" + student_rollno);
    }
    }
     class Student extends Main {
        String student_name;

        /* we can use the getInfo function for this class */
        public void getName() {
            System.out.println("Name Of Student:" + student_name);
        }
    }
        public class App {
          public static void main(String[] args){
          Student hamiz = new Student();
          hamiz.student_id = 017;
          hamiz.student_rollno = 205;
          hamiz.student_marks = 100;
          hamiz.student_name = "Hamiz Muzaffer";
          
         hamiz.getInfo();
         hamiz.getName();

    }
    }



