package example;

public class IdlePrinter implements Printer{
	@Override
	public void println(String text) {
		// This is empty on purpose, because we don't want to print in tests.
	}
}