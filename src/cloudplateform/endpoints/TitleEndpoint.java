package cloudplateform.endpoints;

import java.util.logging.Logger;

import javax.inject.Named;

import cloudplateform.endpoints.entity.Title;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;


@Api(name = "cloudplateformdemo", version = "v1" )
public class TitleEndpoint {

	private static final Logger log = Logger.getLogger(TitleEndpoint.class
			.getName());


	
	@ApiMethod(name = "title", httpMethod = "GET", path = "title/{id}")
	public Title title(@Named("id") String id) {
		Title title = new Title("Hexagone :" + id);
		return title;
	}	
}
