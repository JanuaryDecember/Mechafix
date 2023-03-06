package pl.january.mechafix.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.january.mechafix.Model.Cars;
import pl.january.mechafix.Repositories.CarsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarsService {
    private final CarsRepository carsRepository;

    public List<Cars> getCars(){
        return carsRepository.findAll();
    }
}
