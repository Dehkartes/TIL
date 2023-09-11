package study.server.dto.Venn;
import lombok.*;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VennDTO {
	String type;
	String title;
	List<VennData> vennData;

	public String toString() {
		String res;
		res = this.type + this.title;
		for(VennData i: this.vennData) {
			res += i;
		}
		return res;
	}
}
