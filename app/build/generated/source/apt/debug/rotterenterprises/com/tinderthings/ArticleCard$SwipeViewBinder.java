package rotterenterprises.com.tinderthings;

import android.widget.ImageView;
import android.widget.TextView;
import com.mindorks.placeholderview.$.R;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.SwipeViewBinder;
import com.mindorks.placeholderview.annotations.Keep;
import java.lang.Override;

@Keep
public class ArticleCard$SwipeViewBinder extends SwipeViewBinder<ArticleCard, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
  public ArticleCard$SwipeViewBinder(ArticleCard resolver) {
    super(resolver, R.layout.ArticleCard, true);
  }

  @Override
  protected void resolveView(ArticleCard resolver) {
    resolver.onResolved();
  }

  @Override
  protected void recycleView() {
    ArticleCard resolver = getResolver();
  }

  @Override
  protected void unbind() {
    ArticleCard resolver = getResolver();
    boolean nullable = isNullable();
    if (resolver != null && nullable) {
      resolver.articleImageView = null;
      resolver.nameAgeTxt = null;
      resolver.locationNameTxt = null;
      resolver.mArticle = null;
      resolver.mContext = null;
      resolver.mSwipeView = null;
      setResolver(null);
      setAnimationResolver(null);
    }
  }

  @Override
  protected void bindViewPosition(ArticleCard resolver, int position) {
  }

  @Override
  protected void bindViews(ArticleCard resolver, SwipePlaceHolderView.FrameView itemView) {
    resolver.articleImageView = (ImageView)itemView.findViewById(R.id.articleImageView);
    resolver.nameAgeTxt = (TextView)itemView.findViewById(R.id.nameAgeTxt);
    resolver.locationNameTxt = (TextView)itemView.findViewById(R.id.locationNameTxt);
  }

  @Override
  protected void bindClick(final ArticleCard resolver, SwipePlaceHolderView.FrameView itemView) {
  }

  @Override
  protected void bindLongClick(final ArticleCard resolver,
      SwipePlaceHolderView.FrameView itemView) {
  }

  @Override
  protected void bindSwipeView(SwipePlaceHolderView.FrameView itemView) {
  }

  @Override
  protected void bindSwipeIn(ArticleCard resolver) {
    resolver.onSwipeIn();
  }

  @Override
  protected void bindSwipeOut(ArticleCard resolver) {
    resolver.onSwipedOut();
  }

  @Override
  protected void bindSwipeInState() {
    getResolver().onSwipeInState();
  }

  @Override
  protected void bindSwipeOutState() {
    getResolver().onSwipeOutState();
  }

  @Override
  protected void bindSwipeCancelState() {
    getResolver().onSwipeCancelState();
  }

  @Override
  protected void bindSwipeHead(ArticleCard resolver) {
  }
}
