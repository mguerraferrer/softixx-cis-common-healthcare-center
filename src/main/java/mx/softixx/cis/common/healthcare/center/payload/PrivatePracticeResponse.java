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
public class PrivatePracticeResponse {
	private Long id;
	private Long doctorId;
	private String doctorName;
	private String hash;
	private boolean active;
	@Getter(AccessLevel.NONE)
	private List<FunctionalityResponse> functionalities;
	@Getter(AccessLevel.NONE)
	private List<ServiceResponse> services;
	@Getter(AccessLevel.NONE)
	private List<SystemOptionResponse> systemOptions;
	@Getter(AccessLevel.NONE)
	private List<AddressResponse> addresses;
	@Getter(AccessLevel.NONE)
	private List<CustomRoleResponse> customRoles;

	public List<FunctionalityResponse> getFunctionalities() {
		if (functionalities == null) {
			functionalities = new ArrayList<>();
		}
		return functionalities;
	}

	public List<ServiceResponse> getServices() {
		if (services == null) {
			services = new ArrayList<>();
		}
		return services;
	}

	public List<SystemOptionResponse> getSystemOptions() {
		if (systemOptions == null) {
			systemOptions = new ArrayList<>();
		}
		return systemOptions;
	}

	public List<AddressResponse> getAddresses() {
		if (addresses == null) {
			addresses = new ArrayList<>();
		}
		return addresses;
	}

	public List<CustomRoleResponse> getCustomRoles() {
		if (customRoles == null) {
			customRoles = new ArrayList<>();
		}
		return customRoles;
	}

}