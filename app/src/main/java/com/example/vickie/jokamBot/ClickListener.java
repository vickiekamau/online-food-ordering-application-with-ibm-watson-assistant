package com.example.vickie.jokamBot;

import android.view.View;

/**
 * Created by vickie on 03/03/19.
 */

public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}