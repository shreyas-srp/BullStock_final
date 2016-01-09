package bullstock.com.bullstock;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Buy extends Fragment {

    Spinner company_list;
    public Buy() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_buy, container, false);

        company_list = (Spinner) rootview.findViewById(R.id.company_list_spinner);

        final String[] web = {
                "Google Plus",
                "Twitter",
                "Windows",
                "Bing",
                "Itunes",
                "Wordpress",
                "Drupal"
        } ;

        int[] imageId = {
                1,2,3,4,5,6,7
        } ;

        ArrayAdapter<String> spinner_adapter = new ArrayAdapter<String>(
                getContext(), android.R.layout.simple_spinner_dropdown_item, web);

        company_list.setAdapter(spinner_adapter);

        CustomList_buy adapter = new
                CustomList_buy(getActivity(), web, imageId);
        ListView list=(ListView)rootview.findViewById(R.id.list_companies);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getContext(), "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

        return rootview;
    }

}


class CustomList_buy extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;
    private final int[] imageId;
    public CustomList_buy(Activity context,
                      String[] web, int[] imageId) {
        super(context, R.layout.listview_companies, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.listview_companies, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);

        //imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
