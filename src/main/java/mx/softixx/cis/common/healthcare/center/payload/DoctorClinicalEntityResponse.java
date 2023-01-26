package mx.softixx.cis.common.healthcare.center.payload;

import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorClinicalEntityResponse {
	private Long id;
	private Long doctorId;
    private ClinicalEntityResponse clinicalEntity;
	private boolean active;
	@Getter(AccessLevel.NONE)
	private List<SpecialityResponse> specialities;
	
	public List<SpecialityResponse> getSpecialities() {
		if (specialities == null) {
			specialities = new ArrayList<>();
		}
		return specialities;
	}
}