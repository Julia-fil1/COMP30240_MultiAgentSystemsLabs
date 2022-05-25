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
				"Main", new int[] {13,27,26,5},
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
							Primitive.newPrimitive("waiting for block d")
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
						"Main", new int[] {21,8,26,5},
						new ModuleFormula("ei",
							new Predicate("block", new Term[] {
								Primitive.newPrimitive("d")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new Subgoal(
						"Main", new int[] {23,8,26,5},
						new Goal(
							new Predicate("tower", new Term[] {
								Primitive.newPrimitive("b"),
								Primitive.newPrimitive("a"),
								Primitive.newPrimitive("d")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {24,8,26,5},
						new Goal(
							new Predicate("tower", new Term[] {
								Primitive.newPrimitive("a"),
								Primitive.newPrimitive("d"),
								Primitive.newPrimitive("b")
							})
						)
					),
					new ModuleCall("S",
						"Main", new int[] {25,8,25,16},
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
			"Main", new int[] {28,9,28,48},
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
				"Main", new int[] {28,47,32,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {29,8,32,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "Z")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {29,20,32,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "Z"),
								Primitive.newPrimitive("table")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {30,8,32,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "Y")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {30,20,32,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "Y"),
								new Variable(Type.STRING, "Z")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {31,8,32,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "X")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {31,20,32,5},
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
			"Main", new int[] {34,9,34,74},
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
				"Main", new int[] {34,73,37,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {35,8,35,25},
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
						"Main", new int[] {36,8,37,5},
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
			"Main", new int[] {39,9,39,75},
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
				"Main", new int[] {39,74,42,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {40,8,40,47},
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
						"Main", new int[] {41,8,42,5},
						new Goal(
							new Predicate("free", new Term[] {
								new Variable(Type.STRING, "target")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {44,9,44,74},
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
				"Main", new int[] {44,73,51,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {46,8,46,48},
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
					new If(
						"Main", new int[] {47,8,51,5},
						new NOT(
							new Predicate("free", new Term[] {
								new Variable(Type.STRING, "A")
							})
						),
						new Subgoal(
							"Main", new int[] {47,22,51,5},
							new Goal(
								new Predicate("free", new Term[] {
									new Variable(Type.STRING, "A")
								})
							)
						)
					),
					new Subgoal(
						"Main", new int[] {48,8,51,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "A")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {49,8,51,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "A"),
								Primitive.newPrimitive("table")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {50,8,51,5},
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
			"Main", new int[] {53,9,53,79},
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
				"Main", new int[] {53,78,56,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {54,8,54,33},
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
						"Main", new int[] {55,8,56,5},
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
