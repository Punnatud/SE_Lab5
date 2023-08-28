package ku.cs.restaurant.controller.service;

import ku.cs.restaurant.controller.entity.Restaurant;
import ku.cs.restaurant.controller.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAll(){
        return repository.findAll();
    }
    public Restaurant create(Restaurant restaurant){
       Restaurant record = repository.save(restaurant);
       return record;
    }
    public Restaurant getRestaurantByID(UUID id){
        return repository.findById(id).get();
    }
    public Restaurant getRestaurantByName(String name){
        return repository.findByName(name);
    }
    public List<Restaurant> getRestaurantByLocation(String location){
        return repository.findByLocation(location);
    }
    public Restaurant update(Restaurant requestBody){
        UUID id = requestBody.getId();
        Restaurant record = repository.findById(id).get();
        record.setName(requestBody.getName());
        record.setRating(requestBody.getRating());
        record.setLocation(requestBody.getLocation());

        return repository.save(record);
    }
    public Restaurant delete(UUID id) {
        Restaurant record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }

}
