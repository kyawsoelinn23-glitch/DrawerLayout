package com.example.drawerlayout

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var dlayout: DrawerLayout
    private lateinit var naviView: NavigationView
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dlayout = findViewById(R.id.dlayout)
        naviView = findViewById(R.id.naviView)
        toggle = ActionBarDrawerToggle(this, dlayout, R.string.open, R.string.close)
        dlayout.addDrawerListener(toggle)
        toggle.syncState()

        // change back icon when navigation drawer layout is opened or closed
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (toggle.onOptionsItemSelected(item)) {
            true
        } else{
            super.onOptionsItemSelected(item)
        }
    }
}