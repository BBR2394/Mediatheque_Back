package aberthier.projet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Document non trouve")
public class DocumentNotFoundException extends RuntimeException {
}
