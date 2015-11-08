package pe.ulima.edu.vetguidev3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class RegistrarVeterinariaFragment extends Fragment {

    Button butSiguiente, butCancelar, butMapa;
    EditText nombrevete, direccionvete, distritovete, telefonovete, diasinicio, diasfin, horasinicio, horasfin;
    ParseObject veterinaria;
    double latitud, longitud;

    static int UBICACION = 1000;


}
