package com.example.nomoreoversleep;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class SettingsFragmentDirections {
  private SettingsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSettingsFragmentToConfirmationFragment() {
    return new ActionOnlyNavDirections(R.id.action_settingsFragment_to_confirmationFragment);
  }
}
