package javastatemachine;

public class State {
  String name;
  Transitions edges;

  public State (String n) {
    name = n;
    edges = new Transitions(this);
  }
//  public State (String n, String[] edges) {
//    name = n;
//    this.edges = new Transitions(this, edges);
//  }
}
