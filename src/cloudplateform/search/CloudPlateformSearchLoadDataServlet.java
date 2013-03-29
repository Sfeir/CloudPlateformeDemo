package cloudplateform.search;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.search.Document;
import com.google.appengine.api.search.Document.Builder;
import com.google.appengine.api.search.Field;
import com.google.appengine.api.search.Index;
import com.google.appengine.api.search.IndexSpec;
import com.google.appengine.api.search.PutException;
import com.google.appengine.api.search.Results;
import com.google.appengine.api.search.ScoredDocument;
import com.google.appengine.api.search.SearchException;
import com.google.appengine.api.search.SearchServiceFactory;
import com.google.appengine.api.search.StatusCode;

@SuppressWarnings("serial")
public class CloudPlateformSearchLoadDataServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		
		Builder doc = addTitle("Dark Side of the Moon", "Pink Floyd");
		Builder doc2 = addTitle("The Wall", "Pink Floyd");
		Builder doc3 = addTitle("Another Brick in the Wall", "Pink Floyd");

		try {
			// Put the document.
			getIndex().put(doc);
			getIndex().put(doc2);
			getIndex().put(doc3);
		} catch (PutException e) {
			if (StatusCode.TRANSIENT_ERROR.equals(e.getOperationResult()
					.getCode())) {
				// retry putting the document
			}
		}

		resp.getWriter().println("Data is loaded");
	}

	private Builder addTitle(String title, String band) {
		Builder doc = Document
				.newBuilder()
				.addField(
						Field.newBuilder().setName("title")
								.setText(title))
				.addField(
						Field.newBuilder().setName("band")
								.setText(band));
		return doc;
	}

	private Index getIndex() {
		IndexSpec indexSpec = IndexSpec.newBuilder().setName("myindex").build();
		return SearchServiceFactory.getSearchService().getIndex(indexSpec);
	}
}
