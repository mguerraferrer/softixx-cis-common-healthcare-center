package mx.softixx.cis.common.healthcare.center.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mx.softixx.cis.common.validation.message.ValidatorMessage;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrivatePracticeRequest {
	@NotNull(message = ValidatorMessage.REQUIRED)
	private Long doctorId;
	
	@NotEmpty
	private String doctorName;
	
	@Getter(AccessLevel.NONE)
	private Boolean active;
	
	public Boolean isActive() {
		return active;
	}
	
}