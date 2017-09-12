package com.android.acadgild.androidalertdialog123;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class AlertDFragment extends DialogFragment {
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		return new AlertDialog.Builder(getActivity())
				// Set Dialog Icon
				.setIcon(R.drawable.banstop)
				// Set Dialog Title
				.setTitle("Confirm Delete...")
				// Set Dialog Message
				.setMessage("Are you sure you want to delete this?")
				
				// Positive button
				.setPositiveButton("YES", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Do something else
					  	Toast.makeText(getActivity().getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
						dialog.cancel();
					}
				})
				
				// Negative Button
				.setNegativeButton("NO", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,	int which) {
						// Do something else
					  	Toast.makeText(getActivity().getApplicationContext(), "Cancel", Toast.LENGTH_SHORT).show();
						dialog.cancel();
					}
				}).create();
	}
}