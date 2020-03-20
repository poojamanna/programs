package src.org.slk;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {
@GET
@Path("/getBrands")
@Produces(MediaType.TEXT_PLAIN)
public String getBrands() {
	return "list of brands";
}
@POST
@Path("/setBrand")
@Produces(MediaType.TEXT_PLAIN)
public String setBrands() {
	return "add a new brand";
}

}
