package com.surajmyt.navigationcomponentandroid

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var listener: NavController.OnDestinationChangedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.fragment)
        bottomNavigationView = findViewById(R.id.btm_nav_view)
        appBarConfiguration = AppBarConfiguration(setOf(R.id.dashboard_fragment, R.id.chat_fragment, R.id.premium_fragment))

        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)

        listener = NavController.OnDestinationChangedListener { controller, destination, arguments ->
            when(destination.id) {
                R.id.dashboard_fragment -> supportActionBar
                    ?.setBackgroundDrawable(ColorDrawable(getColor(R.color.dashboard_color)))
                R.id.chat_fragment -> supportActionBar
                    ?.setBackgroundDrawable(ColorDrawable(getColor(R.color.chat_color)))
                R.id.premium_fragment -> supportActionBar
                    ?.setBackgroundDrawable(ColorDrawable(getColor(R.color.premium_color)))
            }
        }
    }
    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(listener)
    }

    override fun onPause() {
        super.onPause()
        navController.removeOnDestinationChangedListener(listener)
    }
}