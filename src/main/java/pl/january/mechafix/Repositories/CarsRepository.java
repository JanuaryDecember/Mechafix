package pl.january.mechafix.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.january.mechafix.Model.Cars;

public interface CarsRepository extends JpaRepository<Cars, Long> {
}
