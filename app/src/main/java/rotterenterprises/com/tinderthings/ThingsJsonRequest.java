package rotterenterprises.com.tinderthings;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public class ThingsJsonRequest {

    public ThingsJsonRequest() {

    }

    public void initJSONRequest(final Context context) {
        String url = "http:192.168.2.116:8080/api/articles?name=PlayStation";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        //textView.setText("Response: " + response.toString());
                        //Log.i( "ThingsJSONRequest", response.toString());
                        writeJSONToFile( context, response);
                        Log.i("ThingsJSONRequest", "Successful");
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });

        MySingleton.getInstance( context).addToRequestQueue(jsonObjectRequest);
    }

    public void writeJSONToFile( Context context, JSONObject inputObject) {

        Uri uri = Uri.parse("android.resource://" + context.getPackageName() + "/" + R.raw.articles);
        //String path = "android.resource://";
        String path = uri.toString();

        InputStream is = context.getResources().openRawResource(R.raw.articles);
        Writer writer = new StringWriter();

        char[] buffer = new char[1024];

        try {
            /*FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(inputObject);
            fileOut.getFD().sync();
            objectOut.close(); */

            Reader reader = new BufferedReader( new InputStreamReader( is, "UTF-8"));
            int n;

            while ((n = reader.read(buffer)) != -1) {
                writer.write( buffer, 0, n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
