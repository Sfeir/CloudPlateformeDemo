package cloudplateform.mail;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CloudPlateformMailServlet extends HttpServlet {
	@SuppressWarnings("incomplete-switch")
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String email = req.getParameter("email");

		Properties props = new Properties();
		Session session = Session.getDefaultInstance(props, null);

		if (email != null && email.equals("didier.girard@gmail.com")) {
			String msgBody = "Ca fonctionne, la salle applaudit !";

			try {
				Message msg = new MimeMessage(session);
				msg.setFrom(new InternetAddress("didier.girard@gmail.com",
						"Example.com Admin"));
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(
						email, "Mr. User"));
				msg.setSubject("La demo email pour Devoxx");
				msg.setText(msgBody);
				Transport.send(msg);

			} catch (AddressException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
			resp.getWriter().println("<br><br><br>---Email Envoyés");
		} else {
			resp.getWriter()
					.println("<br><br><br>---Adresse email non valide.");

		}
	}

}
