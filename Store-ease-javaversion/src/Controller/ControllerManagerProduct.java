package Controller;

import Models.Products;

import java.util.ArrayList;

public class ControllerManagerProduct {
    String category;


    //void constructor
    public ControllerManagerProduct() {

    }

    //methods for add product on storage
    public void addproduct(Products product, ArrayList<Products> productList){
        productList.add(product);
    }

    public void deleteproduct(String category, ArrayList<Products> productList){

    }

    public void findProduct(String category, ArrayList<Products> productList, String productName){

    };


    public void updateproduct(){

    }

    //add collections for manager storage products
    public ArrayList<Products> managerStore(String ProductCategory){
        //conditional for store product


        return null; //for now
    }

}
