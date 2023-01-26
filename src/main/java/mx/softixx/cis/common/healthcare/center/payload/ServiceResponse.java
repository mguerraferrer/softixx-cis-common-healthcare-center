package mx.softixx.cis.common.healthcare.center.payload;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
public class ServiceResponse {
	private Long id;
	private Long privatePracticeId;
	private Long doctorSpecialityId;
	private Long clinicalEntityId;
	private Long clinicalEntitySpecialityId;
	private Long doctorClinicalEntitySpecialityId;
	private String code;
	private String description;
	private BigDecimal subtotal;
	private BigDecimal tax;
	private BigDecimal discount;
	private BigDecimal total;
	private LocalDateTime discountStartDate;
	private LocalDateTime discountDueDate;
	private boolean active;
}