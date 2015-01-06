package nl.mprog.jelleswester.balanceassistent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class SetBalance extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_set_balance);
	}
	
	public void backPage(View view) {
    	Intent intent = new Intent(this, CurrentBalance.class);
    	startActivity(intent);
    	finish();
 	}
	
	public void nextPage(View view) {
    	// get number
//    	EditText editText = (EditText) findViewById(R.id.number_accounts);
//    	String number = editText.getText().toString();
    	
    	Intent intent = new Intent(this, SetBalance2.class);
    	startActivity(intent);
    	finish();
 	}
	
	@Override
	public void onBackPressed() {
	    Intent intent = new Intent(this, CurrentBalance.class);
	    startActivity(intent);
	    finish();
	}
}
