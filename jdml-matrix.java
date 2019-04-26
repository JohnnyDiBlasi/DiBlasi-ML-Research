class Matrix {
  int rows;
  int cols;
  float[][] data;
  
  Matrix(int theRows, int theCols) {
  	rows = theRows;
	  cols = theCols;
    data = new float[rows][cols];
  }
}
