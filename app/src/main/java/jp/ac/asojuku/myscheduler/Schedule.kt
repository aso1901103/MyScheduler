package jp.ac.asojuku.myscheduler

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*


//Realmのレコードインタスタンスオブジェクト用のクラス
//public(open)なクラス
class Schedule:RealmObject() {
    //プロパティ(カラムにあたる)
    @PrimaryKey
    var id:Long = 0//主キー(Long型、idとして使う)
    var date:Date = Date()//日付
    var title:String = ""//予約スケジュールの件名
    var detail:String = ""//予約スケジュールの詳細
}