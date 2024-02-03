package com.spacedevelopers.parinayabandham.about;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.skydoves.powerspinner.OnSpinnerItemSelectedListener;
import com.skydoves.powerspinner.PowerSpinnerInterface;
import com.skydoves.powerspinner.PowerSpinnerView;

import java.util.List;

public class PowerSpinnerAdapter<T> extends ArrayAdapter<T> implements PowerSpinnerInterface<T> {

    private LayoutInflater inflater;

    public PowerSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<T> items) {
        super(context, resource, items);
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initPowerSpinnerView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initPowerSpinnerView(position, convertView, parent);
    }

    private View initPowerSpinnerView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(android.R.layout.simple_spinner_item, parent, false);
        }

        TextView textView = convertView.findViewById(android.R.id.text1);
        T item = getItem(position);

        if (item != null) {
            textView.setText(item.toString());
        }

        return convertView;
    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public void setIndex(int i) {

    }

    @Nullable
    @Override
    public OnSpinnerItemSelectedListener<T> getOnSpinnerItemSelectedListener() {
        return null;
    }

    @Override
    public void setOnSpinnerItemSelectedListener(@Nullable OnSpinnerItemSelectedListener<T> onSpinnerItemSelectedListener) {

    }

    @NonNull
    @Override
    public PowerSpinnerView getSpinnerView() {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void notifyItemSelected(int i) {

    }

    @Override
    public void setItems(@NonNull List<? extends T> list) {

    }
}
