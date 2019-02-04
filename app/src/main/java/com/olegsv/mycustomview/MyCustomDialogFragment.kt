package com.olegsv.mycustomview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * Created by Oleg Sitnikov on 2019-02-03
 */

class MyCustomDialogFragment : DialogFragment() {

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		return inflater.inflate(R.layout.fragment_my_custom_dialog, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

	}
}


class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

	private val mFragmentList = mutableListOf<Fragment>()
	private val mFragmentTitleList = mutableListOf<String>()


	override fun getItem(position: Int): Fragment {
		return mFragmentList[position]
	}

	override fun getCount(): Int {
		return mFragmentList.size
	}

	fun addFragment(fragment: Fragment, title: String) {
		mFragmentList.add(fragment)
		mFragmentTitleList.add(title)
	}

	override fun getPageTitle(position: Int): CharSequence? {
		return mFragmentTitleList[position]
	}

}