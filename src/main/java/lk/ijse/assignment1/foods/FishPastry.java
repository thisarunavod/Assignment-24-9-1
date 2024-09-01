package lk.ijse.assignment1.foods;

import org.springframework.stereotype.Component;

@Component
public class FishPastry  implements Food{
    @Override
    public void getMyFavouriteFood() {
        System.out.println(" Fish Pastry ");
    }
}
