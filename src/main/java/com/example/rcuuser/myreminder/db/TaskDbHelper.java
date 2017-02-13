package com.example.rcuuser.myreminder.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.widget.LinearLayoutCompat;

/**
 * Created by RCUuser on 2/10/2017.
 */

public class TaskDbHelper extends SQLiteOpenHelper{

    public TaskDbHelper(Context context){
        super(context,TaskContract.DB_NAME,null,TaskContract.DB_VERSION);
    }
  @Override
  public void onCreate(SQLiteDatabase db){
      String createTable="CREATE TABLE "+TaskContract.TaskEntry.TABLE+"("+TaskContract.TaskEntry._ID+
              " INTEGER PRIMARY KEY AUTOINCREMENT, "+TaskContract.TaskEntry.COL_TASK_TITLE+" TEXT NOT NULL);";
      db.execSQL(createTable);
  }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXITS "+TaskContract.TaskEntry.TABLE);
        onCreate(db);
    }
}
