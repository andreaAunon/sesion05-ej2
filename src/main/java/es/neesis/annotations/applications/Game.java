package es.neesis.annotations.applications;

import es.neesis.annotations.services.IChecksService;
import es.neesis.annotations.services.ISustituteWordService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Game {

    private String[] palabras = {"manzana", "melocoton", "pera",
            "naranja", "uva", "sandia", "piña", "fresa", "melon", "cereza"};

    private String palabraSeleccionada;
    private String palabraGuiones;
    private int intentos;

    // Services
    private IChecksService checksService;
    private ISustituteWordService sustituteWordService;

    public Game(ISustituteWordService sustituteWordService, IChecksService checksService){
        this.sustituteWordService = sustituteWordService;
        this.checksService = checksService;

        // Al iniciar el juego se selecciona una palabra aleatoria de la lista
        this.intentos = 8;
        seleccionPalabra();
        sustituirPorGuiones();
    }

    public boolean checkLetra(String letra){
        if(!(checksService.checkLetra(palabraSeleccionada,letra))){
            intentos--;
            return false;
        }

        this.palabraGuiones = sustituteWordService.sustitutePorLetra(palabraGuiones,
                palabraSeleccionada,letra);
        return true;
    }

    public void reinicioGame(){
        this.intentos = 8;
        seleccionPalabra();
        sustituirPorGuiones();
    }

    public int getIntentos(){
        return this.intentos;
    }

    public String getPalabraSeleccionada(){
        return this.palabraSeleccionada;
    }

    public String getPalabraGuiones(){
        return this.palabraGuiones;
    }

    public boolean checkPalabra(String palabra){
        if(!(checksService.checkPalabra(palabraSeleccionada,palabra))){
            intentos--;
            return false;
        }

        return true;
    }

    private void seleccionPalabra(){
        Random random = new Random();
        int index = random.nextInt(palabras.length);
        this.palabraSeleccionada = palabras[index];
    }

    private void sustituirPorGuiones(){
        this.palabraGuiones = sustituteWordService.sustitutePorGuiones(palabraSeleccionada);
    }
}
