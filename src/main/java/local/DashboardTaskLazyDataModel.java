package local;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;

public class DashboardTaskLazyDataModel extends LazyDataModel<Task> {

  private static final long serialVersionUID = 4963375344485295897L;
  private boolean isFirstTime = true;
  private List<Task> dataSource;
  private List<Task> tasks = new ArrayList<>();

  public DashboardTaskLazyDataModel() {
    dataSource = new ArrayList<>();
  }

  public void loadFirstTime() {
    for (int i = 0; i < 3; i++) {
      String taskNumber = String.valueOf(i + 1000);
      dataSource.add(new Task(taskNumber, "Task number " + taskNumber, PriorityColumnModel.PRIORITIES.get(i % 3)));
    }
    tasks = dataSource.stream().skip(0).limit(getPageSize()).collect(Collectors.toList());
    isFirstTime = true;
  }

  @Override
  public List<Task> load(int first, int pageSize, Map<String, SortMeta> sortBy, Map<String, FilterMeta> filterBy) {
    if (isFirstTime) {
      isFirstTime = false;
    } else {
      tasks = dataSource.stream().skip(first).limit(pageSize).collect(Collectors.toList());
    }
    List<Task> result = new ArrayList<>();
    result.addAll(tasks);
    return result;
  }

  @Override
  public Task getRowData(String rowKey) {
    for (Task task : dataSource) {
      if (task.getId().equals(rowKey)) {
        return task;
      }
    }
    return null;
  }

  @Override
  public String getRowKey(Task task) {
    return task.getId();
  }

  @Override
  public int count(Map<String, FilterMeta> filterBy) {
    return (int) dataSource.stream().count();
  }
}
