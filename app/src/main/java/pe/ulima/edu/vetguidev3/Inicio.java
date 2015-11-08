package pe.ulima.edu.vetguidev3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;



import java.util.ArrayList;
import java.util.List;

public class Inicio extends AppCompatActivity {

    ParseQuery<ParseObject> query = ParseQuery.getQuery("Veterinaria");
    VeterinariaAdapter adapter;
    List<ParseObject> lista = new ArrayList<>();//lo cambie por un ParseObject
    String idUsuario;


}
