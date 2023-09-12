package study.server.dto.statictics.glycoproteion.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.security.PrivateKey;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tooltip {
	private String pointFormat;
}
