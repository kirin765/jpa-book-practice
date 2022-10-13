//package jpabook.model.entity;
//
//import javax.persistence.*;
//
//@Entity
//public class Category2 {
//
//    @Id @GeneratedValue
//    private Long id;
//
//    @OneToOne
//    @JoinColumn(name = "id")
//    private Category2 parent;
//
//    private String name;
//
//    @OneToMany(mappedBy = "category")
//    private CategoryItem categoryItem;
//
//    public void setItem(Item item){
//        item.setCategory(this);
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Category2 getParent() {
//        return parent;
//    }
//
//    public void setParent(Category2 parent) {
//        this.parent = parent;
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
//    public CategoryItem getCategoryItem() {
//        return categoryItem;
//    }
//
//    public void setCategoryItem(CategoryItem categoryItem) {
//        this.categoryItem = categoryItem;
//    }
//}
