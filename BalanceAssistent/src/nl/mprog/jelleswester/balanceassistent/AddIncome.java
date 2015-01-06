package nl.mprog.jelleswester.balanceassistent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class AddIncome extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_income);
	}
	
	public void backPage(View view) {
    	Intent intent = new Intent(this, CurrentBalance.class);
    	startActivity(intent);
    	finish();
 	}
	
	public void nextPage(View view) {    	
    	// get number
//    	EditText editText = (EditText) findViewById(R.id.cash_amount);
//    	String number = editText.getText().toString();
    	
    	Intent intent = new Intent(this, CurrentBalance.class);
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
