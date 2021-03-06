package mustafaozhan.github.com.livewallpaper.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mustafaozhan.github.com.livewallpaper.R

/**
 * Created by Mustafa Ozhan on 2/8/18 at 1:36 PM on Arch Linux wit Love <3.
 */
class RecentsFragment : Fragment() {
    companion object {
        private var INSTANCE: RecentsFragment? = null
        fun getInstance(): RecentsFragment? {
            if (INSTANCE == null)
                INSTANCE = RecentsFragment()
            return INSTANCE

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_recents, container, false)
}