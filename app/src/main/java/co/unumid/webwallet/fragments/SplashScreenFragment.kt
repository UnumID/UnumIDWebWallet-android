package co.unumid.webwallet.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import co.unumid.webwallet.R


@SuppressLint("CustomSplashScreen")
class SplashScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)

        val action = R.id.action_splashScreenFragment_to_homeFragment

        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(action)
        }, 2000)

        return view
    }
}