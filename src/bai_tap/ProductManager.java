package bai_tap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ProductManager {
    LinkedList<Product> productList;

    public ProductManager() {

        productList = new LinkedList<Product>();
    }

    public void add(Product o) {
        productList.add(o);
    }

    public void edit(int id, Product o) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(i, o);
                break;
            }
        }
    }

    public void remove(int id){
        for (int i = 0 ; i < productList.size() ; i ++ ){
            if (productList.get(i).getId() == id){
                productList.remove(i);
                break;
            }
        }
    }
    public void displayProduct(){
        for (Product p : productList){
            System.out.println(p);
        }
    }

    public void search(String keyWord){
        for (Product p : productList){
            if (p.getNameProduct().toLowerCase().contains(keyWord.toLowerCase())){
                System.out.println(p);
            }
        }
    }

    public void increaseInValue(){
        Collections.sort(productList);
    }

    public void reduceValue(){
        Collections.sort(productList,Collections.reverseOrder());
    }
}

