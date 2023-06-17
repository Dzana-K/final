// Generated by view binder compiler. Do not edit!
package org.pytorch.demo.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import lecho.lib.hellocharts.view.LineChartView;
import org.pytorch.demo.objectdetection.R;

public final class ActivityDataBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button backButton;

  @NonNull
  public final LineChartView chart;

  private ActivityDataBinding(@NonNull RelativeLayout rootView, @NonNull Button backButton,
      @NonNull LineChartView chart) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.chart = chart;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_data, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      Button backButton = rootView.findViewById(id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.chart;
      LineChartView chart = rootView.findViewById(id);
      if (chart == null) {
        break missingId;
      }

      return new ActivityDataBinding((RelativeLayout) rootView, backButton, chart);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}