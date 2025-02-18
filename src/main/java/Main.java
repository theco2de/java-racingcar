/*
 * @(#)Main.java     0.4 2019.12.14
 *
 * Copyright (c) 2019 lxxjn0.
 */

import com.lxxjn0.GameManager;

/**
 * 게임 시작을 위한 Main 클래스.
 *
 * @author JUNYOUNG LEE (lxxjn0)
 * @version 0.4 2019.12.14
 */
public class Main {
	/**
	 * GameManager 클래스의 객체를 생성하여 게임을 시작하는 Main 메소드.
	 *
	 * @param args 입력되는 매개변수 존재하지 않음.
	 */
	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		gameManager.run();
	}
}
