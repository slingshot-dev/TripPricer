package tourGuide;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tourGuide.interfaces.ITripPricer;
import tripPricer.Provider;

import java.util.List;
import java.util.UUID;


@RestController
public class TripPricerController {

//    private final IGpsUtil gpsUtilService;
    private final ITripPricer tripPricerService;

    public TripPricerController(ITripPricer tripPricerService) {
        this.tripPricerService = tripPricerService;
    }

    @RequestMapping("/getPrice")
    public List<Provider> getPrice(@RequestParam String apiKey, @RequestParam UUID attractionId, @RequestParam int adults, @RequestParam int children, @RequestParam int nightsStay, @RequestParam int rewardsPoints) {
        return tripPricerService.getPrice(apiKey, attractionId, adults, children, nightsStay, rewardsPoints);
    }

    @RequestMapping("/getAttractions")
    public String getProviderName(String apiKey, int adults) {
        return tripPricerService.getProviderName(apiKey, adults);
    }

}