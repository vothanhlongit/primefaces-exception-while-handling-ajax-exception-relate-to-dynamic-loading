package local;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dashboard implements Serializable {

  private static final long serialVersionUID = 602512218478843076L;
  private List<DashboardWidget> widgets = new ArrayList<>();

  public Dashboard() {}

  public List<DashboardWidget> getWidgets() {
    return widgets;
  }

  public void setWidgets(List<DashboardWidget> widgets) {
    this.widgets = widgets;
  }
}
