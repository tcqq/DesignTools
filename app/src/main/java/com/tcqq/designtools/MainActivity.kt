package com.tcqq.designtools

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


/**
 * Dp to PX and PX to DP.
 *
 * @author Alan Dreamer
 * @since 06/09/2018 Created
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        screen_width.text = getString(R.string.px_value, Util.getScreenWidth(this).toString())
        screen_height.text = getString(R.string.px_value, Util.getScreenHeight(this).toString())

        val defaultDp = "dp: 0"
        val defaultPx = "px: 0"
        text_view_dp.text = defaultDp
        text_view_px.text = defaultPx

        edit_text_px.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val dp = "dp: " + if (s.toString() != "") Util.px2dp(this@MainActivity, s.toString().toFloat()).toString() else "0"
                text_view_dp.text = dp
            }
        })

        edit_text_dp.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val px = "px: " + if (s.toString() != "") Util.dp2px(this@MainActivity, s.toString().toFloat()).toString() else "0"
                text_view_px.text = px
            }
        })
    }
}
