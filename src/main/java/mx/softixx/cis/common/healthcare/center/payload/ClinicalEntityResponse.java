package mx.softixx.cis.common.healthcare.center.payload;

import java.time.LocalTime;
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
public class ClinicalEntityResponse {
	private Long id;
	private String name;
    private String businessName;
    private String logo;
    private String hash;
    private boolean active;
    @Getter(AccessLevel.NONE)
	private List<SpecialityResponse> specialities;
    @Getter(AccessLevel.NONE)
    private List<FunctionalityResponse> functionalities;
    @Getter(AccessLevel.NONE)
    private List<PreferenceResponse> preferences;
    @Getter(AccessLevel.NONE)
    private List<SystemOptionResponse> systemOptions;
    @Getter(AccessLevel.NONE)
    private List<AddressResponse> addresses;
    @Getter(AccessLevel.NONE)
    private List<CustomRoleResponse> customRoles;
    @Getter(AccessLevel.NONE)
    private List<AccessInfoResponse> accessInfos;
	
    public List<SpecialityResponse> getSpecialities() {
    	if (specialities == null) {
    		specialities = new ArrayList<>();
    	}
		return specialities;
	}
    
    public List<FunctionalityResponse> getFunctionalities() {
    	if (functionalities == null) {
    		functionalities = new ArrayList<>();
    	}
		return functionalities;
	}
    
    public List<PreferenceResponse> getPreferences() {
    	if (preferences == null) {
    		preferences = new ArrayList<>();
    	}
		return preferences;
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
	
	public List<AccessInfoResponse> getAccessInfos() {
		if (accessInfos == null) {
			accessInfos = new ArrayList<>();
		}
		return accessInfos;
	}
    
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PreferenceResponse {
    	private Long id;
    	private Long clinicalEntityId;
        private Integer paged;
        private String ip;
        private String ipRangeStart;
        private String ipRangeEnd;
        private Integer pwdExpiration;
        private boolean active;
    }
    
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AccessInfoResponse {
		private Long id;
		private Long clinicalEntityId;
		private Long profileId;
		private Long accessLevelId;
		private boolean active;
		@Getter(AccessLevel.NONE)
	    private List<EmploymentInfoResponse> employmentInfos;
		@Getter(AccessLevel.NONE)
	    private List<ConnectionInfoResponse> connectionInfos;
		
		@Data
		@Builder
		@NoArgsConstructor
		@AllArgsConstructor
		public static class EmploymentInfoResponse {
			private Long id;
			private Long accessInfoId;
		    private String workingDay;
		    private String workingDays;
		    private LocalTime startTime;
		    private LocalTime endTime;
		    private boolean active;
		}
		
		@Data
		@Builder
		@NoArgsConstructor
		@AllArgsConstructor
		public static class ConnectionInfoResponse {
			private Long id;
			private Long accessInfoId;
			private String ip;
			private String ipRangeStart;
			private String ipRangeEnd;
			private boolean active;
		}
	}
    
}