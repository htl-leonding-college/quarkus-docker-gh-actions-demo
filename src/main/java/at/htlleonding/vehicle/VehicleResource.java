package at.htlleonding.vehicle;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/vehicle")
public class VehicleResource {

    @Inject
    VehicleRepository vehicleRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Vehicle> listAll() {
        return vehicleRepository.listAll();
    }
}
