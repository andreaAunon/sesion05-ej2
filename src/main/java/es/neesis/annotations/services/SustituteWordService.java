package es.neesis.annotations.services;

import org.springframework.stereotype.Service;

@Service
public class SustituteWordService implements ISustituteWordService {

    @Override
    public String sustitutePorGuiones(String palabraSeleccionada) {
        StringBuilder nuevaPalabra = new StringBuilder();

        for(int i=0; i < palabraSeleccionada.length();i++){
            nuevaPalabra.append("_");
        }

        return nuevaPalabra.toString();
    }

    @Override
    public String sustitutePorLetra(String palabraConGuiones,
                                    String palabraSeleccionada, String letra) {
        for(int i=0; i < palabraSeleccionada.length();i++){
            char caracter = palabraSeleccionada.charAt(i);
            if(Character.toString(caracter).equalsIgnoreCase(letra)){
                palabraConGuiones = palabraConGuiones.substring(0, i) +
                        letra + palabraConGuiones.substring(i + 1);
            }
        }

        return palabraConGuiones;
    }
}
