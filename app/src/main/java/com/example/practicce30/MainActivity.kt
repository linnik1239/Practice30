package com.example.practicce30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.practicce30.ViewModel.Repository
import com.example.practicce30.databinding.ActivityMainBinding
import com.example.practicce30.network.MyApi
import com.google.gson.JsonElement
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    lateinit var mDataBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)




        mDataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var viewModel = ViewModelProviders.of(this).get(Repository::class.java)


         mDataBinding.repository = viewModel
         viewModel.init()
       //  viewModel.au Listener = this





    //    setContentView(R.layout.activity_main)
    }





}