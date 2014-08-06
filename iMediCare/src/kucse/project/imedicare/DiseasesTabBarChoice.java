package kucse.project.imedicare;

import kucse.project.imedicare.ChildDiseaseTab;
import kucse.project.imedicare.DentalDiseaseTab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DiseasesTabBarChoice extends FragmentPagerAdapter {

	public DiseasesTabBarChoice(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
		
			return new ChildDiseaseTab();
			
		case 1:
			
			return new DentalDiseaseTab();
		
		}

		return null;
	}

	@Override
	public int getCount() {
		
		return 2;
	}

}
