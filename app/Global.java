
import java.text.DateFormat;
import java.util.Calendar;

import models.Anuncio;
import models.dao.GenericDAO;
import play.*;
import play.db.jpa.JPA;

public class Global extends GlobalSettings {
	private static GenericDAO dao = new GenericDAO();

    @Override
    public void onStart(Application app) {
        Logger.info("Aplicação inicializada...");

        JPA.withTransaction(new play.libs.F.Callback0() {
            @Override
            public void invoke() throws Throwable {
            	Calendar c = Calendar.getInstance();
        		c.set(2015, 4, 20);
        		String tipo = "Tocar em banda";
        		for (int i = 0; i <= 25; i++) {
        			dao.persist(new Anuncio("iddelete" + i, "Anuncio" + i,
        					"texto de descrição", "Violão, Guitarra", "samba, rock",
        					"funk", tipo, "fulano@gmail.com", "",
        					"Parque do Povo, Campina Grande", DateFormat
        							.getDateInstance(DateFormat.LONG).format(
        									c.getTime())));
        			if ((i % 2) == 0) {
        				c.add(Calendar.DAY_OF_MONTH, 1);
        				tipo = "Tocar ocasionalmente";
        			} else {
        				tipo = "Tocar em banda";
        			}
        			dao.flush();

        		}
            }
            
        });
    }

	public void onStop(Application app) {
		Logger.info("Aplicação desligada...");
	}
}
