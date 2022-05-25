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
			"Main", new int[] {16,9,16,28},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "s",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {16,27,20,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {17,8,17,97},
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
						"Main", new int[] {18,8,20,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "s")
							})
						)
					),
					new ModuleCall("console",
						"Main", new int[] {19,8,19,63},
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
			"Main", new int[] {22,9,22,65},
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
				"Main", new int[] {22,64,28,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {23,8,23,48},
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
						"Main", new int[] {24,8,28,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "r")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {25,8,25,59},
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
						"Main", new int[] {26,8,28,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "s")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {27,8,27,41},
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
			"Main", new int[] {30,9,30,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "s",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {30,27,32,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {31,8,31,95},
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
			"Main", new int[] {34,9,34,48},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch", new Term[] {
						new Variable(Type.STRING, "s",false)
					})
				)
			),
			new Predicate("switch", new Term[] {
				new Variable(Type.STRING, "r",false)
			}),
			new Block(
				"Main", new int[] {34,47,38,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {35,8,35,88},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("the goal of the switch is not what we want, need to change it")
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
						"Main", new int[] {36,8,38,5},
						new Predicate("switch", new Term[] {
							new Variable(Type.STRING, "r")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {37,8,38,5},
						new Predicate("switch", new Term[] {
							new Variable(Type.STRING, "s")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {40,9,40,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch", new Term[] {
						new Variable(Type.STRING, "s",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {40,28,42,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {41,8,41,74},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("switch state: in case the state is s do nothing")
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
			"Main", new int[] {44,9,44,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {44,26,49,6},
				new Statement[] {
					new BeliefUpdate('-',
						"Main", new int[] {45,8,49,6},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {46,8,46,74},
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
						"Main", new int[] {47,8,49,6},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {48,8,48,68},
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
				Primitive.newPrimitive("off")
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
