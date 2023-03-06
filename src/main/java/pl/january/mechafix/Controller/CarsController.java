package pl.january.mechafix.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.january.mechafix.Model.Cars;
import pl.january.mechafix.Service.CarsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarsController {
    private final CarsService carsService;

    @GetMapping("/cars")
    public List<Cars> getCars() {
        return carsService.getCars();
    }
}
