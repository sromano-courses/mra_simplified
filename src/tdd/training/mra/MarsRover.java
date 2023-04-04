package tdd.training.mra;

import java.util.List;

public class MarsRover {

	public static final String N = "N";
	public static final String S = "S";
	public static final String E = "E";
	public static final String W = "W";
	
	private boolean[][] grid; // If a cell is true, then there is an obstacle in that cell
	private int posX; // The x coord of the rover
	private int posY; // The y coord of the rover
	private String facing; // The facing of the rover
	private int planetX; // The size of the planet w.r.t. the x axis 
	private int planetY; // The size of the planet w.r.t. the y axis
	
	/**
	 * It initializes the rover at the coordinates (0,0), facing North, on a planet
	 * (represented as a grid with x and y coordinates) containing obstacles.
	 * 
	 * @param planetX         The x dimension of the planet.
	 * @param planetY         The y dimension of the planet.
	 * @param planetObstacles The obstacles on the planet. Each obstacle is a string
	 *                        (without white spaces) formatted as follows:
	 *                        "(oi_x,oi_y)". <code>null</code> if the planet does
	 *                        not contain obstacles.
	 * 
	 * @throws MarsRoverException
	 */
	public MarsRover(int planetX, int planetY, List<String> planetObstacles) throws MarsRoverException {
		this.grid = new boolean[planetX][planetY];
		this.planetX = planetX;
		this.planetY = planetY;
		this.posX = 0;
		this.posY = 0;
		this.facing = N;
		if (planetObstacles != null) {
			setObstacles(planetObstacles);
		}
	}
	
	private void setObstacles(List<String> obstacles) {
		for (String obstacle : obstacles) {
			String firstPart = obstacle.substring(1, obstacle.indexOf(","));
			String secondPart = obstacle.substring(obstacle.indexOf(",") + 1, obstacle.lastIndexOf(")"));
			int x = Integer.parseInt(firstPart);
			int y = Integer.parseInt(secondPart);
			grid[x][y] = true;
		}
	}

	/**
	 * It returns whether, or not, the planet (where the rover moves) contains an
	 * obstacle in a cell.
	 * 
	 * @param x The x coordinate of the cell
	 * @param y The y coordinate of the cell
	 * @return <true> if the cell contains an obstacle, <false> otherwise.
	 * @throws MarsRoverException
	 */
	public boolean planetContainsObstacleAt(int x, int y) throws MarsRoverException {
		// To be implemented
		return false;
	}

	/**
	 * It lets the rover move on the planet according to a command string. The
	 * return string contains the new position of the rover, its direction, and the
	 * obstacles it has encountered while moving on the planet (if any).
	 * 
	 * @param commandString A string that can contain a single command -- i.e. "f"
	 *                      (forward), "b" (backward), "l" (left), or "r" (right) --
	 *                      or a combination of single commands.
	 * @return The return string that contains the position and direction of the
	 *         rover, and the obstacles the rover has encountered while moving on
	 *         the planet (if any). The return string (without white spaces) has the
	 *         following format: "(x,y,dir)(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)". x
	 *         and y define the new position of the rover while dir represents its
	 *         direction (i.e., N, S, W, or E). Finally, oi_x and oi_y are the
	 *         coordinates of the i-th encountered obstacle.
	 * @throws MarsRoverException
	 */
	public String executeCommand(String commandString) throws MarsRoverException {
		// To be implemented
		return null;
	}

}
