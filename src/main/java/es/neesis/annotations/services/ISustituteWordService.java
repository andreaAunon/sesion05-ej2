package es.neesis.annotations.services;
public interface ISustituteWordService {
    public String sustitutePorGuiones(String palabraSeleccionada);
    public String sustitutePorLetra(String palabraConGuiones,
                                    String palabraSeleccionada, String letra);
}
