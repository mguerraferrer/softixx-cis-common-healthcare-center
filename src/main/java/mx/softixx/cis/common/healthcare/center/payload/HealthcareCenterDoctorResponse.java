package mx.softixx.cis.common.healthcare.center.payload;

import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HealthcareCenterDoctorResponse {
	private PrivatePracticeResponse privatePractice;
	@Getter(AccessLevel.NONE)
	private List<DoctorClinicalEntityResponse> doctorClinicalEntities;
	
	public List<DoctorClinicalEntityResponse> getDoctorClinicalEntities() {
		if (doctorClinicalEntities == null) {
			doctorClinicalEntities = new ArrayList<>();
		}
		return doctorClinicalEntities;
	}
	
}