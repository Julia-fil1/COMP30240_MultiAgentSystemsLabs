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


public class Ping extends ASTRAClass {
	public Ping() {
		setParents(new Class[] {PingPong.class});
		addRule(new Rule(
			"Ping", new int[] {7,7,7,61},
			new MessageEvent(
				new Performative("agree"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("monitor", new Term[] {
					new Variable(Type.STRING, "name",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Ping", new int[] {7,60,10,3},
				new Statement[] {
					new BeliefUpdate('+',
						"Ping", new int[] {8,4,10,3},
						new Predicate("subscribed", new Term[] {
							new Variable(Type.STRING, "sender"),
							new Variable(Type.STRING, "name")
						})
					),
					new Send("Ping", new int[] {9,4,9,40},
						new Performative("request"),
						new ModuleTerm("system", Type.STRING,
							new Predicate("name", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("Ping","system")).name(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("Ping","system")).name(
									);
								}
							}
						),
						new Predicate("ping", new Term[] {})
					)
				}
			)
		));
		addRule(new Rule(
			"Ping", new int[] {13,7,13,49},
			new MessageEvent(
				new Performative("request"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("ping", new Term[] {})
			),
			Predicate.TRUE,
			new Block(
				"Ping", new int[] {13,48,18,3},
				new Statement[] {
					new ModuleCall("console",
						"Ping", new int[] {14,4,14,27},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("ping")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Ping","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"Ping", new int[] {15,4,15,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(500)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Ping","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Send("Ping", new int[] {16,4,16,32},
						new Performative("inform"),
						Primitive.newPrimitive("pong"),
						new Predicate("pong", new Term[] {})
					)
				}
			)
		));
		addRule(new Rule(
			"Ping", new int[] {20,7,20,60},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("alive", new Term[] {
					new Variable(Type.STRING, "name",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Ping", new int[] {20,59,22,5},
				new Statement[] {
					new ModuleCall("console",
						"Ping", new int[] {21,6,21,57},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("The agent: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "name"),
									Primitive.newPrimitive(" is alive")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Ping","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
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
			astra.core.Agent agent = new Ping().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
