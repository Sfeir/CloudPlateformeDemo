package cloudplateform.endpoints;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Named;

import cloudplateform.endpoints.entity.Title;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;


@Api(name = "cloudplateformdemo", version = "v1" )
public class TitleEndpoint {

	private static final Logger log = Logger.getLogger(TitleEndpoint.class
			.getName());


	@ApiMethod(name = "titlesAllTitles", httpMethod = "GET", path = "titles")
	public List<Title> getAllTitles() {	
		List<Title> result = new ArrayList<Title>();
		return result;
	}
	
	@ApiMethod(name = "titlesCreateTitle", httpMethod = "POST", path = "titles")
	public Title titlesCreateTitle(@Named("id") String id, Title title) {
		// Create Title
		return title;
	}

	
	@ApiMethod(name = "titlesGetTitleById", httpMethod = "GET", path = "titles/{id}")
	public Title titlesGetTitleById(@Named("id") String id) {
		Title title = new Title("Hexagone :" + id);
		return title;
	}
	
	@ApiMethod(name = "titlesUpdateTitleById", httpMethod = "PUT", path = "titles/{id}")
	public Title titlesUpdateTitleById(@Named("id") String id, Title title) {
		// update Title
		// Error if no Title for this id
		return title;
	}	
}
