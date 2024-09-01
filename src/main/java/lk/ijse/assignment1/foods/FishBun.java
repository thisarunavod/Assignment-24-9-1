package lk.ijse.assignment1.foods;

import org.springframework.stereotype.Component;

@Component
public class FishBun implements Food{
    @Override
    public void getMyFavouriteFood() {
        System.out.println(" Fish Bun");
    }
}
