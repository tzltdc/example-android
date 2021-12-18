package com.dicedmelon.example.android;

import com.google.common.truth.Truth;
import org.junit.Ignore;
import org.junit.Test;
public class AutoStateTest {

  @Test public void state() {

    Truth.assertThat(AutoState.ofError().state()).isEqualTo(State.ERROR);
  }
}