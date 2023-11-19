package javastatemachine;

import javastatemachine.Transitions;

public class State {
  String name;
  Transitions edges;

  public State (String n) {
    name = n;
    edges = Transitions(this);
  }
  public State (String n, String[] edges) {
    name = n;
    this.edges = Transitions(this, edges);
  }
}
