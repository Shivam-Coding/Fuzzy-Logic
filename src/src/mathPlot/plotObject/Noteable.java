package src.mathPlot.plotObject;

import src.mathPlot.render.*;

/**
 * BSD License
 * 
 * @author Yann RICHET
 */
public interface Noteable {
	public double[] isSelected(int[] screenCoord, AbstractDrawer draw);

	public void note(AbstractDrawer draw);
}