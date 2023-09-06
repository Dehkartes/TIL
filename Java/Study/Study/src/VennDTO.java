import lombok.Builder;

@Builder
public class VennDTO {
	String type;
	String title;
	Data[] data;

	public String toString() {
		String res;
		res = this.type + this.title;
		for(Data i: this.data) {
			res += i;
		}
		return res;
	}
}

@Builder
class Data {
	String name;
	String[] sets;
	int value;

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