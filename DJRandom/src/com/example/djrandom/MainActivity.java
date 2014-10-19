package com.example.djrandom;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

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
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
