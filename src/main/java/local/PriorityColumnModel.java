package local;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.primefaces.model.CheckboxTreeNode;

public class PriorityColumnModel extends AbstractColumn implements Serializable {

  private static final long serialVersionUID = 3594524453493971754L;
  public static final List<String> PRIORITIES = Arrays.asList("Low", "Normal", "High");
  private CheckboxTreeNode<CategoryNode>[] userSelectionCategoryNodes;
  private CheckboxTreeNode<CategoryNode> userCategoryTree;


  @Override
  public void initDefaultValue() {
    this.header = "Priority";
    this.field = "priority";
  }

  public List<String> getPriorities() {
    return PRIORITIES;
  }

  public void loadCategories() {
    CategoryNode nodeData = new CategoryNode();
    nodeData.setValue("");
    nodeData.setCategory("");
    userCategoryTree = new CheckboxTreeNode<>("", nodeData, null);
    userCategoryTree.setExpanded(true);
    userCategoryTree.setSelected(true);

    for (String priority : PRIORITIES) {
      CategoryNode nodeData2 = new CategoryNode();
      nodeData2.setValue(priority);
      nodeData2.setCategory(priority);
      CheckboxTreeNode<CategoryNode> checkboxTreeNode2 = new CheckboxTreeNode<>(nodeData2, userCategoryTree);
      checkboxTreeNode2.setExpanded(true);
      checkboxTreeNode2.setSelected(true);
    }
  }

  public CheckboxTreeNode<CategoryNode> getUserCategoryTree() {
    return userCategoryTree;
  }

  public CheckboxTreeNode<CategoryNode>[] getUserSelectionCategoryNodes() {
    return userSelectionCategoryNodes;
  }

  public void setUserSelectionCategoryNodes(CheckboxTreeNode<CategoryNode>[] userSelectionCategoryNodes) {
    this.userSelectionCategoryNodes = userSelectionCategoryNodes;
  }
}
