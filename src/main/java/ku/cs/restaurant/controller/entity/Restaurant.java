package ku.cs.restaurant.controller.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data
@Entity
public class Restaurant {
    @Id //assign primary key
    @GeneratedValue //auto generate UUID
    private UUID id;

    private String name;
    private double rating;
    private String location;

}
