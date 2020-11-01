package tourGuide.interfaces;


import tripPricer.Provider;
import java.util.List;
import java.util.UUID;

public interface ITripPricer {

/*    VisitedLocation getUserLocation(String userId);

    List<Attraction> getAttractions();*/



    List<Provider> getPrice(String apiKey, UUID attractionId, int adults, int children, int nightsStay, int rewardsPoints);

    String getProviderName(String apiKey, int adults);




}
