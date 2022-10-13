//package jpabook.model.entity;
//
//import javax.persistence.*;
//
///**
// * Created by holyeye on 2014. 3. 11..
// */
//
//@Entity
//public class Item2 {
//
//    @Id @GeneratedValue
//    @Column(name = "ITEM_ID")
//    private Long id;
//
//    @OneToMany(mappedBy = "item")
//    private CategoryItem categoryItem;
//
//    private String name;        //이름
//    private int price;          //가격
//    private int stockQuantity;  //재고수량
//
//    public void setCategory(Category category){
//        if(this.categoryItem == null){
//            this.categoryItem = new CategoryItem();
//        }
//        this.categoryItem.setCategory(category);
//        this.categoryItem.setItem(this);
//        category.setCategoryItem(this.categoryItem);
//    }
//
//    //Getter, Setter
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getStockQuantity() {
//        return stockQuantity;
//    }
//
//    public void setStockQuantity(int stockQuantity) {
//        this.stockQuantity = stockQuantity;
//    }
//
//    public CategoryItem getCategoryItem() {
//        return categoryItem;
//    }
//
//    @Override
//    public String toString() {
//        return "Item{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}
