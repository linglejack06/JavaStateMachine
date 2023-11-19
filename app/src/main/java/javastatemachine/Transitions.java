package javastatemachine;

import javastatemachine.State;

public class Transitions {
  State baseState;
  State[] edges;
  public Transitions (String baseState, String[] edges) {
    this.baseState = new State(baseState);
    this.edges = new State[edges.length()];
    for (int i = 0; i < edges.length(); i++) {
      this.edges[i] = new State(edges[i]);
    }

  }
}
