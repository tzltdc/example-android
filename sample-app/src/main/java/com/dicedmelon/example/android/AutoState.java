package com.dicedmelon.example.android;

import com.google.auto.value.AutoOneOf;

@AutoOneOf(State.class) public abstract class AutoState {

  public abstract State state();

  public abstract void idle();

  public abstract void loading();

  public abstract void error();

  public static AutoState ofError() {
    return AutoOneOf_AutoState.error();
  }

  public static AutoState ignored() {
    return AutoOneOf_AutoState.idle();
  }
}
