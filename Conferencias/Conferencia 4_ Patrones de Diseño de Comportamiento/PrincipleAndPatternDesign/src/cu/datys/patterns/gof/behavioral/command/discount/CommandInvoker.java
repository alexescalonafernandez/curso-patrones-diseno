package cu.datys.patterns.gof.behavioral.command.discount;

public class CommandInvoker {
	
	private Command command;
	
	public CommandInvoker(Command command) {
		this.command = command;
	}
	
	public void execute() {
		this.command.execute();
	}
	
}
