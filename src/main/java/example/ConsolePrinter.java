package example;

public class ConsolePrinter implements PrintStream{
	@Override
	public void println(String text) {
		System.out.println(text);
	}
}