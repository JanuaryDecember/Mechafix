package pl.january.mechafix.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cars {
    @Id
    private long id;
    private String brand;
    private String model;
    private String generation;
    private short motorCapacity;
    private String motorCode;
    private String fuelType;
    private boolean Lifting;
    private short ProductionYear;
}
