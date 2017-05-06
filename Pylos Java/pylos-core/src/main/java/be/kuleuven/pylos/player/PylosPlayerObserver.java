package be.kuleuven.pylos.player;

import be.kuleuven.pylos.game.PylosLocation;
import be.kuleuven.pylos.game.PylosSphere;

import java.io.*;

/**
 * Created by Jan on 5/03/2015.
 */
public interface PylosPlayerObserver {

	PylosPlayerObserver NONE = new PylosPlayerObserver() {
		@Override
		public void shout(String str) {

		}

		@Override
		public void shoutGood(String str) {

		}

		@Override
		public void shoutBad(String str) {

		}

		@Override
		public void checkingMoveSphere(PylosSphere pylosSphere, PylosLocation toLocation) {

		}

		@Override
		public void checkingRemoveSphere(PylosSphere pylosSphere) {

		}

		@Override
		public void checkingPass() {

		}
	};

	PylosPlayerObserver CONSOLE_PLAYER_OBSERVER = new PylosPlayerObserver() {
		PrintWriter out;

		{
			try {
				out = new PrintWriter("filename.txt", "UTF-8");
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void shout(String str) {
			out.println(str);
		}

		@Override
		public void shoutGood(String str) {

		}

		@Override
		public void shoutBad(String str) {

		}

		@Override
		public void checkingMoveSphere(PylosSphere pylosSphere, PylosLocation toLocation) {

		}

		@Override
		public void checkingRemoveSphere(PylosSphere pylosSphere) {

		}

		@Override
		public void checkingPass() {

		}
	};

	void shout(String str);
	void shoutGood(String str);
	void shoutBad(String str);
	void checkingMoveSphere(PylosSphere pylosSphere, PylosLocation toLocation);
	void checkingRemoveSphere(PylosSphere pylosSphere);
	void checkingPass();

}
