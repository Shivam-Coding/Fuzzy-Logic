package src.mathPlot.plotObject;

import java.awt.*;

import src.mathPlot.render.*;

/**
 * BSD License
 * 
 * @author Yann RICHET
 */
public interface Plotable {
	public void plot(AbstractDrawer draw);

	public void setVisible(boolean v);

	public boolean getVisible();

	public void setColor(Color c);

	public Color getColor();

}