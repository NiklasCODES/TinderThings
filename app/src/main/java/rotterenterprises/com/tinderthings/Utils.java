package rotterenterprises.com.tinderthings;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static final String TAG = "Utils";

    public static List<Article> loadArticles( Context context) {
        List<Article> articleList;
        try{

            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            JSONArray array = new JSONArray( loadJSONFromAsset( context, "articles.json"));
            articleList = new ArrayList <>();

            for(int i = 0; i< array.length(); i++) {
                Article article = gson.fromJson(array.getString(i), Article.class);
                articleList.add(article);
            }
            return articleList;
        }catch(Exception e) {
            e.printStackTrace();
            Article article = new Article();
            article.setAge(20);
            article.setImageUrl("https://data.whicdn.com/images/297153860/superthumb.jpg?t=1505421366");
            article.setLocation("Germany");
            article.setName("Lea");
            articleList = new ArrayList <>();
            articleList.add(article);
            return articleList;
        }
    }

    public static String loadJSONFromAsset( Context context, String jsonFileName) {
        String json = null;
        InputStream is = null;
        try {
            /*AssetManager manager = context.getAssets();
            Log.d( TAG, "path "+jsonFileName);
            is = manager.open(jsonFileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();*/

            Uri uri = Uri.parse("android.resource://" + context.getPackageName() + "/" + R.raw.articles);
            //String path = "android.resource://";
            String path = uri.toString();
            Log.i("Get InputStream", path + jsonFileName);

            is = context.getResources().openRawResource(R.raw.articles);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String( buffer, "UTF-8");
            Log.i("Read JSON from File", "Successfull");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return json;
    }

}
