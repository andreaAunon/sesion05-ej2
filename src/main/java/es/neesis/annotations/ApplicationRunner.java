package es.neesis.annotations;

import es.neesis.annotations.applications.AutowiredApplication;
import es.neesis.annotations.applications.ConstructorApplication;
import es.neesis.annotations.applications.NewApplication;
import es.neesis.annotations.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Ejecución con inyección de dependencias usando new");
        NewApplication application = new NewApplication();
        application.sendMail("sergio@devanddel.com","Recordatorio","Recuerda que tienes que hacer el ejercicio de hoy.");
        System.out.println("--------------------");

        System.out.println("Ejecución con inyección de dependencias usando constructor");
        ConstructorApplication constructorApplication = context.getBean(ConstructorApplication.class);
        constructorApplication.sendMail("sergio@devanddel.com","Recordatorio","Recuerda que tienes que hacer el ejercicio de hoy.");
        System.out.println("--------------------");

        System.out.println("Ejecución con inyección de dependencias usando @Autowired");
        AutowiredApplication autowiredApplication = context.getBean(AutowiredApplication.class);
        autowiredApplication.sendMail("sergio@devanddel.com","Recordatorio","Recuerda que tienes que hacer el ejercicio de hoy.");
        System.out.println("--------------------");
    }
}
