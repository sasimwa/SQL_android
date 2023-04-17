package com.example.sql_sandra

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var edtName:EditText
    private lateinit var edtEmail:EditText
    private lateinit var edtNumber:EditText
    private lateinit var btnSave:Button
    private lateinit var btnView:Button
    private lateinit var btnDelete:Button
    private lateinit var db:SQLiteDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName = findViewById(R.id.edtname)
        edtEmail = findViewById(R.id.edtemail)
        edtNumber = findViewById(R.id.edtnumber)
        btnSave = findViewById(R.id.btnsave)
        btnView = findViewById(R.id.btnview)
        btnDelete = findViewById(R.id.btndelete)

        db = openOrCreateDatabase("SandraDB",Context.MODE_PRIVATE,null)

        db.execSQL("CREATE TABLE IF NOT EXITS users(jina VARCHAR ,arafa VARCHAR,kitambulisho VARCHAR)")

        btnView.setOnClickListener {

            Toast.makeText(this, "view", Toast.LENGTH_SHORT).show()
        }

        btnSave.setOnClickListener {
            var name_edt = edtName.text.toString().trim()
            var email_edt = edtEmail.text.toString().trim()
            var idnum = edtNumber.text.toString().trim()


            if (name_edt.isEmpty() || email_edt.isEmpty() || idnum.isEmpty())
                Toast.makeText(this, "Check Your Input Fields", Toast.LENGTH_SHORT).show()

            else{

                db.execSQL("INSERT INTO users VALUES('')")
            }


        }
    }
}