package example;

public class ConsolePrinter implements Printer{
	@Override
	public void println(String text) {
		System.out.println(text);
	}
}