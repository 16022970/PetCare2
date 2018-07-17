//package com.example.a16022970.petcare2;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.util.Log;
//import android.widget.DatePicker;
//
//import java.util.ArrayList;
//
//public class DBHelper extends SQLiteOpenHelper {
//
//    private static final String DATABASE_NAME = "pets.db";
//    private static final int DATABASE_VERSION = 1;
//    private static final String TABLE_PETS = "pets";
//
//    public DBHelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        String createTable = "CREATE TABLE " + TABLE_PETS + "( id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, breed TEXT, date DATE,additional TEXT)";
//        db.execSQL(createTable);
//
////        db.execSQL("ALTER TABLE " + TABLE_TASK + " ADD COLUMN module_name TEXT ");
////        Log.i("info", "altered tables");
//
//        //Dummy records, to be inserted when the database is created
//        for (int i = 0; i< 1; i++) {
//            ContentValues values = new ContentValues();
////            values.put("image",byte[] image);
//            values.put("name", "Black");
//            values.put("breed", "Persian");
////            values.put("date", "29/09/2015");
//            values.put("additional", "He needs medication");
//
//            db.insert(TABLE_PETS, null, values);
//        }
//        Log.i("info", "dummy records inserted");
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("ALTER TABLE " + TABLE_PETS + " ADD COLUMN module_name TEXT ");
////        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PETS);
////        onCreate(db);
//    }
//
//    public long insertPet(String name, String breed, String add) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put("name", name);
//        values.put("breed", breed);
////        values.put(COLUMN_DATE, String.valueOf(date));
//        values.put("additional", add);
//
//        long result = db.insert(TABLE_PETS, null, values);
//        if (result == -1) {
//            Log.d("DBHelper", "Insert failed");
//        }
//        db.close();
//        Log.d("SQL Insert ", "" + result); //id returned, shouldn’t be -1
//        return result;
//    }
//
//    public ArrayList<Pets> getAllPets() {
//        ArrayList<Pets> pets = new ArrayList<Pets>();
//        String selectQuery = "SELECT id, name, breed, additional FROM " + TABLE_PETS;
//
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//
//        if (cursor.moveToFirst()) {
//            do {
//                int id = cursor.getInt(0);
//                String name = cursor.getString(1);
//                String breed = cursor.getString(2);
//                String date = cursor.getString(3);
//                String add = cursor.getString(4);
//
//                Pets obj = new Pets(name,breed,add,id);
//                pets.add(obj);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        db.close();
//        return pets;
//    }
//    public int updatePet(Pets pets) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put("name", pets.getName());
//        values.put("breed", pets.getBreed());
////        values.put(COLUMN_DATE, pets.getDob());
//        values.put("additional", pets.getXtra());
//
//        String condition = "id= ?";
//        String[] args = {String.valueOf(pets.getId())};
//        int result = db.update(TABLE_PETS, values, condition, args);
//        if (result < 1) {
//            Log.d("DBHelper", "Update Failed");
//        }
//        db.close();
//        return result;
//    }
//    public int deletePet(int id){
//        SQLiteDatabase db = this.getWritableDatabase();
//        String condition = "id= ?";
//        String[] args = {String.valueOf(id)};
//        int result = db.delete(TABLE_PETS, condition, args);
//        db.close();
//        return result;
//    }
//
//
//
//}
