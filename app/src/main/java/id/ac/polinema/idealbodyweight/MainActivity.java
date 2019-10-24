package id.ac.polinema.idealbodyweight;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.idealbodyweight.fragments.AboutFragment;
import id.ac.polinema.idealbodyweight.fragments.BrocaIndexFragment;
import id.ac.polinema.idealbodyweight.fragments.MenuFragment;
import id.ac.polinema.idealbodyweight.fragments.ResultFragment;


public class MainActivity extends AppCompatActivity implements MenuFragment.OnFragmentInteractionListener,
		BrocaIndexFragment.OnFragmentInteractionListener{
	public class MainActivity extends AppCompatActivity implements
			MenuFragment.OnFragmentInteractionListener,
			BrocaIndexFragment.OnFragmentInteractionListener,
			ResultFragment.OnFragmentInteractionListener {


		// Deklarasikan atribut Fragment di sini

		private AboutFragment aboutFragment;
		private MenuFragment menuFragment;
		private BrocaIndexFragment brocaIndexFragment;
		private ResultFragment resultFragment;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			@@ -32,6 +36,7 @@ protected void onCreate(Bundle savedInstanceState) {
				aboutFragment = AboutFragment.newInstance("Afifah Millatina");
				menuFragment = new MenuFragment();
				brocaIndexFragment = new BrocaIndexFragment();
				resultFragment = new ResultFragment();

				getSupportFragmentManager().beginTransaction()
						.replace(R.id.fragment_container, menuFragment)
				@@ -69,8 +74,17 @@ public void onBodyMassIndexButtonClicked() {
				}

				public void onCalculateBrocaIndexClicked(float index) {

					resultFragment.setInformation(String.format("Your ideal weight is %.2f kg", index));
					getSupportFragmentManager().beginTransaction()
							.replace(R.id.fragment_container, resultFragment)
							.commit();
				}


				@Override
				public void onTryAgainButtonClicked(String Object tag;
				tag) {
					getSupportFragmentManager().beginTransaction()
							.replace(R.id.fragment_container, brocaIndexFragment)
							.commit();
				}