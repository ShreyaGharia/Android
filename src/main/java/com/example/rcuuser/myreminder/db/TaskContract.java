package com.example.rcuuser.myreminder.db;

import android.provider.BaseColumns;

/**
 * Created by RCUuser on 2/10/2017.
 */

public class TaskContract {
    public static final String DB_NAME="com.example.rcuser.myreminder";
    public static final int DB_VERSION=1;
    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
