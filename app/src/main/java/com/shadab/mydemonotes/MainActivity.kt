package com.shadab.mydemonotes


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater.inflate(R.menu.my_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.privatenotes->{
                var intent= Intent(this@MainActivity,MoreDetails::class.java)
                startActivity(intent)
            }
            R.id.exit->{
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun Facebook(view: View) {

        Toast.makeText(getApplicationContext() ," helooo" ,Toast.LENGTH_SHORT).show()
    }

    fun insta(view: View) {
        Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show()
    }


}