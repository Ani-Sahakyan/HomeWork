package am.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)

        val emailText = findViewById<EditText>(R.id.email)
        val passwordText = findViewById<EditText>(R.id.password)
        val loginBtn = findViewById<Button>(R.id.login)

        loginBtn.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.login && emailText.text.isNotEmpty() && passwordText.text.isNotEmpty()){
                if (emailText.text.endsWith("@mail.ru") || emailText.text.endsWith("@gmail.com") && passwordText.text.length >= 8 && passwordText.text.length >= 8
                          && !passwordText.text.equals("12345678") && !passwordText.text.equals("00000000") && !passwordText.text.equals("87654321")) {

                    Toast.makeText(this, "Username: ${emailText.text} \nPassword: ${passwordText.text}", Toast.LENGTH_LONG)
                        .show()
                }else  Toast.makeText(this, "Check email or password", Toast.LENGTH_LONG) .show()

            }else  Toast.makeText(this, "Email or password is empty", Toast.LENGTH_LONG) .show()
        })
    }

}