package javastatemachine;

import javastatemachine.State;

public class Transitions {
  State baseState;
  State[] edges;
  public Transitions(State base) {
    this.baseState = base;
    this.edges = new State[4];
  }
  public Transitions (String baseState, String[] edges) {
    this.baseState = new State(baseState);
    this.edges = new State[edges.length()];
    for (int i = 0; i < edges.length(); i++) {
      this.edges[i] = new State(edges[i]);
    }
  }
  public Transitions (State base, String[] edges) {
    this.baseState = base;
    this.edges = new State[edges.length()];
    for (int i = 0; i < edges.length(); i++) {
      this.edges[i] = new State(edges[i]);
    }
  }
}
