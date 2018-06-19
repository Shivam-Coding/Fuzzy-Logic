/*
 * Created on 5 juil. 07 by richet
 */
package src.mathPlot.plots;

import src.mathPlot.render.*;

public abstract class LayerPlot extends Plot {

	Plot plot;

	public LayerPlot(String name, Plot p) {
		super(name, p.color);
		plot = p;
	}

	public double[] isSelected(int[] screenCoordTest, AbstractDrawer draw) {
		return null;
	}
}
