package cloudplateform.search;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.search.Field;
import com.google.appengine.api.search.Index;
import com.google.appengine.api.search.IndexSpec;
import com.google.appengine.api.search.Results;
import com.google.appengine.api.search.ScoredDocument;
import com.google.appengine.api.search.SearchException;
import com.google.appengine.api.search.SearchServiceFactory;
import com.google.appengine.api.search.StatusCode;

@SuppressWarnings("serial")
public class CloudPlateformSearchQueryDataServlet extends HttpServlet {
	@SuppressWarnings("incomplete-switch")
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		printHeader(out);
		printBody(out);

		String query = req.getParameter("q");

		try {
			// Query the index.
			Results<ScoredDocument> results = getIndex().search(
					"title:" + query);

			for (ScoredDocument document : results) {
				resp.getWriter().println("<br><br><h3>Document trouvé</h3>");
				for (Field field : document.getFields()) {
					switch (field.getType()) {
					case TEXT:
						out(field.getText(), out);
						break;
					case HTML:
						out(field.getHTML(), out);
						break;
					case ATOM:
						out(field.getAtom(), out);
						break;
					case DATE:
						out(field.getDate().toString(), out);
						break;
					}
				}
			}
		} catch (SearchException e) {
			if (StatusCode.TRANSIENT_ERROR.equals(e.getOperationResult()
					.getCode())) {
				// retry
			}
		}

		resp.getWriter().println("<br><br><br>---Fin");
	}
	private void printBody(PrintWriter out) {
		out.println("<body>");
		out.println("<img src=\"images/illustrations/clipboard.png\" class=\"big-illustration-pusher\">");
	}

	private void out(String text, PrintWriter out) {
		out.println("<br/>" + text);
	}

	private Index getIndex() {
		IndexSpec indexSpec = IndexSpec.newBuilder().setName("myindex").build();
		return SearchServiceFactory.getSearchService().getIndex(indexSpec);
	}

	private void printHeader(PrintWriter out) {
		out.println("<head>");
		out.println("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">");
		out.println(" <link href=\"css/flat-ui.css\" rel=\"stylesheet\">");
		out.println("</head>");
	}

}
