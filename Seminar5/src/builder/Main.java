package builder;

public class Main {

	public static void main(String[] args) {
		AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
		autobuzBuilder.setNumeSofer("SoferCTS");
		autobuzBuilder.setTextRulat("Text");
		AutobuzLinie autobuzLinie=autobuzBuilder.build();
		System.out.println(autobuzLinie.toString());

	}

}
