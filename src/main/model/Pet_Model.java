package main.model;

import java.util.Date;

public class Pet_Model {
    private int id;
    private String name, age, sex, category, description, image, created_at;
   
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public String getCreatedAt() {
        return created_at;
    }
    
    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }
    
    public Pet_Model(int id, String name, String age, String sex, String category, String description, String image, String created_at){
        this.id = id;
        setName(name);
        setAge(age);
        setSex(sex);
        setCategory(category);
        setDescription(description);
        setImage(image);
        setCreatedAt(created_at);
        
    }
}
