package com.example.hellolibgdx;

import com.badlogic.gdx.Game;

public class MyGame extends Game {
	BgScreen1 bgScreen1;
	BgScreen2 bgScreen2;
	@Override
	public void create() {
		bgScreen1 = new BgScreen1(this);
		bgScreen2 = new BgScreen2(this);
		setScreen(bgScreen1);//使用setScreen的方式来完成界面的跳转
	}
	@Override
	public void render() {
		super.render();
	}
}
