package rotterenterprises.com.tinderthings;

import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.annotations.Keep;
import java.lang.Override;

@Keep
public class ArticleCard$LoadMoreViewBinder extends ArticleCard$ViewBinder implements LoadMoreCallbackBinder<ArticleCard> {
  public ArticleCard$LoadMoreViewBinder(ArticleCard resolver) {
    super(resolver);
  }

  @Override
  public void bindLoadMore(ArticleCard resolver) {
  }
}
