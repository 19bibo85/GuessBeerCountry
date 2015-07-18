package com.GuessBeerCountry.Adapter;

import java.util.ArrayList;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Repository.Utility;
import com.actionbarsherlock.app.SherlockActivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Review extends ArrayAdapter<com.GuessBeerCountry.Model.Review>{
	private final SherlockActivity activity;
	private final Context context;
	private final ArrayList<com.GuessBeerCountry.Model.Review> reviewList;

	public Review(SherlockActivity activity, Context context, ArrayList<com.GuessBeerCountry.Model.Review> reviewList) {
		super(context, R.layout.review_inflate, reviewList);
		this.activity = activity;
		this.context = context;
		this.reviewList = reviewList;
	}

	public View getView(int position, View convertView, ViewGroup parent) {		
		View view = convertView;
		ViewHolder holder = null;
		
		if(view == null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.review_inflate, parent, false);
			holder = new ViewHolder();
			holder.beerImage = (ImageView) view.findViewById(R.id.image);
			Utility.ScaleSizeForTablet(activity, holder.beerImage);
			holder.beerName1 = (TextView) view.findViewById(R.id.name1);
			holder.beerName2 = (TextView) view.findViewById(R.id.name2);
			holder.beerName3 = (TextView) view.findViewById(R.id.name3);
			holder.beerName4 = (TextView) view.findViewById(R.id.name4);
			view.setTag(holder);		
		}else{
			holder = (ViewHolder) view.getTag();
		}
		
		// Setting the image
		String plateImage = reviewList.get(position).getImgID();
		int imgID = Utility.GetResId(plateImage, R.drawable.class);
		holder.beerImage.setImageResource(imgID);
		
		String correct = reviewList.get(position).getCorrectAnswer();
		ArrayList<String> wrongs = reviewList.get(position).getWrongAnswer();
		String[] answers = { reviewList.get(position).getNameBeer1(),
				reviewList.get(position).getNameBeer2(),
				reviewList.get(position).getNameBeer3(),
				reviewList.get(position).getNameBeer4() };
		
		// Setting beer name 1
		String beerName1 = answers[0];
		holder.beerName1.setText(beerName1);
		holder.beerName1.setTypeface(Utility.GetFont(activity));
		
		// Setting beer name 2
		String beerName2 = answers[1];
		holder.beerName2.setText(beerName2);
		holder.beerName2.setTypeface(Utility.GetFont(activity));
		
		// Setting beer name 3
		String beerName3 = answers[2];
		holder.beerName3.setText(beerName3);
		holder.beerName3.setTypeface(Utility.GetFont(activity));
		
		// Setting beer name 4
		String beerName4 = answers[3];
		holder.beerName4.setText(beerName4);
		holder.beerName4.setTypeface(Utility.GetFont(activity));
		
		colorAnswers(holder, answers, correct, wrongs);
		
		return view;
	}
	
	private void colorAnswers(ViewHolder holder, String[] answers, String correct, ArrayList<String> wrongs) {
		
		// Set the holder text view with the default colour
		holder.beerName1.setTextColor(Color.BLACK);
		holder.beerName2.setTextColor(Color.BLACK);
		holder.beerName3.setTextColor(Color.BLACK);
		holder.beerName4.setTextColor(Color.BLACK);
		
		// Setting the colour of the answers to green if it's correct or to red if are wrongs
		for (int i = 0; i <= answers.length; i++) {
						
			if (answers[0].equals(correct))
				holder.beerName1.setTextColor(Color.GREEN);
			else if (answers[1].equals(correct))
				holder.beerName2.setTextColor(Color.GREEN);
			else if (answers[2].equals(correct))
				holder.beerName3.setTextColor(Color.GREEN);
			else if (answers[3].equals(correct))
				holder.beerName4.setTextColor(Color.GREEN);
			
			if (wrongs.contains(answers[0]))
				holder.beerName1.setTextColor(Color.RED);
			if (wrongs.contains(answers[1]))
				holder.beerName2.setTextColor(Color.RED);
			if (wrongs.contains(answers[2]))
				holder.beerName3.setTextColor(Color.RED);
			if (wrongs.contains(answers[3]))
				holder.beerName4.setTextColor(Color.RED);
		}
	}

	static class ViewHolder {
	  ImageView beerImage;
	  TextView beerName1;
	  TextView beerName2;
	  TextView beerName3;
	  TextView beerName4;
	 }
}
