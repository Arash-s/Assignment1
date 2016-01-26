package Astar;

public class Test {

	public static void main(String[] args){
		Map map = new Map(20,20,5,3,16,19);
		map.map[4][4] = true;
		map.map[6][3] = true;
		map.map[5][4] = true;
		map.map[6][4] = true;
		map.getShortestPath();
		map.print();
	}
}
