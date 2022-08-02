package local;

import java.io.Serializable;

public abstract class AbstractColumn implements Serializable {

  private static final long serialVersionUID = 4777281311321133509L;
  protected String header;
  protected String field;

  public void initDefaultValue() {}

  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }
}
