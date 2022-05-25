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
			"Pong", new int[] {6,7,6,48},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("pong", new Term[] {})
			),
			Predicate.TRUE,
			new Block(
				"Pong", new int[] {6,47,13,3},
				new Statement[] {
					new ForEach(
						"Pong", new int[] {7,2,13,3},
						new Predicate("subscriber", new Term[] {
							Primitive.newPrimitive("main"),
							new Variable(Type.STRING, "name",false)
						}),
						new Block(
							"Pong", new int[] {7,44,9,3},
							new Statement[] {
								new Send("Pong", new int[] {8,4,8,37},
									new Performative("inform"),
									new Variable(Type.STRING, "name"),
									new Predicate("alive", new Term[] {
										new Variable(Type.STRING, "sender")
									})
								)
							}
						)
					),
					new ModuleCall("console",
						"Pong", new int[] {10,4,10,27},
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
						"Pong", new int[] {11,4,11,20},
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
					new Send("Pong", new int[] {12,4,12,33},
						new Performative("request"),
						new Variable(Type.STRING, "sender"),
						new Predicate("ping", new Term[] {})
					)
				}
			)
		));
		addRule(new Rule(
			"Pong", new int[] {16,9,16,94},
			new MessageEvent(
				new Performative("subscribe"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("monitor", new Term[] {
					new Variable(Type.STRING, "name",false)
				})
			),
			new Predicate("subscriber", new Term[] {
				Primitive.newPrimitive("main"),
				new Variable(Type.STRING, "name")
			}),
			new Block(
				"Pong", new int[] {16,93,18,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Pong", new int[] {17,6,18,5},
						new Predicate("subscriber", new Term[] {
							new Variable(Type.STRING, "sender"),
							new Variable(Type.STRING, "name")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Pong", new int[] {20,9,20,67},
			new MessageEvent(
				new Performative("subscribe"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("monitor", new Term[] {
					new Variable(Type.STRING, "name",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Pong", new int[] {20,66,23,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Pong", new int[] {21,6,23,5},
						new Predicate("subscriber", new Term[] {
							new Variable(Type.STRING, "sender"),
							new Variable(Type.STRING, "name")
						})
					),
					new Send("Pong", new int[] {22,6,22,38},
						new Performative("agree"),
						new Variable(Type.STRING, "name"),
						new Predicate("monitor", new Term[] {
							new Variable(Type.STRING, "name")
						})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
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
