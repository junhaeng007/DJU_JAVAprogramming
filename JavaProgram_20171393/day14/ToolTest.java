package day14;

class ToolBox<V1, V2>{
	public V1 tool1;
	public V2 tool2;
}

class Spanner{
	String name = "스패너";
}
class Driver{
	String name = "드라이버";
}
 class Hammer{
	String name = "해머";
}

public class ToolTest {

	public static void main(String[] args) {
		ToolBox<Driver, Hammer> toolBox = new ToolBox<Driver, Hammer>();
		toolBox.tool1 = new Driver();
		toolBox.tool2 = new Hammer();
		System.out.println(toolBox.tool1.name);
		System.out.println(toolBox.tool2.name);

	}

}
