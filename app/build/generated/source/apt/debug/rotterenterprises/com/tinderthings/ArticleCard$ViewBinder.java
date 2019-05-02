package rotterenterprises.com.tinderthings;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mindorks.placeholderview.$.R;
import com.mindorks.placeholderview.ViewBinder;
import com.mindorks.placeholderview.annotations.Keep;
import java.lang.Override;

@Keep
public class ArticleCard$ViewBinder extends ViewBinder<ArticleCard, View> {
  public ArticleCard$ViewBinder(ArticleCard resolver) {
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
  protected void bindViews(ArticleCard resolver, View itemView) {
    resolver.articleImageView = (ImageView)itemView.findViewById(R.id.articleImageView);
    resolver.nameAgeTxt = (TextView)itemView.findViewById(R.id.nameAgeTxt);
    resolver.locationNameTxt = (TextView)itemView.findViewById(R.id.locationNameTxt);
  }

  @Override
  protected void bindClick(final ArticleCard resolver, View itemView) {
  }

  @Override
  protected void bindLongClick(final ArticleCard resolver, View itemView) {
  }
}
