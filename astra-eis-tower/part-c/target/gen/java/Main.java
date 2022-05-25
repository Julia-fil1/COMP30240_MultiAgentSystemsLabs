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
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.STRING, "X",false)
			}),
			new NOT(
				new ModuleFormula("ei",
					new Predicate("on", new Term[] {
						new Variable(Type.STRING, "Y",false),
						new Variable(Type.STRING, "X")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			)
		));
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.STRING, "X",false)
			}),
			new Comparison("==",
				new Variable(Type.STRING, "X"),
				Primitive.newPrimitive("table")
			)
		));
		addRule(new Rule(
			"Main", new int[] {13,9,13,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {13,27,29,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {14,8,14,52},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("hw"),
							Primitive.newPrimitive("dependency/tower-1.3.0.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {15,8,15,17},
						new Predicate("init", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).init(
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {16,8,16,17},
						new Predicate("join", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).join(
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {17,8,17,26},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("gripper")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {18,8,18,21},
						new Predicate("startEnv", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).startEnv(
								);
							}
						}
					),
					new ModuleCall("C",
						"Main", new int[] {20,8,20,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("waiting for block f")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Wait(
						"Main", new int[] {21,8,29,5},
						new ModuleFormula("ei",
							new Predicate("block", new Term[] {
								Primitive.newPrimitive("f")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new Subgoal(
						"Main", new int[] {25,8,29,5},
						new Goal(
							new Predicate("tower", new Term[] {
								Primitive.newPrimitive("a"),
								Primitive.newPrimitive("b")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {26,8,29,5},
						new Goal(
							new Predicate("tower", new Term[] {
								Primitive.newPrimitive("b"),
								Primitive.newPrimitive("a"),
								Primitive.newPrimitive("d")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {27,8,29,5},
						new Goal(
							new Predicate("tower", new Term[] {
								Primitive.newPrimitive("f"),
								Primitive.newPrimitive("a"),
								Primitive.newPrimitive("d"),
								Primitive.newPrimitive("e")
							})
						)
					),
					new ModuleCall("S",
						"Main", new int[] {28,8,28,16},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).exit(
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {31,9,31,48},
			new GoalEvent('+',
				new Goal(
					new Predicate("tower", new Term[] {
						new Variable(Type.STRING, "X",false),
						new Variable(Type.STRING, "Y",false),
						new Variable(Type.STRING, "Z",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {31,47,35,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {32,8,35,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "Z")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {32,20,35,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "Z"),
								Primitive.newPrimitive("table")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {33,8,35,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "Y")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {33,20,35,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "Y"),
								new Variable(Type.STRING, "Z")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {34,8,35,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "X")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {34,20,35,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "X"),
								new Variable(Type.STRING, "Y")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {37,9,37,58},
			new GoalEvent('+',
				new Goal(
					new Predicate("tower", new Term[] {
						new Variable(Type.STRING, "W",false),
						new Variable(Type.STRING, "X",false),
						new Variable(Type.STRING, "Y",false),
						new Variable(Type.STRING, "Z",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {37,57,42,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {38,12,42,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "Z")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {38,24,42,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "Z"),
								Primitive.newPrimitive("table")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {39,12,42,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "Y")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {39,24,42,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "Y"),
								new Variable(Type.STRING, "Z")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {40,12,42,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "X")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {40,24,42,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "X"),
								new Variable(Type.STRING, "Y")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {41,12,42,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "W")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {41,24,42,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "W"),
								new Variable(Type.STRING, "X")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {44,9,44,38},
			new GoalEvent('+',
				new Goal(
					new Predicate("tower", new Term[] {
						new Variable(Type.STRING, "Y",false),
						new Variable(Type.STRING, "Z",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {44,37,47,9},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {45,12,47,9},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "Z")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {45,24,47,9},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "Z"),
								Primitive.newPrimitive("table")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {46,12,47,9},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "Y")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {46,24,47,9},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "Y"),
								new Variable(Type.STRING, "Z")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {49,9,49,74},
			new GoalEvent('+',
				new Goal(
					new Predicate("holding", new Term[] {
						new Variable(Type.STRING, "target",false)
					})
				)
			),
			new AND(
				new NOT(
					new ModuleFormula("ei",
						new Predicate("holding", new Term[] {
							new Variable(Type.STRING, "Y",false)
						}),
						new ModuleFormulaAdaptor() {
							public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
								return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
							}
						}
					)
				),
				new Predicate("free", new Term[] {
					new Variable(Type.STRING, "target")
				})
			),
			new Block(
				"Main", new int[] {49,73,52,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {50,8,50,25},
						new Predicate("pickup", new Term[] {
							new Variable(Type.STRING, "target")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"Main", new int[] {51,8,52,5},
						new ModuleFormula("ei",
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "target")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {54,9,54,75},
			new GoalEvent('+',
				new Goal(
					new Predicate("holding", new Term[] {
						new Variable(Type.STRING, "target",false)
					})
				)
			),
			new AND(
				new NOT(
					new ModuleFormula("ei",
						new Predicate("holding", new Term[] {
							new Variable(Type.STRING, "Y",false)
						}),
						new ModuleFormulaAdaptor() {
							public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
								return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
							}
						}
					)
				),
				new NOT(
					new Predicate("free", new Term[] {
						new Variable(Type.STRING, "target")
					})
				)
			),
			new Block(
				"Main", new int[] {54,74,58,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {55,8,55,47},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Got to the first free rule")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {56,8,58,5},
						new Goal(
							new Predicate("free", new Term[] {
								new Variable(Type.STRING, "target")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {57,8,58,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "target")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {60,9,60,69},
			new GoalEvent('+',
				new Goal(
					new Predicate("free", new Term[] {
						new Variable(Type.STRING, "target",false)
					})
				)
			),
			new AND(
				new ModuleFormula("ei",
					new Predicate("on", new Term[] {
						new Variable(Type.STRING, "A",false),
						new Variable(Type.STRING, "target")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				),
				new NOT(
					new Predicate("free", new Term[] {
						new Variable(Type.STRING, "A")
					})
				)
			),
			new Block(
				"Main", new int[] {60,68,65,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {62,8,62,48},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Got to the second free rule")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {63,8,65,5},
						new Goal(
							new Predicate("free", new Term[] {
								new Variable(Type.STRING, "A")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {67,9,67,74},
			new GoalEvent('+',
				new Goal(
					new Predicate("free", new Term[] {
						new Variable(Type.STRING, "target",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("free", new Term[] {
						new Variable(Type.STRING, "target")
					})
				),
				new ModuleFormula("ei",
					new Predicate("on", new Term[] {
						new Variable(Type.STRING, "A",false),
						new Variable(Type.STRING, "target")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			),
			new Block(
				"Main", new int[] {67,73,73,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {69,12,69,52},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Got to the second free rule")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {70,12,73,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "A")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {71,12,73,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "A"),
								Primitive.newPrimitive("table")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {79,9,79,79},
			new GoalEvent('+',
				new Goal(
					new Predicate("on", new Term[] {
						new Variable(Type.STRING, "block",false),
						new Variable(Type.STRING, "target",false)
					})
				)
			),
			new AND(
				new ModuleFormula("ei",
					new Predicate("holding", new Term[] {
						new Variable(Type.STRING, "block")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				),
				new Predicate("free", new Term[] {
					new Variable(Type.STRING, "target")
				})
			),
			new Block(
				"Main", new int[] {79,78,82,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {80,8,80,33},
						new Predicate("putdown", new Term[] {
							new Variable(Type.STRING, "block"),
							new Variable(Type.STRING, "target")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"Main", new int[] {81,8,82,5},
						new ModuleFormula("ei",
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "block"),
								new Variable(Type.STRING, "target")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("Main","ei")).sense();
			}
		});

	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
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
