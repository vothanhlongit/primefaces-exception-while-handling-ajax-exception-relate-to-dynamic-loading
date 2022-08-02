package local;

import java.io.Serializable;

public abstract class DashboardWidget implements Serializable {

  private static final long serialVersionUID = -6219586795046362443L;
  protected String id;

  public DashboardWidget() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public abstract String getType();

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    DashboardWidget other = (DashboardWidget) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
}
