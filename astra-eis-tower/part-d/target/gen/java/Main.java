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
				"Main", new int[] {13,27,28,5},
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
						"Main", new int[] {21,8,28,5},
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
						"Main", new int[] {23,8,28,5},
						new Goal(
							new Predicate("tower", new Term[] {
								new ListTerm(new Term[] {
									Primitive.newPrimitive("b"),
									Primitive.newPrimitive("a")
								})
							})
						)
					),
					new Subgoal(
						"Main", new int[] {24,8,28,5},
						new Goal(
							new Predicate("tower", new Term[] {
								new ListTerm(new Term[] {
									Primitive.newPrimitive("d"),
									Primitive.newPrimitive("a"),
									Primitive.newPrimitive("b")
								})
							})
						)
					),
					new Subgoal(
						"Main", new int[] {25,8,28,5},
						new Goal(
							new Predicate("tower", new Term[] {
								new ListTerm(new Term[] {
									Primitive.newPrimitive("e"),
									Primitive.newPrimitive("d"),
									Primitive.newPrimitive("a"),
									Primitive.newPrimitive("f")
								})
							})
						)
					),
					new Subgoal(
						"Main", new int[] {26,8,28,5},
						new Goal(
							new Predicate("tower", new Term[] {
								new ListTerm(new Term[] {
									Primitive.newPrimitive("a"),
									Primitive.newPrimitive("b"),
									Primitive.newPrimitive("c"),
									Primitive.newPrimitive("d"),
									Primitive.newPrimitive("e"),
									Primitive.newPrimitive("f")
								})
							})
						)
					),
					new ModuleCall("S",
						"Main", new int[] {27,8,27,16},
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
			"Main", new int[] {30,9,30,39},
			new GoalEvent('+',
				new Goal(
					new Predicate("tower", new Term[] {
						new ListSplitter(
							new Variable(Type.STRING, "H",false),
							new Variable(Type.LIST, "T",false)
						)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {30,38,39,9},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {31,12,39,9},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "H")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {31,24,39,9},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "H"),
								Primitive.newPrimitive("table")
							})
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"Main", new int[] {32,12,39,9},
						Primitive.newPrimitive(0)
					),
					new While(
						"Main", new int[] {33,12,39,9},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							new Count(
								new Variable(Type.LIST, "T")
							)
						),
						new Block(
							"Main", new int[] {33,38,38,13},
							new Statement[] {
								new Subgoal(
									"Main", new int[] {34,16,38,13},
									new Goal(
										new Predicate("holding", new Term[] {
											new AtIndex(
												new Variable(Type.LIST, "T"),
												new Variable(Type.INTEGER, "i"),
												Type.STRING
											)
										})
									)
								),
								new If(
									"Main", new int[] {35,16,38,13},
									new Comparison("==",
										new Variable(Type.INTEGER, "i"),
										Primitive.newPrimitive(0)
									),
									new Subgoal(
										"Main", new int[] {35,26,38,13},
										new Goal(
											new Predicate("on", new Term[] {
												new AtIndex(
													new Variable(Type.LIST, "T"),
													new Variable(Type.INTEGER, "i"),
													Type.STRING
												),
												new Variable(Type.STRING, "H")
											})
										)
									)
								),
								new If(
									"Main", new int[] {36,16,38,13},
									new Comparison("~=",
										new Variable(Type.INTEGER, "i"),
										Primitive.newPrimitive(0)
									),
									new Subgoal(
										"Main", new int[] {36,26,38,13},
										new Goal(
											new Predicate("on", new Term[] {
												new AtIndex(
													new Variable(Type.LIST, "T"),
													new Variable(Type.INTEGER, "i"),
													Type.STRING
												),
												new AtIndex(
													new Variable(Type.LIST, "T"),
													Operator.newOperator('-',
														new Variable(Type.INTEGER, "i"),
														Primitive.newPrimitive(1)
													),
													Type.STRING
												)
											})
										)
									)
								),
								new PlusPlus(
									new Variable(Type.INTEGER, "i"),
									"Main", new int[] {37,16,37,19}
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {41,9,41,74},
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
				"Main", new int[] {41,73,44,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {42,8,42,25},
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
						"Main", new int[] {43,8,44,5},
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
			"Main", new int[] {46,9,46,75},
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
				"Main", new int[] {46,74,50,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {47,8,47,58},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("called holding but target is not free")
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
						"Main", new int[] {48,8,50,5},
						new Goal(
							new Predicate("free", new Term[] {
								new Variable(Type.STRING, "target")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {49,8,50,5},
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
			"Main", new int[] {52,9,52,69},
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
				"Main", new int[] {52,68,55,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {53,8,53,55},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("block on top of target is not free")
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
						"Main", new int[] {54,8,55,5},
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
			"Main", new int[] {57,9,57,74},
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
				"Main", new int[] {57,73,61,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {58,12,58,59},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("putting the top block on the table")
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
						"Main", new int[] {59,12,61,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "A")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {60,12,61,5},
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
			"Main", new int[] {63,9,63,79},
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
				"Main", new int[] {63,78,66,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {64,8,64,33},
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
						"Main", new int[] {65,8,66,5},
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
