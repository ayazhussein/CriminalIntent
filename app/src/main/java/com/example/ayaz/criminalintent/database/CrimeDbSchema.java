package com.example.ayaz.criminalintent.database;

import java.lang.ref.SoftReference;

/**
 * Created by Ayaz on 31.01.2016.
 */
public class CrimeDbSchema {

    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
