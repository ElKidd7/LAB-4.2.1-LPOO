
package lab.pkg4.pkg2.pkg1.lpoo.pkgnew;

import java.util.ArrayList;
import java.util.List;

public class Itinerary {
    private int userId; // ID del usuario asociado al itinerario
    private List<String> locations; // Lista de lugares en el itinerario
    private double totalCost; // Costo total del itinerario

    public Itinerary(int userId) {
        this.userId = userId;
        this.locations = new ArrayList<>();
        this.totalCost = 0.0;
    }

    // Método 1: Agregar un lugar al itinerario
    public void addLocation(String location, double cost) {
        locations.add(location);
        totalCost += cost;
    }

    // Método 2: Validar las fechas del itinerario
    public boolean validateDates(String startDate, String endDate) {
        return startDate.compareTo(endDate) < 0;
    }

    // Método 3: Calcular el costo total del itinerario
    public double calculateTotalCost() {
        return totalCost;
    }

    // Método para obtener la lista de lugares
    public List<String> getLocations() {
        return locations;
    }
}
