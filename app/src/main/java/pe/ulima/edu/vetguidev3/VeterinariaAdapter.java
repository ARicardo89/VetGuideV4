package pe.ulima.edu.vetguidev3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parse.ParseObject;

import java.util.List;


public class VeterinariaAdapter extends RecyclerView.Adapter<VeterinariaAdapter.ViewHolder> {
    private List<ParseObject> lista;


    View.OnClickListener listener;


}