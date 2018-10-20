package location;

public class Location {
    private int row;
    private  int column;
    private double maxValue;

    public Location(){}

    public Location (int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public void locateLargest(double[][]a){
        for (int i=0; i<a.length; i++){
            for (int j=0;j<a.length;j++){
                if (maxValue <= a[i][j]){
                    maxValue = a[i][j];
                    this.row = i;
                    this.column = j;
                }
            }
        }
        System.out.println("Max = " + maxValue + " in row " + (this.row + 1)+ " and column" + (this.column + 1));
    }
}
