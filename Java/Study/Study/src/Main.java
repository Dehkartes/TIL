// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		VennDTO vdto = VennDTO.builder()
				.type("venn")
				.title("Group 1: The number of shared proteins")
				.data(new Data[]{
						Data.builder()
							.name("<b>345</b><br>9.54%")
							.sets(new String[]{"1_2 Intensity"})
							.value(3189)
							.build(),
						Data.builder()
							.name("<b>424</b><br>11.73%")
							.sets(new String[]{"1_2 Intensity"})
							.value(3268)
							.build(),
						Data.builder()
							.name("<b>428</b><br>11.84%")
							.sets(new String[]{"1_3 Intensity"})
							.value(3272)
							.build(),
						Data.builder()
							.name("<b>103</b><br>81.5%")
							.sets(new String[]{"1_1 Intensity",
									"1_2 Intensity"})
							.value(2947)
							.build(),
						Data.builder()
							.name("<b>161</b><br>83.1%")
							.sets(new String[]{"1_1 Intensity",
									"1_3 Intensity"})
							.value(3005)
							.build(),
						Data.builder()
							.name("<b>161</b><br>83.1%")
							.sets(new String[]{"1_2 Intensity",
									"1_3 Intensity"})
							.value(3005)
							.build(),
						Data.builder()
							.name("<b>2844</b><br>78.65%")
							.sets(new String[]{"1_1 Intensity",
									"1_2 Intensity",
									"1_3 Intensity"})
							.value(2844)
							.build()
						})
				.build();

		System.out.println(vdto);
	}
}