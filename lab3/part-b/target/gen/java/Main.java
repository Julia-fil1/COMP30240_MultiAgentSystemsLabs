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


public class Main extends ASTRAClass {
	public Main() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Main", new int[] {15,10,15,29},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "s",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {15,28,19,6},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {16,9,16,98},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("switch called before the light is called "),
								Operator.newOperator('+',
									Primitive.newPrimitive("state of the switch "),
									new Variable(Type.STRING, "s")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {17,9,19,6},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "s")
							})
						)
					),
					new ModuleCall("console",
						"Main", new int[] {18,9,18,64},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("switch "),
								Operator.newOperator('+',
									Primitive.newPrimitive("state of the switch "),
									new Variable(Type.STRING, "s")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {21,10,21,66},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "s",false)
					})
				)
			),
			new AND(
				new Predicate("transition", new Term[] {
					new Variable(Type.STRING, "r",false),
					new Variable(Type.STRING, "s")
				}),
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "r")
				})
			),
			new Block(
				"Main", new int[] {21,65,27,6},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {22,9,22,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light before is: "),
								new Variable(Type.STRING, "r")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Main", new int[] {23,9,27,6},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "r")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {24,9,24,60},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Deleted the light "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "r"),
									Primitive.newPrimitive("state")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"Main", new int[] {25,9,27,6},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "s")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {26,9,26,42},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light is: "),
								new Variable(Type.STRING, "s")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {29,10,29,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "s",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {29,28,31,6},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {30,5,30,92},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("light state: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "s"),
									Primitive.newPrimitive(" the state is already what we want, do nothing")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {33,10,33,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {33,27,37,6},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {34,9,34,75},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("main: switch state is going to be changed to on")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"Main", new int[] {35,9,37,6},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {36,9,36,69},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("main: switch state was just changed to on")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
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
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("off"),
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("on"),
				Primitive.newPrimitive("off")
			})
		);
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
			astra.core.Agent agent = new Main().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
