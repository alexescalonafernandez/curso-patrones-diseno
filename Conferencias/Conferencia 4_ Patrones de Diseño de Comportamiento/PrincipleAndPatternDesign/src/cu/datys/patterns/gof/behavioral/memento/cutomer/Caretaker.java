package cu.datys.patterns.gof.behavioral.memento.cutomer;

import java.util.Stack;

/** Caretaker */
public class Caretaker {

	private Stack<CustomerMemento> customerHistory = new Stack<CustomerMemento>();
	public void save(Customer customer) {
		customerHistory.push(customer.save());
	}
	public void revert(Customer customer) {
		customer.revert(customerHistory.pop());
	}
}
