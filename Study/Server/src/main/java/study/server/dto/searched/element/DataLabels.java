package study.server.dto.searched.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.annotation.Nullable;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataLabels {
	private String enabled;
	private String connectorColor;
	private String connectorWidth;
	private Integer borderWidth;
	private String useHTML;
	private String format;
	private String description;
	private Integer x;
	private Integer y;
}
