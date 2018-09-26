package com.example.dormitantis.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context  of the app
     * @param newsList is the list of news, representing the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item_list, parent, false);
        }
        // Find the news at the given position in the list of news
        News news = getItem(position);

        // Find the TextView with view ID section_textview
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section_textview);
        // Display the section of the current news in that TextView
        sectionTextView.setText(news.getSection());
        setSectionBackgroundColor(sectionTextView);

        // Find the TextView with view ID web_textview
        TextView webTextView = (TextView) listItemView.findViewById(R.id.web_textview);
        // Display the web of the current news in that TextView
        webTextView.setText(news.getWeb());

        // Find the TextView with view ID title_textview
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_textview);
        // Display the title of the current news in that TextView
        titleTextView.setText(news.getTitle());

        // Find the TextView with view ID author_textview
        TextView authorsTextView = (TextView) listItemView.findViewById(R.id.author_textview);
        // Display the authors of the current news in that TextView
        authorsTextView.setText(news.getAuthors());

        return listItemView;
    }

    /**
     * Sets a random background gradient for the news section textview.
     *
     * @param textView the background will be chosen for
     */
    private void setSectionBackgroundColor(TextView textView) {
        int sectionBackgroundColorResourceId;
        Random random = new Random();
        int rand = random.nextInt(5);
        switch (rand) {
            case 0:
                sectionBackgroundColorResourceId = R.drawable.section_background;
                textView.setBackgroundResource(sectionBackgroundColorResourceId);
                break;
            case 1:
                sectionBackgroundColorResourceId = R.drawable.section_background_random;
                textView.setBackgroundResource(sectionBackgroundColorResourceId);
                break;
            case 2:
                sectionBackgroundColorResourceId = R.drawable.section_background_random_two;
                textView.setBackgroundResource(sectionBackgroundColorResourceId);
                break;
            case 3:
                sectionBackgroundColorResourceId = R.drawable.section_background_random_three;
                textView.setBackgroundResource(sectionBackgroundColorResourceId);
                break;
            case 4:
                sectionBackgroundColorResourceId = R.drawable.section_background_random_four;
                textView.setBackgroundResource(sectionBackgroundColorResourceId);
                break;
            default:
                sectionBackgroundColorResourceId = R.drawable.section_background_random_two;
                textView.setBackgroundResource(sectionBackgroundColorResourceId);
                break;
        }
    }
}
