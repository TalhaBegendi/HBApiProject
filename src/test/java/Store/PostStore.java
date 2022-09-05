package Store;

import Request.PostClass;
import com.google.gson.Gson;
import model.RequestModel;
import java.util.List;

public class PostStore  {
    public  void PostRequesStore(Integer id, String title, String description, float price, Boolean isBasketDiscount, Integer basketDiscountPercentage, Double rating, Integer stock, Boolean isActive, String brand, String category, List<String> images)  {
        RequestModel requestModel = new RequestModel();
        requestModel.setId(id);
        requestModel.setTitle(title);
        requestModel.setDescription(description);
        requestModel.setPrice(price);
        requestModel.setBasketDiscount(isBasketDiscount);
        requestModel.setBasketDiscountPercentage(basketDiscountPercentage);
        requestModel.setRating(rating);
        requestModel.setStock(stock);
        requestModel.setActive(isActive);
        requestModel.setBrand(brand);
        requestModel.setCategory(category);
        requestModel.setImages(images);

        Gson gson = new Gson();
        String json = gson.toJson(requestModel);
        PostClass postClass = new PostClass();
        postClass.PostRequest(id,json);
    }
}
