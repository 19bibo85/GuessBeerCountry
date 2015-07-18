package com.GuessBeerCountry.Adapter;

import java.util.ArrayList;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Model.BeerBase;
import com.GuessBeerCountry.Repository.Utility;
import com.actionbarsherlock.app.SherlockActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Beer extends ArrayAdapter<BeerBase>{
	private final SherlockActivity activity;
	private final Context context;
	private final ArrayList<BeerBase> beerList;
	private int layout;	
	
	public Beer(SherlockActivity activity, Context context, ArrayList<BeerBase> beerList, int layout) {
		super(context, layout, beerList);
		this.activity = activity;
		this.context = context;
		this.beerList = beerList;
		this.layout = layout;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		ViewHolder holder = null;
		
		if(view == null){			
			// Setting the Layout
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(layout, parent, false);
			holder = new ViewHolder();
			holder.beerImage = (ImageView) view.findViewById(R.id.image);
			holder.beerName = (TextView) view.findViewById(R.id.name);
			view.setTag(holder);		
		}else{
			holder = (ViewHolder) view.getTag();
		}
		
		// Setting the image
		String beerImage = beerList.get(position).GetImgId();
		int imgID = Utility.GetResId(beerImage, R.drawable.class);
		holder.beerImage.setImageResource(imgID);
		Utility.ScaleSizeForTablet(activity, holder.beerImage);
		
		// Setting the name
		String beerName = beerList.get(position).GetLanguage();
		holder.beerName.setText(beerName);
		holder.beerName.setTypeface(Utility.GetFont(activity));
				
		return view;
	}
	
	static class ViewHolder {
	  ImageView beerImage;
	  TextView beerName;
	 }
}
