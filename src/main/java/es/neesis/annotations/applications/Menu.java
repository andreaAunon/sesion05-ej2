package es.neesis.annotations.applications;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Menu {

    private Game game;

    public void startSession(Game game){
        this.game = game;
        boolean newGame = showMenu();

        if(newGame){
            startGame();
        }

        while(newGame){
            game.reinicioGame();
            newGame = showMenu();
        }
    }

    public boolean showMenu() {
        System.out.println("¿Desea iniciar una nueva partida? (s/n)");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        if(option.equals("s") || option.equals("S")){
            return true;
        }

        return false;
    }

    private void startGame(){
        boolean isWin = false;
        while(game.getIntentos() > 0 && !isWin){
            isWin = pedirLetra();
        }

        if(isWin){
            System.out.println("¡Ha acertado!");
        }

        if(game.getIntentos() == 0){
            System.out.println("Se ha quedado sin intentos");
            System.out.println("La palabra era " + game.getPalabraSeleccionada());
        }
    }

    private boolean pedirLetra() {
        System.out.println("Introduzca letra o palabra: ");
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.nextLine();

        if(letra.length() > 1){
            return game.checkPalabra(letra);
        } else {
            game.checkLetra(letra);
            System.out.println(game.getPalabraGuiones());
            return game.checkPalabra(game.getPalabraGuiones());
        }
        
    }

}
