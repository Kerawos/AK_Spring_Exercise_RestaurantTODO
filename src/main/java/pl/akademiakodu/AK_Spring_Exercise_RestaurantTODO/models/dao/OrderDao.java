package pl.akademiakodu.AK_Spring_Exercise_RestaurantTODO.models.dao;

import pl.akademiakodu.AK_Spring_Exercise_RestaurantTODO.models.Meal;

import java.util.List;

public interface OrderDao {
    List<OrderR> getAllOrders();
    void addOrder(OrderR order);
    void removeOrder(OrderR order);
    void addMealToOrder(OrderR order, Meal meal);
    void removeMealFromOrder(OrderR order, Meal meal);
    boolean checkIfMealAppearInOurOrder(OrderR order, Meal meal);
}
