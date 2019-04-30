package rotterenterprises.com.tinderthings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("id")
    @Expose
    public int id;

    @SerializedName("price")
    @Expose
    public double price;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("url")
    @Expose
    public String imageUrl;

    @SerializedName("age")
    @Expose
    public Integer age;

    @SerializedName("location")
    @Expose
    public String location;

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Integer getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }
}
