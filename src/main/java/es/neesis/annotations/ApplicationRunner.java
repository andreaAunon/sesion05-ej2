package es.neesis.annotations;

import es.neesis.annotations.applications.Game;
import es.neesis.annotations.applications.Menu;
import es.neesis.annotations.configuration.AppConfig;
import es.neesis.annotations.services.ISustituteWordService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Menu menu = new Menu();
        Game game = context.getBean(Game.class);
        menu.startSession(game);
    }
}