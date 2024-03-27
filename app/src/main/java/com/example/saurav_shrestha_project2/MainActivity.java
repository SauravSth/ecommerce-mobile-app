package com.example.saurav_shrestha_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/** Instructions:
 *  Home Screen with company's logo and a button
 *  After clicking button on home screen -> go to login page
 *  New user can be registered and used to login into the app
 *  Firebase backend application
 *  After login -> Product page with a list of products in card view
 *  Data should be from database
 *  Combine list with recycler view to create a card view for each item
 *  Product Details in card include -> Name, Image, Price, 1 line Description, Add to cart
 *  When user clicks on Card, they are taken to the product details page for the product
 *  Product details page include name, images*, full description, price, quantity, add to cart and go to cart
 *  User should be able to add multiple of the product to the cart
 *  When user click go to cart, they are taken to the cart page
 *  When user clicks on add to cart, the item should be added to their cart but page should not change
 *  User is able to change the quantity field and add multiple of the same item
 *  Cart page should have all the items the user added, their price and their quantity
 *  Cart page should also display price per item, quantity of the item and total cost they will be paying (inc. taxes)
 *  User should be able to remove items from cart and change quantities of items
 *  Total should change to reflect the change of quantities
 *  Cart page should have a button to go to the checkout page
 *  Checkout page has fields -> FName, Lname, email, mailAddress, phoneNo, payment options
 *  Checkout page must have a button to submit the order
 *  Once order has been placed, user should be taken to a thank you page and cart should be cleared
 *  User can then navigate back to the product page
 */