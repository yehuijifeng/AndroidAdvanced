package com.lh.advanced.activity

import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import com.lh.advanced.R
import com.lh.base.BaseActivity
import com.lh.base.BaseFragment
import com.lh.component.fragment.ComponentFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    private var componentFragment: ComponentFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        nav_view.setNavigationItemSelectedListener { menuItem ->
            menuItem.isChecked = true
            drawerLayout.closeDrawers()
            Toast.makeText(this, menuItem.title, Toast.LENGTH_LONG).show()
            when (menuItem.itemId) {
                R.id.nav_component -> {
                    showFragment(ComponentFragment::class.java)
                }
            }
            true
        }
    }

    /**
     * 显示目标framgent
     */
    private fun showFragment(clazz: Class<out BaseFragment>) {
        when (clazz.canonicalName) {
            ComponentFragment::class.java.canonicalName -> {
                if (componentFragment == null) {
                    componentFragment = ComponentFragment()
                    supportFragmentManager.beginTransaction()
                        .add(R.id.flContent, componentFragment!!)
                        .commit()
                } else {
                    supportFragmentManager.beginTransaction()
                        .show(componentFragment!!)
                        .commit()
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }


}