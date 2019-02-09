package apuri;

import java.io.IOException;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class name {
	static String namelist;

	public static void player() throws IOException {
		game gg = new game();
		game.botan(Color.RED, "名前を入力して下さい", gg.jpg);
		BufferedReader namelist = new BufferedReader(new InputStreamReader(System.in));

	}

}
