package lk.ijse.assignment1.user;


import lk.ijse.assignment1.foods.Food;
import org.springframework.beans.factory.annotation.Autowired;

public class Kashul {

    Food myFavouriteFood ;
    public Kashul(){
        System.out.println("my favourite food is" + myFavouriteFood );
    }


}
