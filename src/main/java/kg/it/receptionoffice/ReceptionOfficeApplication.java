package kg.it.receptionoffice;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReceptionOfficeApplication {

	public static void main(String[] args) {
//		Flyway flyway = new Flyway();
//		flyway.
//		flyway.migrate();

//		Flyway fly = new Flyway();
//		//flyway.setInitOnMigrate(true);
//		fly.setSchemas("SBA_DIALOG");
//		//flyway.setLocations("filesystem:src/main/resources/db/migration");
//		fly.setDataSource("jdbc:postgresql://localhost/spReception" , "postgres" , "password");
//		fly.migrate();

		SpringApplication.run(ReceptionOfficeApplication.class, args);
	}

}
