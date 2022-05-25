/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Pong extends ASTRAClass {
	public Pong() {
		setParents(new Class[] {PingPong.class});
		addRule(new Rule(
			"Pong", new int[] {4,7,4,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "target",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Pong", new int[] {4,27,12,3},
				new Statement[] {
					new ModuleCall("console",
						"Pong", new int[] {5,2,5,25},
						new Predicate("println", new Term[] {
							new Variable(Type.LIST, "target")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Pong","console")).println(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ForAll(
						"Pong", new int[] {6,4,6,32},
						new Variable(Type.STRING, "name",false),
						new Variable(Type.LIST, "target"),
						new Block(
							"Pong", new int[] {6,33,12,3},
							new Statement[] {
								new Send("Pong", new int[] {7,8,7,35},
									new Performative("request"),
									new Variable(Type.STRING, "name"),
									new Predicate("ping", new Term[] {})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Pong", new int[] {14,7,14,48},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("pong", new Term[] {})
			),
			Predicate.TRUE,
			new Block(
				"Pong", new int[] {14,47,18,3},
				new Statement[] {
					new ModuleCall("console",
						"Pong", new int[] {15,4,15,27},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("pong")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Pong","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"Pong", new int[] {16,4,16,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(500)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Pong","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Send("Pong", new int[] {17,4,17,33},
						new Performative("request"),
						new Variable(Type.STRING, "sender"),
						new Predicate("ping", new Term[] {})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Pong().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
