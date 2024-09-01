package lk.ijse.assignment1.foods;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Qualifier
public class ChickenRoll  implements Food {

    @Override
    public void getMyFavouriteFood() {
        System.out.println("Chicken Roll");
    }
}
