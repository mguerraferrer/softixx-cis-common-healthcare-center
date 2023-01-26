package mx.softixx.cis.common.healthcare.center.payload;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
@JsonInclude(Include.NON_NULL)
public class SpecialityResponse {
	private Long id;
	private Long doctorClinicalEntityId;
	private Long clinicalEntityId;
	private Long specialityId;
	private String professionalLicense;
	private Integer appointmentDuration;
	private String hash;
	private boolean active;
	@Getter(AccessLevel.NONE)
	private List<ServiceResponse> services;
	
	public List<ServiceResponse> getServices() {
		if (services == null) {
			services = new ArrayList<>();
    	}
		return services;
	}
}