package navneet.com.samplesocketconnection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.socket.client.IO;
import io.socket.client.Socket;

public class MainActivity extends AppCompatActivity {

    private Socket socket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectSocket();
    }

    private void connectSocket() {
        try {
            socket = IO.socket("http://192.168.1.2:8080");
            socket.connect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
