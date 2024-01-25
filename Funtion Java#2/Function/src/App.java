public class App {
   int roll_no;
   String name;
   int classname;





      public void getInfo() {
        System.out.println("Roll No is"+roll_no);
        System.out.println("Name of Student is"+name);  
        System.out.println("Name of Class is:"+classname);  


      }


    public static void main(String[] args) throws Exception {
            App student1 = new App();
            student1.roll_no = 23;
            student1.classname = 9;
            student1.name= "Hamiz Muzaffer";

            student1.getInfo();
    }
}
