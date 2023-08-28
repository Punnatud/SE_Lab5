package ku.cs.restaurant.controller;

import ku.cs.restaurant.controller.entity.Restaurant;
import ku.cs.restaurant.controller.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping("/restaurant")
    public List<Restaurant> getAllRestaurants(){
        return service.getAll();
    }
    @PostMapping("/restaurant")
    public Restaurant create(@RequestBody Restaurant restaurant){
        return service.create(restaurant);
    }
    @GetMapping("/restaurant/{id}")
    public Restaurant getRestaurantById(@PathVariable UUID id){
        return service.getRestaurantByID(id);
    }
    @GetMapping("/restaurant/name/{name}")
    public Restaurant getRestaurantByName(@PathVariable String name){
        return service.getRestaurantByName(name);
    }
    @GetMapping("/restaurant/location/{location}")
    public List<Restaurant> getRestaurantByLocation(@PathVariable String location){
        return service.getRestaurantByLocation(location);
    }
    @PutMapping("/restaurant")
    public Restaurant update(@RequestBody Restaurant restaurant){
        return service.update(restaurant);
    }
    @DeleteMapping("/restaurant/{id}")
    public Restaurant delete(@PathVariable UUID id){
        return service.delete(id);
    }
}

