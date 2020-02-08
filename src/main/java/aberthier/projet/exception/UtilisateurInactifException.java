package aberthier.projet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Utilisateur Inactif")
public class UtilisateurInactifException extends RuntimeException {
}
