package com.example.hellolibgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class BgScreen2 implements Screen {
	MyGame game;
	Stage stage;
	TextureAtlas atlas;
	Image bgImage;
	public BgScreen2(MyGame game) {
		this.game = game;
		stage = new Stage(480,800,false);
		atlas = new TextureAtlas(Gdx.files.internal("data/changescreen.atlas"));
		bgImage = new Image(atlas.findRegion("bg2"));
		bgImage.setSize(480, 800);
		stage.addActor(bgImage);
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}
	@Override
	public void render(float arg0) {
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏
		stage.act();
		stage.draw();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}
	@Override
	public void show() {
		Gdx.input.setInputProcessor(stage);
	}
}
