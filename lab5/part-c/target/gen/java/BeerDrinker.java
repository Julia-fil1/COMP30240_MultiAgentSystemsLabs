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


public class BeerDrinker extends ASTRAClass {
	public BeerDrinker() {
		setParents(new Class[] {BeerOntology.class});
		addRule(new Rule(
			"BeerDrinker", new int[] {5,9,5,48},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "server",false),
							new Variable(Type.STRING, "drink",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"BeerDrinker", new int[] {5,47,7,5},
				new Statement[] {
					new Send("BeerDrinker", new int[] {6,8,6,41},
						new Performative("request"),
						new Variable(Type.STRING, "server"),
						new Predicate("get", new Term[] {
							new Variable(Type.STRING, "drink")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"BeerDrinker", new int[] {8,9,8,60},
			new MessageEvent(
				new Performative("agree"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("get", new Term[] {
					new Variable(Type.STRING, "drink",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"BeerDrinker", new int[] {8,59,12,5},
				new Statement[] {
					new Wait(
						"BeerDrinker", new int[] {9,8,12,5},
						new OR(
							new Predicate("got", new Term[] {
								new Variable(Type.STRING, "drink")
							}),
							new Predicate("failed_to_get", new Term[] {
								new Variable(Type.STRING, "drink")
							})
						)
					),
					new If(
						"BeerDrinker", new int[] {10,8,12,5},
						new Predicate("got", new Term[] {
							new Variable(Type.STRING, "drink")
						}),
						new ModuleCall("C",
							"BeerDrinker", new int[] {10,24,10,67},
							new Predicate("println", new Term[] {
								Operator.newOperator('+',
									new Variable(Type.STRING, "drink"),
									Primitive.newPrimitive(" is yummy in my tummy!")
								)
							}),
							new DefaultModuleCallAdaptor() {
								public boolean inline() {
									return true;
								}

								public boolean invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Console) intention.getModule("BeerDrinker","C")).println(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"BeerDrinker", new int[] {13,9,13,61},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("got", new Term[] {
					new Variable(Type.STRING, "drink",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"BeerDrinker", new int[] {13,60,15,5},
				new Statement[] {
					new BeliefUpdate('+',
						"BeerDrinker", new int[] {14,8,15,5},
						new Predicate("got", new Term[] {
							new Variable(Type.STRING, "drink")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"BeerDrinker", new int[] {16,9,16,62},
			new MessageEvent(
				new Performative("failure"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("get", new Term[] {
					new Variable(Type.STRING, "drink",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"BeerDrinker", new int[] {16,61,19,5},
				new Statement[] {
					new BeliefUpdate('+',
						"BeerDrinker", new int[] {17,8,19,5},
						new Predicate("failed_to_get", new Term[] {
							new Variable(Type.STRING, "drink")
						})
					),
					new ModuleCall("C",
						"BeerDrinker", new int[] {18,8,18,43},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Failed to get "),
								new Variable(Type.STRING, "drink")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("BeerDrinker","C")).println(
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
			astra.core.Agent agent = new BeerDrinker().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
