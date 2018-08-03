package com.denis55ka.taskhijacking

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class StartupBroadcast : BroadcastReceiver() {

    override fun onReceive(context: Context, itent: Intent) {
        context.startActivity(Intent(context, MainActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
    }

}
