package nl.mprog.jelleswester.balanceassistent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class CurrentBalance extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_balance);
    }
    
    // activates when clicking on view details button
 	public void viewDetails(View view) {
 		 	
    	Intent intent = new Intent(this, DetailsBalance.class);
    	startActivity(intent);
    	finish();
 	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.current_balance, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent intent;
        
        if (id == R.id.set_balance) {        	
        	intent = new Intent(this, SetBalance.class);
        	startActivity(intent);
        	finish();
            return true;
        }
        else if (id == R.id.add_income) {
        	intent = new Intent(this, AddIncome.class);
        	startActivity(intent);
        	finish();
            return true;
        }
        else if (id == R.id.subtract_expense) {
        	intent = new Intent(this, SubtractExpense.class);
        	startActivity(intent);
        	finish();
            return true;
        }
        else if (id == R.id.view_history) {
        	intent = new Intent(this, ViewHistory.class);
        	startActivity(intent);
        	finish();
            return true;
        }
        
        return super.onOptionsItemSelected(item);
    }
}
