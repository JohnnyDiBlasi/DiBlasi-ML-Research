class Matrix {
  int rows;
  int cols;
  float[][] data;
  
  Matrix() {
  }
  
  Matrix(int theRows, int theCols) {
    rows = theRows;
    cols = theCols;
    data = new float[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        data[i][j] = 0;
      }
    }
  }
}
