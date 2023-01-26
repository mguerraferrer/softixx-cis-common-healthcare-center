package mx.softixx.cis.common.healthcare.center.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
@Data
@EqualsAndHashCode(callSuper = false)
public class PrivatePracticeHashException extends RuntimeException {

	public PrivatePracticeHashException() {
		super("A private practice with the specified hash already exists");
	}
	
}