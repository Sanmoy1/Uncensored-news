package com.example.uncensorednews.ui.BBC

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.uncensorednews.MainActivity
import com.example.uncensorednews.R
import com.example.uncensorednews.WebViewController
import com.example.uncensorednews.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var myWebView:WebView
private var _binding: FragmentHomeBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!



  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

    _binding = FragmentHomeBinding.inflate(inflater, container, false)
    val root: View = binding.root

       myWebView = root.findViewById(R.id.WebView)
      myWebView.loadUrl("https://www.bbc.com/news/world/asia/india")//This will help us to load the url and refer it to the webview
      myWebView.webViewClient= WebViewController()//this helps us to retain the user to the app not to the web browser if he clicks on to something
      myWebView.settings.javaScriptEnabled=true







    /*val textView: TextView = binding.textHome
    homeViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }*/
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}