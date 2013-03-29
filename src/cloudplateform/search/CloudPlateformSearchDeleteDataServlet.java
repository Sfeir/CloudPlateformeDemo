package cloudplateform.search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.search.Document;
import com.google.appengine.api.search.GetRequest;
import com.google.appengine.api.search.GetResponse;
import com.google.appengine.api.search.Index;
import com.google.appengine.api.search.IndexSpec;
import com.google.appengine.api.search.SearchServiceFactory;

@SuppressWarnings("serial")
public class CloudPlateformSearchDeleteDataServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");

		try {
		    while (true) {
		        List<String> docIds = new ArrayList<String>();
		        // Return a set of document IDs.
		        GetRequest request = GetRequest.newBuilder().setReturningIdsOnly(true).build();
		        GetResponse<Document> response = getIndex().getRange(request);
		        if (response.getResults().isEmpty()) {
		            break;
		        }
		        for (Document doc : response) {
		            docIds.add(doc.getId());
		        }
		        getIndex().delete(docIds);
		    }
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		resp.getWriter().println("Data are deleted");
	}

	private Index getIndex() {
		IndexSpec indexSpec = IndexSpec.newBuilder().setName("myindex").build();
		return SearchServiceFactory.getSearchService().getIndex(indexSpec);
	}
}
