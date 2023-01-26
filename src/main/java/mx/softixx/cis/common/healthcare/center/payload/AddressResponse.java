package mx.softixx.cis.common.healthcare.center.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import mx.softixx.cis.common.data.address.BaseAddress;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonInclude(Include.NON_NULL)
public class AddressResponse extends BaseAddress {
	private Long privatePracticeId;
	private Long clinicalEntityId;
	private Long colonyMxId;
	private boolean active;
}