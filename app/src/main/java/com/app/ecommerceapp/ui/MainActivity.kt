package com.app.e_commerceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.app.ecommerceapp.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.change_password_dialog.view.*
import kotlinx.android.synthetic.main.product_details.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//        button_choose_location.setOnClickListener {
//
//            startActivity(Intent(this, UserPostsOrders::class.java))
//            finish()
//
//
//        }
//        button_edit_profile.setOnClickListener {
//
//            val bottomSheetDialog = BottomSheetDialog(
//                this@MainActivity, R.style.BottomSheetDialogTheme
//            )
//            val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
//                R.layout.product_details,
//                findViewById<View>(R.id.bottomsheetcontainers) as? ConstraintLayout
//            )
//
//            bottomSheetDialog.setContentView(bottomSheetView)
//            bottomSheetDialog.show()
//
//
//        }
//        change_password_editprofile_textView.setOnClickListener {
//            val mDialogView =
//                LayoutInflater.from(this).inflate(R.layout.create_bid_request, null)
//            //AlertDialogBuilder
//            val mBuilder = AlertDialog.Builder(this)
//                .setView(mDialogView)
//                .setTitle("Change Your Password...")
//            //show dialog
//            val mAlertDialog = mBuilder.show()
//            mAlertDialog.window?.setLayout(700,900)
//            //cancel button click of custom layout
//
//
//
//        }
    }
}