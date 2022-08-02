package local;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class DashboardBean implements Serializable {

  private static final long serialVersionUID = -8080383448475916540L;
  protected Dashboard selectedDashboard;

  @PostConstruct
  public void init() {
    selectedDashboard = new Dashboard();
    DashboardWidget widget = new TaskDashboardWidget();
    widget.setId("task1");
    selectedDashboard.getWidgets().add(widget);
  }

  public Dashboard getSelectedDashboard() {
    return selectedDashboard;
  }
}
