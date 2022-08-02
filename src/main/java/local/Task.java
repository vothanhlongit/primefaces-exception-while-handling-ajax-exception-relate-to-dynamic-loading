package local;

import java.io.Serializable;
import java.util.Objects;

public class Task implements Serializable {

  private static final long serialVersionUID = 3689362962037367801L;
  private String id;
  private String name;
  private String priority;

  public Task() {}

  public Task(String id, String name, String priority) {
    super();
    this.id = id;
    this.name = name;
    this.priority = priority;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Task other = (Task) obj;
    return Objects.equals(id, other.id);
  }
}
