//package id.ac.polinema.idealbodyweight.fragment;
//
//
//import android.content.Context;
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.text.TextUtils;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import id.ac.polinema.idealbodyweight.R;
//import id.ac.polinema.idealbodyweight.util.BodyMassIndex;
//
///**
// * A simple {@link Fragment} subclass.
// */
//public class BodyMassIndexFragment extends Fragment {
//
//    private OnFragmentInteractionListener mListener;
//    public BodyMassIndexFragment() {
//        // Required empty public constructor
//    }
//
//
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_body_mass_index, container, false);
//        final EditText massText = view.findViewById(R.id.input_mass);
//        final EditText heightText = view.findViewById(R.id.input_height);
//
//        Button calculateButton = view.findViewById(R.id.button_calculate);
//        calculateButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mListener != null) {
//                    String massString = massText.getText().toString();
//                    String heightString = heightText.getText().toString();
//
//                    if (!TextUtils.isEmpty(massString) && !TextUtils.isEmpty(heightString)) {
//                        float height = Float.valueOf(heightString);
//                        float mass = Float.valueOf(massString);
//
//                        BodyMassIndex bmi = new BodyMassIndex(mass, height);
//                        mListener.onCalculateBMIClicked(bmi.getIndex(), ResultFragment.BMI_TAG);
//                    } else {
//                        Toast.makeText(getActivity(), "Please input your height and mass", Toast.LENGTH_SHORT).show();
//                    }
//
//                }
//            }
//        });
//        return view;
//    }
//
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onCalculateBMIClicked(float index, String tag);
//    }
//
//}


package id.ac.polinema.idealbodyweight.util;

class BodyMassIndex {
    private float mass;
    private float height;
    private float index;

    public BodyMassIndex(float mass, float height) {
        this.mass = mass;
        this.height = height;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        float hasil = (float) (this.mass/Math.pow(this.height, 2));
        return hasil;
    }
}
