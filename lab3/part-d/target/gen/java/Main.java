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
			"Main", new int[] {18,9,18,28},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "s",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {18,27,22,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {19,8,19,97},
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
						"Main", new int[] {20,8,22,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "s")
							})
						)
					),
					new ModuleCall("console",
						"Main", new int[] {21,8,21,64},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("switch: "),
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
			"Main", new int[] {24,9,24,65},
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
				"Main", new int[] {24,64,30,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {25,8,25,48},
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
						"Main", new int[] {26,8,30,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "r")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {27,8,27,59},
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
						"Main", new int[] {28,8,30,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "s")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {29,8,29,41},
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
			"Main", new int[] {32,9,32,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "s",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {32,27,34,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {33,8,33,95},
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
			"Main", new int[] {36,9,36,48},
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
				"Main", new int[] {36,47,40,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {37,8,37,88},
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
						"Main", new int[] {38,8,40,5},
						new Predicate("switch", new Term[] {
							new Variable(Type.STRING, "r")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {39,8,40,5},
						new Predicate("switch", new Term[] {
							new Variable(Type.STRING, "s")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {42,9,42,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch", new Term[] {
						new Variable(Type.STRING, "s",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {42,28,44,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {43,8,43,74},
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
			"Main", new int[] {46,9,46,20},
			new GoalEvent('+',
				new Goal(
					new Predicate("flash", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {46,19,55,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {47,8,55,5},
						new Goal(
							new Predicate("switch", new Term[] {
								Primitive.newPrimitive("on")
							})
						)
					),
					new ModuleCall("console",
						"Main", new int[] {48,8,48,79},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("flash: confirming the light should be on and it is: ")
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
					new ModuleCall("console",
						"Main", new int[] {49,8,49,81},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("flash: starting flash, light is on, can start flashing")
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
					new ModuleCall("system",
						"Main", new int[] {50,8,50,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(2000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("console",
						"Main", new int[] {51,8,51,78},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("flash: waited 2 seconds now will turn the light off")
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
						"Main", new int[] {52,8,55,5},
						new Goal(
							new Predicate("switch", new Term[] {
								Primitive.newPrimitive("off")
							})
						)
					),
					new ModuleCall("system",
						"Main", new int[] {53,8,53,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(2000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("console",
						"Main", new int[] {54,8,54,70},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("flash: waited 2 seconds after light was off")
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
			"Main", new int[] {57,9,57,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {57,26,60,6},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {58,8,58,119},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("main: calling the flash function, the update of switches and lights should also be triggered")
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
						"Main", new int[] {59,8,60,6},
						new Goal(
							new Predicate("flash", new Term[] {})
						)
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
		fragment.addModule("system",astra.lang.System.class,agent);
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
