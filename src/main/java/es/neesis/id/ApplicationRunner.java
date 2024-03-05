package es.neesis.id;

import es.neesis.id.applications.InjectorMainApplication;
import es.neesis.id.applications.LegacyMainApplication;

public class ApplicationRunner {

    public static void main(String[] args) {
        // Ejecución legacy
        System.out.println("Ejecución legacy");
        LegacyMainApplication application = new LegacyMainApplication();
        application.sendMail("sergio@devanddel.com","Recordatorio","Recuerda que tienes que hacer el ejercicio de hoy.");
        System.out.println("--------------------");
        System.out.println("Ejecución con inyección de dependencias");
        // Ejecución con inyección de dependencias
        InjectorMainApplication injectorMainApplication = new InjectorMainApplication();
        injectorMainApplication.sendMail("sergio@devanddel.com","Recordatorio","Recuerda que tienes que hacer el ejercicio de hoy.");
        System.out.println("--------------------");
    }
}
