package com.example.permissions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityManagerCompat;

import android.Manifest;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
Button btn,btn1,btn2,btn3,btn4,btn5,btn6;
Intent intent=null,chooser=null;
private static final int camera=0;
ImageView image;
EditText txt;
String str=null;
//TextView view;
//ProgressBar progress;
    private BroadcastReceiver broacastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        txt = findViewById(R.id.txt);
//        view = findViewById(R.id.view);
//        progress = findViewById(R.id.progress);
        image = findViewById(R.id.image);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/?hl=en?"));
                chooser=Intent.createChooser(intent,"Open Playstore");
                startActivity(chooser);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://Government College University Lahore (GCUL)"));
                chooser=Intent.createChooser(intent,"Open Playstore");
                startActivity(chooser);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("Mailto"));
                String [] s={"usamamustafa257@gmail.com","tayyabhafeez147@gmail.com","ahsannadeem335@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,s);
                intent.putExtra(Intent.EXTRA_SUBJECT,"This is testing Email");
                intent.putExtra(Intent.EXTRA_TEXT,"This is testing Email This is testing Email This is testing Email This is testing Email This is testing Email This is testing Email This is testing Email");
                intent.setType("message/rfc6384525");
                chooser=Intent.createChooser(intent,"Send Email");
                startActivity(chooser);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent share=new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String sharelink="here is the link of the Application";
                share.putExtra(Intent.EXTRA_SUBJECT,"SUBJECT");
                share.putExtra(Intent.EXTRA_TEXT,"sharelink");
                startActivity(Intent.createChooser(share,"share through apps"));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,camera);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_CALL);
                str=txt.getText().toString();
                if (str.trim().isEmpty())
                {
                    i.setData(Uri.parse("tel:03024516371"));
                }
                else
                {
                    i.setData(Uri.parse("tel:str"));
                }
//                if (ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE =!PackageManager.PERMISSION_GRANTED));
                startActivity(i);


            }
        });


    }
    public void request()
    {
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
    }
//    public void activityresult(int req,int res,Intent id)
//    {if (req==camera && res== Activity.RESULT_OK)
//    {
//        Bitmap photo=(Bitmap) id.getExtras().get("data");
//        image.setImageBitmap(photo);
//    }
//
//    }


}