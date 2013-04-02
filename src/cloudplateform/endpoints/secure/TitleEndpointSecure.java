package cloudplateform.endpoints.secure;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Named;

import cloudplateform.endpoints.entity.Title;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.appengine.api.oauth.OAuthRequestException;
import com.google.appengine.api.users.User;

@Api(name = "cloudplateformdemosecure",
     version = "v1",
     clientIds = { com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID },
     scopes = {
		"https://www.googleapis.com/auth/userinfo.email",
		"https://www.googleapis.com/auth/userinfo.profile" })
public class TitleEndpointSecure {

	private static final Logger log = Logger
			.getLogger(TitleEndpointSecure.class.getName());

	@ApiMethod(name = "titlesAllTitles", httpMethod = "GET", path = "secure/titles")
	public List<Title> getAllTitles(User user) throws OAuthRequestException {
		if(user==null)
			throw new OAuthRequestException("Invalid user.");
		List<Title> result = new ArrayList<Title>();
		return result;
	}

	@ApiMethod(name = "titlesCreateTitle", httpMethod = "POST", path = "secure/titles")
	public Title titlesCreateTitle(@Named("id") String id, Title title,
			User user) throws OAuthRequestException {
		if(user==null)
			throw new OAuthRequestException("Invalid user.");
		// Create Title
		return title;
	}

	@ApiMethod(name = "titlesGetTitleById", httpMethod = "GET", path = "secure/titles/{id}")
	public Title titlesGetTitleById(@Named("id") String id, User user) throws OAuthRequestException {
		if(user==null)
			throw new OAuthRequestException("Invalid user.");
		log.warning(user.getEmail());
		Title title = new Title("Hexagone :" + id);
		return title;
	}

	@ApiMethod(name = "titlesUpdateTitleById", httpMethod = "PUT", path = "secure/titles/{id}")
	public Title titlesUpdateTitleById(@Named("id") String id, Title title,
			User user) throws OAuthRequestException {
		if(user==null)
			throw new OAuthRequestException("Invalid user.");
		// update Title
		// Error if no Title for this id
		return title;
	}

}
