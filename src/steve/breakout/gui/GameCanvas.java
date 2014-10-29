package steve.breakout.gui;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

import steve.breakout.specs.*;
import steve.breakout.game.*;

public class GameCanvas extends JComponent{
	private Game g;
	public GameCanvas(Game g){
		this.g = g;
	}
	@Override
	public void paintComponent(Graphics grfx){
		grfx.setColor(Color.WHITE);
		Paddle p = g.getPaddle();
		Ball b = g.getBall();
		
		p.paint(grfx);
		b.paint(grfx);
		for( Brick br : g.getCued() ){
			g.getBricks().remove(br);
		}
		for( Brick br : g.getBricks() ){
			br.paint(grfx);
		}
	}
}
