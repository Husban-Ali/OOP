public class App {


public void getCelcius(float temp)
{
       float tempInCel = (temp-32)*5/9;
       System.out.println(tempInCel);
}


// you can add farenheit and kelvin functions similarly










    public static void main(String[] args) throws Exception {
        App temp1 = new App();
        temp1.getCelcius(56);
    }
}
