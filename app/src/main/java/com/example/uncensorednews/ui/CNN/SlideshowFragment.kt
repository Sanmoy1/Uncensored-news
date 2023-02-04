package com.example.uncensorednews.ui.CNN

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.uncensorednews.R
import com.example.uncensorednews.WebViewController
import com.example.uncensorednews.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

private var _binding: FragmentSlideshowBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

    _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
    val root: View = binding.root

      val myWebView : WebView = root.findViewById(R.id.WebviewSlideshow)
      myWebView.loadUrl("https://edition.cnn.com/")//This will help us to load the url and refer it to the webview
      myWebView.webViewClient= WebViewController()//this helps us to retain the user to the app not to the web browser if he clicks on to something
      myWebView.settings.javaScriptEnabled=true

    /*val textView: TextView = binding.textSlideshow
    slideshowViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }*/
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}