package local;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskDashboardWidget extends DashboardWidget {

  private static final long serialVersionUID = -3289729059796990054L;
  private DashboardTaskLazyDataModel dataModel;
  private List<AbstractColumn> filterableColumns;

  public TaskDashboardWidget() {
    dataModel = new DashboardTaskLazyDataModel();
    filterableColumns = new ArrayList<>();

    PriorityColumnModel priorityColumnModel = new PriorityColumnModel();
    priorityColumnModel.initDefaultValue();
    filterableColumns.add(priorityColumnModel);

    NameColumnModel nameColumnModel = new NameColumnModel();
    nameColumnModel.initDefaultValue();
    filterableColumns.add(nameColumnModel);
  }

  public List<AbstractColumn> getFilterableColumns() {
    return filterableColumns;
  }
  
  public List<String> getColumns() {
    return Arrays.asList("priority", "name ");
  }

  public DashboardTaskLazyDataModel getDataModel() {
    return dataModel;
  }

  @Override
  public String getType() {
    return "TASK";
  }
}