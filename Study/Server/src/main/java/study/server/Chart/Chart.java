package study.server.Chart;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Chart {
	@Id
	private String user_id;
	private String user_name;
	private int user_age;
}
