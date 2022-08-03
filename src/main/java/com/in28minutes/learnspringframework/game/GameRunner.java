package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsole game;
	
//	public GameRunner(GamingConsole game){
//		System.out.println("Using constructor");
//		this.game=game;
//		
//		
//	}
	 
	
//	public void setGame(GamingConsole game) {
//		System.out.println("Using setter");
//		this.game=game;
//	}
	
	
	public void runGame() {
		
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
