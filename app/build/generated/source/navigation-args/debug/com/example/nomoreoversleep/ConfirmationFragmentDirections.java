package com.example.nomoreoversleep;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ConfirmationFragmentDirections {
  private ConfirmationFragmentDirections() {
  }

  @NonNull
  public static ActionConfirmationFragmentToAlarmFragment actionConfirmationFragmentToAlarmFragment(
      int requiredTime, @NonNull String departureTime) {
    return new ActionConfirmationFragmentToAlarmFragment(requiredTime, departureTime);
  }

  @NonNull
  public static NavDirections actionConfirmationFragmentToSettingsFragment() {
    return new ActionOnlyNavDirections(R.id.action_confirmationFragment_to_settingsFragment);
  }

  public static class ActionConfirmationFragmentToAlarmFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionConfirmationFragmentToAlarmFragment(int requiredTime,
        @NonNull String departureTime) {
      this.arguments.put("requiredTime", requiredTime);
      if (departureTime == null) {
        throw new IllegalArgumentException("Argument \"departureTime\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("departureTime", departureTime);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionConfirmationFragmentToAlarmFragment setRequiredTime(int requiredTime) {
      this.arguments.put("requiredTime", requiredTime);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionConfirmationFragmentToAlarmFragment setDepartureTime(
        @NonNull String departureTime) {
      if (departureTime == null) {
        throw new IllegalArgumentException("Argument \"departureTime\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("departureTime", departureTime);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("requiredTime")) {
        int requiredTime = (int) arguments.get("requiredTime");
        __result.putInt("requiredTime", requiredTime);
      }
      if (arguments.containsKey("departureTime")) {
        String departureTime = (String) arguments.get("departureTime");
        __result.putString("departureTime", departureTime);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_confirmationFragment_to_alarmFragment;
    }

    @SuppressWarnings("unchecked")
    public int getRequiredTime() {
      return (int) arguments.get("requiredTime");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getDepartureTime() {
      return (String) arguments.get("departureTime");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionConfirmationFragmentToAlarmFragment that = (ActionConfirmationFragmentToAlarmFragment) object;
      if (arguments.containsKey("requiredTime") != that.arguments.containsKey("requiredTime")) {
        return false;
      }
      if (getRequiredTime() != that.getRequiredTime()) {
        return false;
      }
      if (arguments.containsKey("departureTime") != that.arguments.containsKey("departureTime")) {
        return false;
      }
      if (getDepartureTime() != null ? !getDepartureTime().equals(that.getDepartureTime()) : that.getDepartureTime() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getRequiredTime();
      result = 31 * result + (getDepartureTime() != null ? getDepartureTime().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionConfirmationFragmentToAlarmFragment(actionId=" + getActionId() + "){"
          + "requiredTime=" + getRequiredTime()
          + ", departureTime=" + getDepartureTime()
          + "}";
    }
  }
}
