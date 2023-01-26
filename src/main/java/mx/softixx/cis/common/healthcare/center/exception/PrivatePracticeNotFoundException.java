package mx.softixx.cis.common.healthcare.center.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
@Data
@EqualsAndHashCode(callSuper = false)
public class PrivatePracticeNotFoundException extends RuntimeException {

	public PrivatePracticeNotFoundException() {
		super("Private practice not found");
	}
	
}