package mx.softixx.cis.common.healthcare.center.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class SystemOptionResponse {
	private Long id;
	private Long privatePracticeId;
	private Long clinicalEntityId;
	private Long autoConfigSystemOptionId;
	private String hash;
	private boolean active;
}