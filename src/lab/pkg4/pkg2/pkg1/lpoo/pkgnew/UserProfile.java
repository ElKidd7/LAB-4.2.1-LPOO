
package lab.pkg4.pkg2.pkg1.lpoo.pkgnew;

import lab.pkg4.pkg2.pkg1.lpoo.pkgnew.Itinerary;
import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private String username; // Nombre del usuario
    private List<Itinerary> itineraries; // Lista de itinerarios asociados al perfil

    public UserProfile(String username) {
        this.username = username;
        this.itineraries = new ArrayList<>();
    }

    // Método 1: Agregar un itinerario al perfil
    public void addItinerary(Itinerary itinerary) {
        itineraries.add(itinerary);
    }

    // Método 2: Compartir un itinerario (simulación)
    public void shareItinerary(Itinerary itinerary) {
        System.out.println(username + " compartió un itinerario con " 
            + itinerary.getLocations().size() + " lugares.");
    }

    // Método para obtener los itinerarios del usuario
    public List<Itinerary> getItineraries() {
        return itineraries;
    }
}
