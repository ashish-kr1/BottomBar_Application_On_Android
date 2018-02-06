package com.example.ashishrajput.bottombar;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.RequiresApi;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends Activity {

BottomBar bottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomBar=BottomBar.attach(this,savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.menu, new OnMenuTabClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
                    @Override
                    public void onMenuTabSelected(@IdRes int i) {
                        if(i==R.id.BottomBarItem1){
                           classFragment classFragment=new classFragment();
                            getFragmentManager().beginTransaction().replace(R.id.frame,classFragment).commit();

                        }else if (i==R.id.BottomBarItem2){
                            people p=new people();
                            getFragmentManager().beginTransaction().replace(R.id.frame,p).commit();
                        }
                        else if (i==R.id.BottomBarItem3){
                            car c=new car();
                            getFragmentManager().beginTransaction().replace(R.id.frame,c).commit();
                        }else if (i==R.id.BottomBarItem4){
                            chuha chu=new chuha();
                            getFragmentManager().beginTransaction().replace(R.id.frame,chu).commit();
                        }else if (i==R.id.BottomBarItem5){
                            billi bil=new billi();
                            getFragmentManager().beginTransaction().replace(R.id.frame,bil).commit();
                        }
                    }

                    @Override
                    public void onMenuTabReSelected(@IdRes int menuItemId) {

                    }
                }

        );
        bottomBar.mapColorForTab(0,"#F44336");
        bottomBar.mapColorForTab(1,"#E91E63");
        bottomBar.mapColorForTab(2,"#9C27B0");
        bottomBar.mapColorForTab(3,"#03A9F4");
        bottomBar.mapColorForTab(4,"#FF9800");

       /* BottomBarBadge unread;
        unread=bottomBar.makeBadgeForTabAt(3,"#FF000",13);
        unread.show();*/
    }
}
