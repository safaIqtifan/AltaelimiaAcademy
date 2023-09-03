package com.altaelimia.academy.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.altaelimia.academy.MainActivity;
import com.altaelimia.academy.R;
import com.altaelimia.academy.databinding.FragmentGalleryBinding;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    @SuppressLint("QueryPermissionsNeeded")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container,false);
        View root = binding.getRoot();
        onClickWhatsApp();

////        MainActivity.webView(root.findViewById(R.id.webView), "https://www.altaelimia.academy/01032850265");
//        try {
//            Intent sendMsg = new Intent(Intent.ACTION_VIEW);
//            String url = "https://api.whatsapp.com/send?phone=" + "+201032850265" + "&text=" + URLEncoder.encode("Your Message to Contact Number", "UTF-8");
//            sendMsg.setPackage("com.whatsapp");
//            sendMsg.setData(Uri.parse(url));
//            if (sendMsg.resolveActivity(requireActivity().getPackageManager()) != null) {
//                startActivity(sendMsg);
//            }
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getActivity(), "Please Install whatsaap App", Toast.LENGTH_LONG).show();
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//
//        }

        return root;
    }
    public void onClickWhatsApp() {

        PackageManager pm=getActivity().getPackageManager();
        try {
            Intent sendMsg = new Intent(Intent.ACTION_VIEW);
            String url = "https://api.whatsapp.com/send?phone=" + "+201032850265" + "&text=" +
                    URLEncoder.encode("", "UTF-8");
            sendMsg.setPackage("com.whatsapp");
            sendMsg.setData(Uri.parse(url));
            PackageInfo info=pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            //Check if package exists or not. If not then code
            //in catch block will be called
            sendMsg.setPackage("com.whatsapp");

//            sendMsg.putExtra(Intent.EXTRA_TEXT, "text");
            startActivity(Intent.createChooser(sendMsg, "Share with"));
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(getActivity(), "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}