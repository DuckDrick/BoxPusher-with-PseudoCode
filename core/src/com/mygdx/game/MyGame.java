package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.input.Input;

public class MyGame extends Game {
	SpriteBatch batch;

	public static final float PPM = 100f;
	public static float correct = 0;
	public static Input input;
	@Override
	public void create () {
		batch = new SpriteBatch();
		input = new Input(batch);
		setScreen(new PlayScreen(this));

	}
	public void reset(){
		setScreen(new PlayScreen(this));
	}
	@Override
	public void render () {
		super.render();
	}
	

}
