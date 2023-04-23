package com.example.sqlite_student_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper dbHelper;
    EditText editFirstName, editLastName, editGrades, editID;
    Button buttonAddData;
    Button buttonViewAll;
    Button buttonUpdate;
    Button buttonDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new DatabaseHelper(MainActivity.this);
        editFirstName = (EditText) findViewById(R.id.editText_FirstName);
        editLastName = (EditText) findViewById(R.id.editText_LastName);
        editGrades = (EditText) findViewById(R.id.editText_Grade);
        editID = (EditText) findViewById(R.id.editText_ID);
        buttonAddData = (Button) findViewById(R.id.button_add);
        buttonUpdate = (Button) findViewById(R.id.button_update);
        buttonDelete = (Button) findViewById(R.id.button_delete);
        buttonViewAll = (Button) findViewById(R.id.button_view_all);
        // call the functions onCreate
        AddData();
        viewAll();
        updateData();
        deleteData();
    } // end on create
    public void AddData(){
        buttonAddData.setOnClickListener(
                v -> { // replace new View.OnClickListener() with lambda
                    boolean isInserted = dbHelper.insertData(editFirstName.getText().toString(),
                            editLastName.getText().toString(), editGrades.getText().toString());
                    if(isInserted == true){
                        Toast.makeText(MainActivity.this, "Data inserted",
                                Toast.LENGTH_SHORT).show();
                    } else{
                        Toast.makeText(MainActivity.this,
                                "Data not inserted", Toast.LENGTH_SHORT).show();
                    } // end if .. else
                } // end v
        ); // end setOnClickListener
    } // end AddData

    public void viewAll(){
        buttonViewAll.setOnClickListener(
                v -> {// replace new View.OnClickListener() with lambda
                   Cursor res = dbHelper.getAllData(); // return an object of cursor
                    if(res.getCount() == 0){
                        //show no result so error message
                        showMessage("Error", "No data found");
                        return;
                    } else{ // if there is data going to show the data and create a string buffer
                        StringBuffer buffer = new StringBuffer();
                        // get all data from res
                        while(res.moveToNext()){ // .moveToNext moves the cursor to the next result
                            buffer.append("ID :" +res.getString(0)+"\n");
                            buffer.append("First_Name :" +res.getString(1)+"\n");
                            buffer.append("Last_Name :" +res.getString(2)+"\n");
                            buffer.append("Grade :" +res.getString(3)+"\n\n");
                        } // end while
                        // show all data
                        showMessage("Data", buffer.toString());
                    } // end if .. else
                } // end v lambda
        );
    } // end view all
    public void showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public void updateData(){
        buttonUpdate.setOnClickListener(
                v -> {// replace new View.OnClickListener() with lambda
                    boolean isUpdate = dbHelper.updateData(editID.getText().toString(),
                            editFirstName.getText().toString(), editLastName.getText().toString(),
                            editGrades.getText().toString());
                    if(isUpdate == true)
                        Toast.makeText(MainActivity.this, "Data updated", Toast.LENGTH_SHORT).show();
                     else
                        Toast.makeText(MainActivity.this, "Data not updated", Toast.LENGTH_SHORT).show();
                     // end if .. else
                } // // end v
        );
     } // end update data

    public void deleteData(){
        buttonDelete.setOnClickListener(
                v -> { // replace new View.OnClickListener() with lambda
                    Integer deleteRows = dbHelper.deleteData(editID.getText().toString());
                 if(deleteRows > 0)
                    Toast.makeText(MainActivity.this, "Data deleted",
                            Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Data not deleted",
                            Toast.LENGTH_SHORT).show();
                } // end v lambda and if .. else
        );
    } // end deleteData
} // end MainActivity