package com.bootcamp.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val db = Firebase.firestore
        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w("firebase token: ", "Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result

            Log.d("firebase token: ", token)
//            Toast.makeText(baseContext, token, Toast.LENGTH_SHORT).show()
        })
        // Create a new user with a first and last name
        /*val user = hashMapOf(
            "username" to "admin1",
            "password" to "admin1",
            "super" to false
        )
*/
        // Add a new document with a generated ID
        /*db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("DATABASEMESSAGE", "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("DATABASEMESSAGE", "Error adding document", e)
            }
*/
        //get the document with a generated ID
        /*db.collection("users")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    Log.d("DATABASEMESSAGE", "${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener { exception ->
                Log.w("DATABASEMESSAGE", "Error getting documents.", exception)
            }*/

    }
}