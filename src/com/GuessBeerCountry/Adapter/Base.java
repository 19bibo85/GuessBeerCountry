package com.GuessBeerCountry.Adapter;

import java.util.ArrayList;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Repository.Utility;
import com.actionbarsherlock.app.SherlockActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Base extends ArrayAdapter<com.GuessBeerCountry.Model.Base>{
	private final SherlockActivity activity;
	private final Context context;
	private final ArrayList<com.GuessBeerCountry.Model.Base> baseList;
	private int layout;	
	
	public Base(SherlockActivity activity, Context context, ArrayList<com.GuessBeerCountry.Model.Base> baseList, int layout) {
		super(context, layout, baseList);
		this.activity = activity;
		this.context = context;
		this.baseList = baseList;
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
			holder.baseImage = (ImageView) view.findViewById(R.id.image);
			holder.baseName = (TextView) view.findViewById(R.id.name);
			view.setTag(holder);		
		}else{
			holder = (ViewHolder) view.getTag();
		}
		
		// Setting the image
		String baseImage = baseList.get(position).GetImgId();
		int imgID = Utility.GetResId(baseImage, R.drawable.class);
		holder.baseImage.setImageResource(imgID);
		Utility.ScaleSizeForTablet(activity, holder.baseImage);
		
		// Setting the name
		String baseName = baseList.get(position).GetLanguage();
		holder.baseName.setText(baseName);
		holder.baseName.setTypeface(Utility.GetFont(activity));
				
		return view;
	}
	
	static class ViewHolder {
	  ImageView baseImage;
	  TextView baseName;
	 }
}
