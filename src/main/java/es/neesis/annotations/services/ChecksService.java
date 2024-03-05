package es.neesis.annotations.services;

import org.springframework.stereotype.Service;

@Service
public class ChecksService implements IChecksService {

    @Override
    public boolean checkPalabra(String palabraSeleccionada, String palabra) {
        return palabraSeleccionada.equals(palabra);
    }

    @Override
    public boolean checkLetra(String palabraSeleccionada, String letra) {
        return palabraSeleccionada.contains(letra);
    }
}
