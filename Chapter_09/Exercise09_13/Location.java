
public class Location{
	private int row, column;
	private double maxValue;

	public Location(double[][]a){
		maxValue = a[row][column];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(maxValue < a[i][j]){
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
	}
	public int getRow(){
		return row;
	}
	public int getColumn(){
		return column;
	}
	public double getMaxValue(){
		return maxValue;
	}
}