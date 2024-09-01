package lk.ijse.assignment1.user;


import lk.ijse.assignment1.foods.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Kashul {
    @Qualifier
    Food myFavouriteFood ;
    @Autowired
    public Kashul(){
        System.out.println("my favourite food is" + myFavouriteFood );
    }

}
