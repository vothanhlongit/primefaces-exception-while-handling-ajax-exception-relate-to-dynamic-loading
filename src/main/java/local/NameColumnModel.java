package local;

import java.io.Serializable;

public class NameColumnModel extends AbstractColumn implements Serializable {

  private static final long serialVersionUID = -4315469062114036720L;

  @Override
  public void initDefaultValue() {
    this.header = "Name";
    this.field = "name";
  }
}
