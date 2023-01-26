package mx.softixx.cis.common.healthcare.center.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
@Data
@EqualsAndHashCode(callSuper = false)
public class PrivatePracticeAlreadyExistsException extends RuntimeException {

	public PrivatePracticeAlreadyExistsException() {
		super("There is already a private practice associated with the specified doctor");
	}
	
}