package pl.akademiakodu.AK_Spring_Exercise_RestaurantTODO.models;

import pl.akademiakodu.AK_Spring_Exercise_RestaurantTODO.models.dao.OrderR;

import java.util.List;

public class Restaurant {

    private List<Meal> menu = new MealDatabase().getMeals();

    public boolean checkIfMealExist(String mealName){
        for (Meal meal : menu) {
            if (mealName.equals(meal.getName())){
                return true;
            }
        }
        return false;
    }

    public int calculateOrderPrice(OrderR orderR){
        int sum = 0;
        //todo implement
        return sum;
    }

    public Meal getMeal(String mealName){
        //todo implement
        return null;
    }

    public List<Meal> getMenu() {
        return menu;
    }
}
