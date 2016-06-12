package angelhacktaipei.project.yen.lihao;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Yan on 6/11/16.
 */
public class SelectLivingAreaFragment extends Fragment {
    private ImageView imvMap;
    private OnSelectLivingAreaListener OnSelectLivingAreaListener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_select_living_area, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view){
        imvMap = (ImageView) view.findViewById(R.id.fragment_select_living_area_imv_map);
        initListener();
    }

    private void initListener(){
        imvMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSelectLivingAreaListener.onClickLivingArea();
            }
        });
    }

    public interface OnSelectLivingAreaListener{
        void onClickLivingArea();
    }

    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            OnSelectLivingAreaListener = (OnSelectLivingAreaListener) activity;
        } catch (ClassCastException exception){
            Log.e(getActivity().getPackageName(), exception.toString());
        }
    }
}
