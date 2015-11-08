package pe.ulima.edu.vetguidev3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;

public class RegistrarDatosMascotaActivity extends AppCompatActivity {

    ImageView masc;
    Button butSiguiente, butCancelar;
    String tipoMascota, sexo, apoderado2,username,pass;
    EditText nombremascota,colormascota,razamascota,edadmascota;
    boolean esterilizada,alergica;
    RadioButton macho,hembra;
    CheckBox esteril, alergia;
    Integer edad;




}
