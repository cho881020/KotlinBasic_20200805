package kr.co.tjoeun.kotlinbasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Ctrl + / : 해당 줄을 주석으로

//        메모처럼 주석을 적자

//        xml에 그려둔 ClickMe 버튼이 눌렸다는것을 감지하고 싶다.

        clickMeBtn.setOnClickListener {

//            이 중괄호 내부의 코드 => clickMeBtn이 눌리면 실행될 코드.
            Log.d("버튼클릭", "ClickME버튼 눌림!")

        }

//        두번째 버튼이 눌릴때의 대응
        secondBtn.setOnClickListener {
            Log.d("버튼눌림", "두번째 버튼 눌림!")
        }


    }
}