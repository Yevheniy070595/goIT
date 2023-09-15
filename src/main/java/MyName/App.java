package MyName;


import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {
        Person person = new Person("Evgenii","Rovenskii");
        compareToJSON(person);
    }

    public static void compareToJSON( Person person )
    {
        Gson gson = new Gson();
       String JSONnew = gson.toJson(person);
       System.out.println(JSONnew);
    }
}
