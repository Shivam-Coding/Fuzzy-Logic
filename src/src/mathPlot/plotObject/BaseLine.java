/*
 * Created on 1 juin 2005 by richet
 */
package src.mathPlot.plotObject;

import java.awt.*;

import src.mathPlot.render.*;

public class BaseLine extends Line {

	public BaseLine(Color col, double[] c1, double[] c2) {
		super(col, c1, c2);
	}

	public void plot(AbstractDrawer draw) {
		if (!visible)
			return;

		draw.setColor(color);
		draw.drawLineBase(extrem[0], extrem[1]);
	}

}
