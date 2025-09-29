/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author sharathreddy
 */
public class Product {
    private String name;
    private int price;
    private int id;
    
    private ArrayList<Feature> features;
    
    private static int count = 0;
    
    public Product(){
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
                }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public Feature addNewFeature(Product p){
        Feature feature = new Feature(p);
        features.add(feature);
        return feature;
    }
   
    @Override
    public String toString(){
        return name;
    }
    
    
}
