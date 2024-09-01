package lk.ijse.assignment1.foods;

import org.springframework.stereotype.Component;

@Component
public class ChickenBun implements Food {
    @Override
    public void getMyFavouriteFood() {
        System.out.println("Chicken Bun");
    }
}
