package rotterenterprises.com.tinderthings;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.swipe.SwipeCancelState;
import com.mindorks.placeholderview.annotations.swipe.SwipeIn;
import com.mindorks.placeholderview.annotations.swipe.SwipeInState;
import com.mindorks.placeholderview.annotations.swipe.SwipeOut;
import com.mindorks.placeholderview.annotations.swipe.SwipeOutState;

@NonReusable
@Layout(R.layout.article_card_view)
public class ArticleCard {

    @View(R.id.articleImageView)
    public ImageView articleImageView;

    @View(R.id.nameAgeTxt)
    public TextView nameAgeTxt;

    @View(R.id.locationNameTxt)
    public TextView locationNameTxt;

    public Article mArticle;
    public Context mContext;
    public SwipePlaceHolderView mSwipeView;

    public ArticleCard(Article mArticle, Context mContext, SwipePlaceHolderView mSwipeView) {
        this.mArticle = mArticle;
        this.mContext = mContext;
        this.mSwipeView = mSwipeView;
    }

    @Resolve
    public void onResolved() {
        Glide.with(mContext).load(mArticle.getImageUrl()).into(articleImageView);
        nameAgeTxt.setText( mArticle.getName() + ", " + mArticle.getAge());
        locationNameTxt.setText(mArticle.getLocation());
    }

    @SwipeOut
    public void onSwipedOut(){
        Log.d("EVENT", "onSwipedOut");
        mSwipeView.addView(this);
    }

    @SwipeCancelState
    public void onSwipeCancelState(){
        Log.d("EVENT", "onSwipeCancelState");
    }

    @SwipeIn
    public void onSwipeIn(){
        Log.d("EVENT", "onSwipedIn");
    }

    @SwipeInState
    public void onSwipeInState(){
        Log.d("EVENT", "onSwipeInState");
    }

    @SwipeOutState
    public void onSwipeOutState(){
        Log.d("EVENT", "onSwipeOutState");
    }
}