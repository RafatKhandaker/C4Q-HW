package nyc.c4q.RafatKhandaker;

/**
 * Created by root on 9/4/16.
 */
public class Student {
    //Protected variables can be accessed by the main class because they are part of the same package
    private String firstName;
    private String lastName;
    private int idNumber;
    private String favFood;

    public Student(){

    }

    public Student(String firstName, String lastName, int idNumber, String favFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.favFood = favFood;
    }

    public Student(String firstName, String lastName, int idNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public Student(String favFood){

        this.favFood = favFood;
    }


    public String getName(){
        return firstName;
    }

    public String getLast(){
        return lastName;
    }

    public int getID(){
        return idNumber;
    }
    public String getFood(){
        return favFood;
    }

    public void setFirstName(String first){
        firstName = first;
    }

    public void setLastName(String last){
        lastName = last;
    }

    public void setID(int x){
        idNumber = x;
    }

    public void setFavFood(String food){
        favFood = food;
    }
    //This method is marked public so that you can access it from the main class
    public static boolean checkSameFavoriteFood(Student x, Student y){
        if(x.getFood().equalsIgnoreCase((y.getFood().toLowerCase()))){
            return true;
        }
        else{
            return false;
        }
    }


}
