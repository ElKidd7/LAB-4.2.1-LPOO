
package lab.pkg4.pkg2.pkg1.lpoo.pkgnew;

import lab.pkg4.pkg2.pkg1.lpoo.pkgnew.Itinerary;
import lab.pkg4.pkg2.pkg1.lpoo.pkgnew.UserProfile;

public class Main {
    public static void main(String[] args) {
        // Crear un itinerario
        Itinerary itinerary = new Itinerary(1);
        itinerary.addLocation("París", 1500.00);
        itinerary.addLocation("Londres", 2000.00);

        // Validar fechas
        if (itinerary.validateDates("2024-01-01", "2024-01-10")) {
            System.out.println("Fechas válidas para el itinerario.");
        } else {
            System.out.println("Fechas inválidas.");
        }

        // Calcular el costo total
        System.out.println("Costo total del itinerario: $" + itinerary.calculateTotalCost());

        // Crear un perfil de usuario y agregar itinerario
        UserProfile user = new UserProfile("JuanTraveler");
        user.addItinerary(itinerary);

        // Compartir el itinerario
        user.shareItinerary(itinerary);
    }
}

