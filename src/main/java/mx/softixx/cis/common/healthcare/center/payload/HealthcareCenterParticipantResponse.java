package mx.softixx.cis.common.healthcare.center.payload;

import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class HealthcareCenterParticipantResponse extends HealthcareCenterDoctorResponse {
	@Getter(AccessLevel.NONE)
	private List<PrivatePracticeResponse> privatePractices;

	public List<PrivatePracticeResponse> getPrivatePractices() {
		if (privatePractices == null) {
			privatePractices = new ArrayList<>();
		}
		return privatePractices;
	}

}