package com.example.nomoreoversleep;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class AlarmFragmentDirections {
  private AlarmFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAlarmFragmentToSettingsFragment() {
    return new ActionOnlyNavDirections(R.id.action_alarmFragment_to_settingsFragment);
  }
}
