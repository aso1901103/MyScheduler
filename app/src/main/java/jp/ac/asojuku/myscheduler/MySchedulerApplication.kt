package jp.ac.asojuku.myscheduler

import android.app.Application
import io.realm.Realm


//アプリが起動したときに最初に動く初期処理クラス
//(Application継承クラス)

class MySchedulerApplication: Application() {
    //アプリの初期処理を上書き
    override fun onCreate() {
        super.onCreate()
        //REALMを起動する処理
        Realm.init(this)
    }
}