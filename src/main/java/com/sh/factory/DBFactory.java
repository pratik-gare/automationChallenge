package com.sh.factory;

import com.sh.DB.DBConfiguration;
import com.sh.DB.DBManager;

public class DBFactory {
    public static DBManager getDBManager(DBConfiguration dbConfiguration) {
        // based on the dbConfiguration you can return a concrete DB manager viz. SQLDBManager, OracleDBManager, etc.
        // for now let's return SQLDBManager
        return null;
    }
}
