package com.example.practicce30.ViewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.practicce30.network.MyApi
import com.google.gson.JsonElement
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class Repository: ViewModel() {

 //   @Inject
// constructor(){
//
// }


    fun init(){



        MyApi().login()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(
                object :SingleObserver<JsonElement>{
                    override fun onSubscribe(d: Disposable) {
                       Log.d("abc","onSubscribe: "+d.toString())
                    }

                    override fun onSuccess(t: JsonElement) {
                        Log.d("abc","onSuccess: "+t.toString())
                    }

                    override fun onError(e: Throwable) {
                        Log.d("abc","onError: "+e.toString())
                    }

                }
            )

    }


}
















































//
//MyApi().login()
//.subscribeOn(Schedulers.io())
//.observeOn(AndroidSchedulers.mainThread())
//.subscribeWith(
//object: SingleObserver<JsonElement>{
//    override fun onSubscribe(d: Disposable) {
//        TODO("Not yet implemented")
//    }
//
//    override fun onSuccess(t: JsonElement) {
//        TODO("Not yet implemented")
//    }
//
//    override fun onError(e: Throwable) {
//        TODO("Not yet implemented")
//    }
//
//}
//)