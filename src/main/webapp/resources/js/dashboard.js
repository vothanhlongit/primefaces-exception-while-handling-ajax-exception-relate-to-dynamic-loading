var grids;
loadGrid();

function loadGrid() {
  grids = GridStack.initAll({
    column: 12,
    cellHeight: 100
  });
}