package com.longjian.tbedittextpw;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class MainActivity extends Activity {

    /**
     *创建数据存储文件
     * @param savedInstanceState
     */
    Realm myRealm = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRealm = Realm.getInstance(new RealmConfiguration.Builder(this).name("myRealm.reaml").build());
        myRealm.beginTransaction();
        for(int i= 0 ; i< 20 ;i ++){
        StudentInfo studentInfo = myRealm.createObject(StudentInfo.class);
        studentInfo.setAge(8+i);
        studentInfo.setName("longjian"+i);
        }
        myRealm.commitTransaction();


        RealmResults<StudentInfo> realmResults = myRealm.where(StudentInfo.class).findAll();

        for(StudentInfo studentInfo1 : realmResults){
            Log.e("XXXXXXXXXXX",studentInfo1.getName()+":"+studentInfo1.getAge());

        }

        RealmResults<StudentInfo> realmResults1  = myRealm.where(StudentInfo.class).findAllSorted("name",false);
        for(StudentInfo studentInfo1 : realmResults){
            Log.e("YYYYYYYYYYYYYYYYYY",studentInfo1.getName()+":"+studentInfo1.getAge());

        }
    }
}
