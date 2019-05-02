package rotterenterprises.com.tinderthings;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mindorks.placeholderview.$.R;
import com.mindorks.placeholderview.ExpandableViewBinder;
import com.mindorks.placeholderview.annotations.Keep;
import java.lang.Deprecated;
import java.lang.Override;

@Keep
public class ArticleCard$ExpandableViewBinder extends ExpandableViewBinder<ArticleCard, View> {
  public ArticleCard$ExpandableViewBinder(ArticleCard resolver) {
    super(resolver, R.layout.ArticleCard, true, false, false);
  }

  @Override
  protected void resolveView(ArticleCard resolver) {
    resolver.onResolved();
  }

  @Override
  protected void recycleView() {
    ArticleCard resolver = getResolver();
  }

  @Deprecated
  @Override
  protected void unbind() {
  }

  @Deprecated
  @Override
  protected void bindAnimation(int deviceWidth, int deviceHeight, View view) {
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

  @Override
  protected void bindParentPosition(int position) {
  }

  @Override
  protected void bindChildPosition(int position) {
  }

  @Override
  protected void bindToggle(final ArticleCard resolver, View itemView) {
    itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (isExpanded()) collapse();
        else expand();
      }
    });
  }

  @Override
  protected void bindExpand(ArticleCard resolver) {
  }

  @Override
  protected void bindCollapse(ArticleCard resolver) {
  }
}
