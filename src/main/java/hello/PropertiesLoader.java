package hello;

public class PropertiesLoader {

    public PropertiesLoader() {
        System.setProperty("spring.profiles.active", "development");
        System.setProperty("spring.jpa.hibernate.ddl-auto", "update");
        System.setProperty("spring.datasource.url", "jdbc:mysql://localhost:3306/ukrfootballteams");
        System.setProperty("spring.datasource.username", "art");
        System.setProperty("spring.datasource.password", "Password1");
    }


}
