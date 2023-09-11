package study.server.dto.Venn;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VennData {
	private String name;
	private String[] sets;
	private int value;

	public String toString(){
		String res;
		res = this.name;
		for(String i: this.sets) {
			res += i;
		}
		res += this.value;

		return res;
	}
}