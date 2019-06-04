package com.example.vickie.jokamBot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class HelpPage extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_viewer);
        pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("jokambot help page.pdf").load();

    }
}
