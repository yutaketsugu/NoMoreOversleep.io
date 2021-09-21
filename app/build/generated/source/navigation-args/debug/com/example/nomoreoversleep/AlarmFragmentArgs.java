package com.example.nomoreoversleep;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AlarmFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private AlarmFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private AlarmFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static AlarmFragmentArgs fromBundle(@NonNull Bundle bundle) {
    AlarmFragmentArgs __result = new AlarmFragmentArgs();
    bundle.setClassLoader(AlarmFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("requiredTime")) {
      int requiredTime;
      requiredTime = bundle.getInt("requiredTime");
      __result.arguments.put("requiredTime", requiredTime);
    } else {
      throw new IllegalArgumentException("Required argument \"requiredTime\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("departureTime")) {
      String departureTime;
      departureTime = bundle.getString("departureTime");
      if (departureTime == null) {
        throw new IllegalArgumentException("Argument \"departureTime\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("departureTime", departureTime);
    } else {
      throw new IllegalArgumentException("Required argument \"departureTime\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    AlarmFragmentArgs that = (AlarmFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getRequiredTime();
    result = 31 * result + (getDepartureTime() != null ? getDepartureTime().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "AlarmFragmentArgs{"
        + "requiredTime=" + getRequiredTime()
        + ", departureTime=" + getDepartureTime()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(AlarmFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int requiredTime, @NonNull String departureTime) {
      this.arguments.put("requiredTime", requiredTime);
      if (departureTime == null) {
        throw new IllegalArgumentException("Argument \"departureTime\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("departureTime", departureTime);
    }

    @NonNull
    public AlarmFragmentArgs build() {
      AlarmFragmentArgs result = new AlarmFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setRequiredTime(int requiredTime) {
      this.arguments.put("requiredTime", requiredTime);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setDepartureTime(@NonNull String departureTime) {
      if (departureTime == null) {
        throw new IllegalArgumentException("Argument \"departureTime\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("departureTime", departureTime);
      return this;
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
  }
}
