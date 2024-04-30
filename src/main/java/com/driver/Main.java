package com.driver;

public class Main {
    public static void main(String[]args){
        Product p = new Product();
        int ans = p.product(1,2);
        int ans1 = p.product(3,4,6);
        double ans2 = p.product(2.0,3.6);
        System.out.println(ans+" "+ans1+" "+ans2);

    }
    //class
    public static class Product{
        //method 1
        //same method but different parameters
        public int product(int x, int y) {
            return x*y;
        }
        //method 2
        public int product(int x, int y, int z) {
            return x*y;
        }
        //method 3
        public double product(double x,double y){
            return x*y;
        }
    }
}