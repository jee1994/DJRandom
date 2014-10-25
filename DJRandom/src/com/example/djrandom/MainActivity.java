package com.example.djrandom;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

/* git commit 하는 법 
 * 어떤 파일 코드나 코멘트 변경후 저장 -> 그 파일이나 프로젝트 폴더 오른쪽 클릭 -> team -> 인덱스 추가(Add to Index) -> Git 디렉토리에서 -> 프로젝트 폴더 오른쪽 클릭 -> commit -> 메시지 쓴후 commit and push. 
 * 
 * 프로젝트 원격 서버에서 가져오기 
 * git 디렉토리 -> 오른쪽 클릭 -> pull 
 * 
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {          
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.activity_main);
		
		/* SOME FELLINGS*/
		
		Button bid = (Button) findViewById(R.id.button);
		Button bid1 = (Button) findViewById(R.id.button1);
		Button bid2 = (Button) findViewById(R.id.button2);
		Button bid3 = (Button) findViewById(R.id.button3);
		Button bid4 = (Button) findViewById(R.id.button4);
		Button bid5 = (Button) findViewById(R.id.button5);
//		Button bid6 = (Button) findViewById(R.id.button);
		
		bid.setBackgroundColor(Color.argb(255, 0, 255, 0));
		bid1.setBackgroundColor(Color.argb(255, 0, 255, 0));
		bid2.setBackgroundColor(Color.argb(255, 0, 255, 0));
		bid3.setBackgroundColor(Color.argb(255, 0, 255, 0));
		bid4.setBackgroundColor(Color.argb(255, 0, 255, 0));
		bid5.setBackgroundColor(Color.argb(255, 0, 255, 0));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
