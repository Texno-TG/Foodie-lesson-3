package air.texnodev.foodieslesson_3.models;

public class Foodie {

    private String name;
    private String desc;
    private String price;
    private int img;

    public Foodie(String name, String desc, String price, int img) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
